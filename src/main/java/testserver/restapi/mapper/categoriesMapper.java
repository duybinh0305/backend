package testserver.restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import testserver.restapi.model.categories;
import testserver.restapi.model.categoriesExample;

@Mapper
public interface categoriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    long countByExample(categoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    int deleteByExample(categoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    int insert(categories record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    int insertSelective(categories record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    List<categories> selectByExample(categoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    int updateByExampleSelective(@Param("record") categories record, @Param("example") categoriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categories
     *
     * @mbg.generated Sun Jun 20 12:19:10 ICT 2021
     */
    int updateByExample(@Param("record") categories record, @Param("example") categoriesExample example);
    
    List<categories> getAllCategory();
    
}