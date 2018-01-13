# @param {String} s
# @param {String} t
# @return {Boolean}
def create_hash(s)
    return_hash = Hash.new
    s.split('').each {|char|
        if return_hash.key?(char)
            return_hash[char] += 1
        else
            return_hash[char] = 1
        end
    }
    return_hash
end

def anagram_match(s, t)
   s.each do |key, value|
       if !t.key?(key)
          return false 
       elsif t[key] != value
           return false
       end
   end
    return true
end

def is_anagram(s, t)
    s_hash = create_hash(s)
    t_hash = create_hash(t)
    
    if (s_hash.length >= t_hash.length) 
        return anagram_match(s_hash, t_hash)
    end
    return anagram_match(t_hash, s_hash)
end
