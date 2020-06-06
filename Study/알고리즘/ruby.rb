a, b = gets.split
a = a.to_i
b = b.to_i
if(a > b)
  puts ">"
elsif (b > a)
  puts "<"
else 
  puts "=="
end
