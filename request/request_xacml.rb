#!/usr/bin/ruby
require 'net/http'
require 'uri'

role_org = "professor-Sakamura-Koshizuka-Lab"
url = "http://localhost:9000/access/" + role_org
params = {:command => "GET-state", :resource => "U00001C00000000000002000000063434"}

uri = URI.parse(url)
uri.query = URI.encode_www_form(params)
req = Net::HTTP::Get.new(uri)

res = Net::HTTP.new(uri.host, uri.port).start do |http|
  http.request(req)
end
if res.is_a?(Net::HTTPSuccess)
    response = JSON.parse(res.body)
    p response
    ac = {"result" => response["result"]}
  else
  ac = {"result" => "false"}
end

header = {
  'Content-Type' => "application/xml",
  'Content-Length' => request.length.to_s
}

body = {

}
