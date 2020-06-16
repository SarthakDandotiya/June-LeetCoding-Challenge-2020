// Question:
// Validate IP Address
// cba

import java.util.regex.*;

class Solution {
    public String validIPAddress(String ip) {
        if (checkIpv4(ip)) {
            return "IPv4";
        } else if (checkIpv6(ip)) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }

    private boolean checkIpv4(String ip) {
        String ip4Pattern = "(2(5[0-5]|[0-4][0-9])|1[0-9]{1,2}|[1-9]?[0-9])";
        Pattern ipv4Pattern = Pattern.compile("^(" + ip4Pattern + "[.]){3}" + ip4Pattern + "$");
        return ipv4Pattern.matcher(ip).matches();
    }

    private boolean checkIpv6(String ip) {
        String ip6Pattern = "[0-9a-fA-F]{1,4}";
        Pattern ipv6Pattern = Pattern.compile("^(" + ip6Pattern + "[:]){7}" + ip6Pattern + "$");
        return ipv6Pattern.matcher(ip).matches();
    }
}