package testserver.restapi.model;

public class categories {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.id_category
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    private Integer idCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.name
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.id_category
     *
     * @return the value of categories.id_category
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    public Integer getIdCategory() {
        return idCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.id_category
     *
     * @param idCategory the value for categories.id_category
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.name
     *
     * @return the value of categories.name
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.name
     *
     * @param name the value for categories.name
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    public void setName(String name) {
        this.name = name;
    }
}