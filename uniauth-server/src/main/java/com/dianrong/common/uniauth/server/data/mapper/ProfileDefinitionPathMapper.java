package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.ProfileDefinitionPath;
import com.dianrong.common.uniauth.server.data.entity.ProfileDefinitionPathExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface ProfileDefinitionPathMapper {
  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int countByExample(ProfileDefinitionPathExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int deleteByExample(ProfileDefinitionPathExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int deleteByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int insert(ProfileDefinitionPath record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int insertSelective(ProfileDefinitionPath record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  List<ProfileDefinitionPath> selectByExample(ProfileDefinitionPathExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  ProfileDefinitionPath selectByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int updateByExampleSelective(@Param("record") ProfileDefinitionPath record,
      @Param("example") ProfileDefinitionPathExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int updateByExample(@Param("record") ProfileDefinitionPath record,
      @Param("example") ProfileDefinitionPathExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int updateByPrimaryKeySelective(ProfileDefinitionPath record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * profile_definition_path
   *
   * @mbggenerated Tue Jun 27 15:11:20 CST 2017
   */
  int updateByPrimaryKey(ProfileDefinitionPath record);

  /**
   * 返回与profileId关联的profile definition path信息列表, 以profileId做升序排列.
   */
  List<ProfileDefinitionPath> queryConcernedProfilePathInfo(@Param("profileId") Long profileId, @Param("subProfileIds") List<Long> subProfileIds);
  
  int batchInsert(List<ProfileDefinitionPath> profileDefinitionPaths);

  List<ProfileDefinitionPath> getProfileTreeLinks(Long profileId);

  List<Long> querySubProfileId(Set<Long> profileIds);

  int dropRelationByProfileId(Long profileId);
}
