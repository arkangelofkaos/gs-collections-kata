package com.gs.collections.kata;

import com.gs.collections.api.block.predicate.Predicate;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.test.Verify;
import org.junit.Assert;
import org.junit.Test;

public class Exercise3Test extends CompanyDomainForKata
{
    /**
     * Set up a {@link Predicate} that tests to see if a {@link Customer}'s city is "London"
     */
    private static final Predicate<Customer> CUSTOMER_FROM_LONDON = null;

    /**
     * Do any customers come from London? Use the Predicate {@link #CUSTOMER_FROM_LONDON}.
     */
    @Test
    public void doAnyCustomersLiveInLondon()
    {
        boolean anyCustomersFromLondon = false;
        Assert.assertTrue(anyCustomersFromLondon);
    }

    /**
     * Do all customers come from London? Use the Predicate {@link #CUSTOMER_FROM_LONDON}.
     */
    @Test
    public void doAllCustomersLiveInLondon()
    {
        boolean allCustomersFromLondon = true;
        Assert.assertFalse(allCustomersFromLondon);
    }

    /**
     * How many customers come from London? Use the Predicate {@link #CUSTOMER_FROM_LONDON}.
     */
    @Test
    public void howManyCustomersLiveInLondon()
    {
        int numberOfCustomerFromLondon = 0;
        Assert.assertEquals("Should be 2 London customers", 2, numberOfCustomerFromLondon);
    }

    /**
     * Which customers come from London? Get a collection of those which do. Use the Predicate {@link
     * #CUSTOMER_FROM_LONDON}.
     */
    @Test
    public void getLondonCustomers()
    {
        MutableList<Customer> customersFromLondon = null;
        Verify.assertSize("Should be 2 London customers", 2, customersFromLondon);
    }

    /**
     * Which customers do not come from London? Get a collection of those which don't. Use the Predicate {@link
     * #CUSTOMER_FROM_LONDON}.
     */
    @Test
    public void getCustomersWhoDontLiveInLondon()
    {
        MutableList<Customer> customersNotFromLondon = null;
        Verify.assertSize("customers not from London", 1, customersNotFromLondon);
    }

    /**
     * Implement {@link Company#getCustomerNamed(String)} and get this test to pass.
     */
    @Test
    public void findMary()
    {
        Customer mary = this.company.getCustomerNamed("Mary");
        Assert.assertEquals("customer's name should be Mary", "Mary", mary.getName());
    }

    /**
     * Implement {@link Company#getCustomerNamed(String)} and get this test to pass.
     */
    @Test
    public void findPete()
    {
        Customer pete = this.company.getCustomerNamed("Pete");
        Assert.assertNull(
                "Should be null as there is no customer called Pete",
                pete);
    }
}