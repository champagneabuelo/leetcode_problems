# @param {Integer[]} digits
# @return {Integer[]}
def plus_one(digits)
    convertedInt = digits.join.to_i
    
    plusOne = convertedInt + 1
    
    return plusOne.digits.reverse
end
