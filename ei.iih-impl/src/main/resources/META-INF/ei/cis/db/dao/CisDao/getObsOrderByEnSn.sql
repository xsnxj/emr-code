SELECT 
   order_id,
  code,
  negation_ind,
  text,
  status_code,
  effect_time_b,
  effect_time_e,
  uncertain_code,
  method_code,
  target_site,
  freq_code,
  author,
  aut_time,
  data_enter,
  enter_time,
  verifier,
  verify_time,
  informant,
  info_time,
  resp_party,
  resp_time,
  order_type,
  manul_id,
  severity_id,
  occr_location,
  enc_id,
  priority_code,
  parent_order_id,
  def_id,
  req_status,
  order_sn,
  exec_unit,
  mr_summary,
  obs_dx_id,
  req_table_code,
  req_obj_index,
  report_no,
  charge_no,
  emg_flag,
  sample_code,
  amount,
  ward_sn,
  his_apply_no,
  exam_date,
  report_date,
  sample_id,
  info_flag,
  appo_location,
  appo_time,
  pay_self,
  charge_status,
  report_mark,
  patient_id,
  free_fee_flag,
  check_type,
  bound_id
  FROM obs_order
 WHERE enc_id = /*enPk*/'2298012'
   AND order_type = 0