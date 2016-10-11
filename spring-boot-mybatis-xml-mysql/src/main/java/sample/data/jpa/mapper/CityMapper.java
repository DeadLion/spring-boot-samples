package sample.data.jpa.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sample.data.jpa.domain.City;

/**
 * Created by admin on 2016/10/11.
 */
@Mapper
public interface CityMapper {

    City findByName(@Param("name") String name);
}
