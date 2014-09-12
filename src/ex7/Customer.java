package src.ex7;

/**
 * The Discount System: Customer.
 */
public class Customer
{
    private String  name;
    private boolean member = false;
    private String  memberType;
    
    public Customer(String name)
    {
       this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isMember() {
        return member;
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String getMemberType() {
        return memberType;
    }
    
    public void setMemberType(String type) {
        memberType = type;
    }
    
    public String toString() {
        return String.format("Customer %1$s %2$s member."
                            , name, (member ? "is the "+memberType : "is not a"));
    }
}
