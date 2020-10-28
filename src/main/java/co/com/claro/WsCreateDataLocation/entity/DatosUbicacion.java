package co.com.claro.WsCreateDataLocation.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "DATOS_UBICACION", schema = "FRAUDE")
@Data
public class DatosUbicacion implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "TIPO_IDENTIFICACION")
  private String tipoIdentificacion;

  @Id
  @Column(name = "NUMERO_IDENTIFICACION")
  private String numeroIdentificacion;

  @Column(name = "NOMBRE_O_RAZON_SOCIAL")
  private String nombreORazonSocial;

  @Column(name = "GENERO")
  private String GENERO;

  @Column(name = "RANGO_EDAD_PROBABLE")
  private String rangoEdadProbable;

  // @Column(name = "ESTADO_IDENTIFICACION")
  // private String estadoIdentificacion;

  @Column(name = "FECHA_EXPEDICION")
  private String fechaExpedicion;

  @Column(name = "LUGAR_EXPEDICION")
  private String lugarExpedicion;

  // @Column(name = "CODIGO_CIIU")
  // private String codigoCiiu;

  // @Column(name = "ACTIVIDAD_ECONOMICA")
  // private String actividadEconomica;

  @Column(name = "UBICACION_DIRECCION_1")
  private String ubicacionDireccion1;

  @Column(name = "DIRECCION_1")
  private String direccion1;

  @Column(name = "CIUDAD_DEPARTAMENTO_1")
  private String ciudadDepartamento1;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_1")
  // private String fechaDePrimerReporte1;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_1")
  // private String fechaDeUltimoReporte1;

  // @Column(name = "GRUPO_1")
  // private String grupo1;

  // @Column(name = "PRODCUTO_ACTIVO_1")
  // private String prodcutoActivo1;

  // @Column(name = "NO_REPORTES_1")
  // private String noReportes1;

  @Column(name = "UBICACION_DIRECCION_2")
  private String ubicacionDireccion2;

  @Column(name = "DIRECCION_2")
  private String direccion2;

  @Column(name = "CIUDAD_DEPARTAMENTO_2")
  private String ciudadDepartamento2;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_2")
  // private String fechaDePrimerReporte2;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_2")
  // private String fechaDeUltimoReporte2;

  // @Column(name = "GRUPO_2")
  // private String grupo2;

  // @Column(name = "PRODCUTO_ACTIVO_2")
  // private String prodcutoActivo2;

  // @Column(name = "NO_REPORTES_2")
  // private String noReportes2;

  @Column(name = "UBICACION_DIRECCION_3")
  private String ubicacionDireccion3;

  @Column(name = "DIRECCION_3")
  private String direccion3;

  @Column(name = "CIUDAD_DEPARTAMENTO_3")
  private String ciudadDepartamento3;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_3")
  // private String fechaDePrimerReporte3;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_3")
  // private String fechaDeUltimoReporte3;

  // @Column(name = "GRUPO_3")
  // private String grupo3;

  // @Column(name = "PRODCUTO_ACTIVO_3")
  // private String prodcutoActivo3;

  // @Column(name = "NO_REPORTES_3")
  // private String noReportes3;

  // @Column(name = "UBICACION_DIRECCION_4")
  // private String ubicacionDireccion4;

  // @Column(name = "DIRECCION_4")
  // private String direccion4;

  // @Column(name = "CIUDAD_DEPARTAMENTO_4")
  // private String ciudadDepartamento4;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_4")
  // private String fechaDePrimerReporte4;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_4")
  // private String fechaDeUltimoReporte4;

  // @Column(name = "GRUPO_4")
  // private String grupo4;

  // @Column(name = "PRODCUTO_ACTIVO_4")
  // private String prodcutoActivo4;

  // @Column(name = "NO_REPORTES_4")
  // private String noReportes4;

  // @Column(name = "UBICACION_DIRECCION_5")
  // private String ubicacionDireccion5;

  // @Column(name = "DIRECCION_5")
  // private String direccion5;

  // @Column(name = "CIUDAD_DEPARTAMENTO_5")
  // private String ciudadDepartamento5;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_5")
  // private String fechaDePrimerReporte5;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_5")
  // private String fechaDeUltimoReporte5;

  // @Column(name = "GRUPO_5")
  // private String grupo5;

  // @Column(name = "PRODCUTO_ACTIVO_5")
  // private String prodcutoActivo5;

  // @Column(name = "NO_REPORTES_5")
  // private String noReportes5;

  // @Column(name = "UBICACION_DIRECCION_6")
  // private String ubicacionDireccion6;

  // @Column(name = "DIRECCION_6")
  // private String direccion6;

  // @Column(name = "CIUDAD_DEPARTAMENTO_6")
  // private String ciudadDepartamento6;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_6")
  // private String fechaDePrimerReporte6;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_6")
  // private String fechaDeUltimoReporte6;

  // @Column(name = "GRUPO_6")
  // private String grupo6;

  // @Column(name = "PRODCUTO_ACTIVO_6")
  // private String prodcutoActivo6;

  // @Column(name = "NO_REPORTES_6")
  // private String noReportes6;

  // @Column(name = "UBICACION_DIRECCION_7")
  // private String ubicacionDireccion7;

  // @Column(name = "DIRECCION_7")
  // private String direccion7;

  // @Column(name = "CIUDAD_DEPARTAMENTO_7")
  // private String ciudadDepartamento7;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_7")
  // private String fechaDePrimerReporte7;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_7")
  // private String fechaDeUltimoReporte7;

  // @Column(name = "GRUPO_7")
  // private String grupo7;

  // @Column(name = "PRODCUTO_ACTIVO_7")
  // private String prodcutoActivo7;

  // @Column(name = "NO_REPORTES_7")
  // private String noReportes7;

  // @Column(name = "UBICACION_DIRECCION_8")
  // private String ubicacionDireccion8;

  // @Column(name = "DIRECCION_8")
  // private String direccion8;

  // @Column(name = "CIUDAD_DEPARTAMENTO_8")
  // private String ciudadDepartamento8;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_8")
  // private String fechaDePrimerReporte8;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_8")
  // private String fechaDeUltimoReporte8;

  // @Column(name = "GRUPO_8")
  // private String grupo8;

  // @Column(name = "PRODCUTO_ACTIVO_8")
  // private String prodcutoActivo8;

  // @Column(name = "NO_REPORTES_8")
  // private String noReportes8;

  // @Column(name = "UBICACION_DIRECCION_9")
  // private String ubicacionDireccion9;

  // @Column(name = "DIRECCION_9")
  // private String direccion9;

  // @Column(name = "CIUDAD_DEPARTAMENTO_9")
  // private String ciudadDepartamento9;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_9")
  // private String fechaDePrimerReporte9;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_9")
  // private String fechaDeUltimoReporte9;

  // @Column(name = "GRUPO_9")
  // private String grupo9;

  // @Column(name = "PRODCUTO_ACTIVO_9")
  // private String prodcutoActivo9;

  // @Column(name = "NO_REPORTES_9")
  // private String noReportes9;

  // @Column(name = "UBICACION_DIRECCION_10")
  // private String ubicacionDireccion10;

  // @Column(name = "DIRECCION_10")
  // private String direccion10;

  // @Column(name = "CIUDAD_DEPARTAMENTO_10")
  // private String ciudadDepartamento10;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_10")
  // private String fechaDePrimerReporte10;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_10")
  // private String fechaDeUltimoReporte10;

  // @Column(name = "GRUPO_10")
  // private String grupo10;

  // @Column(name = "PRODCUTO_ACTIVO_10")
  // private String prodcutoActivo10;

  // @Column(name = "NO_REPORTES_10")
  // private String noReportes10;

  // @Column(name = "UBICACION_TELEFONO_11")
  // private String ubicacionTelefono11;

  // @Column(name = "PREFIJO_11")
  // private String prefijo11;

  @Column(name = "TELEFONO_11")
  private String telefono11;

  // @Column(name = "CIUDAD_DEPARTAMENTO11")
  // private String ciudadDepartamento11;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_11")
  // private String fechaDePrimerReporte11;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_11")
  // private String fechaDeUltimoReporte11;

  // @Column(name = "GRUPO_11")
  // private String grupo11;

  // @Column(name = "PRODCUTO_ACTIVO_11")
  // private String prodcutoActivo11;

  // @Column(name = "NO_REPORTES_11")
  // private String noReportes11;

  // @Column(name = "UBICACION_TELEFONO_12")
  // private String ubicacionTelefono12;

  // @Column(name = "PREFIJO_12")
  // private String prefijo12;

  @Column(name = "TELEFONO_12")
  private String telefono12;

  // @Column(name = "CIUDAD_DEPARTAMENTO12")
  // private String ciudadDepartamento12;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_12")
  // private String fechaDePrimerReporte12;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_12")
  // private String fechaDeUltimoReporte12;

  // @Column(name = "GRUPO_12")
  // private String grupo12;

  // @Column(name = "PRODCUTO_ACTIVO_12")
  // private String prodcutoActivo12;

  // @Column(name = "NO_REPORTES_12")
  // private String noReportes12;

  // @Column(name = "UBICACION_TELEFONO_13")
  // private String ubicacionTelefono13;

  // @Column(name = "PREFIJO_13")
  // private String prefijo13;

  @Column(name = "TELEFONO_13")
  private String telefono13;

  // @Column(name = "CIUDAD_DEPARTAMENTO13")
  // private String ciudadDepartamento13;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_13")
  // private String fechaDePrimerReporte13;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_13")
  // private String fechaDeUltimoReporte13;

  // @Column(name = "GRUPO_13")
  // private String grupo13;

  // @Column(name = "PRODCUTO_ACTIVO_13")
  // private String prodcutoActivo13;

  // @Column(name = "NO_REPORTES_13")
  // private String noReportes13;

  // @Column(name = "UBICACION_TELEFONO_14")
  // private String ubicacionTelefono14;

  // @Column(name = "PREFIJO_14")
  // private String prefijo14;

  // @Column(name = "TELEFONO_14")
  // private String telefono14;

  // @Column(name = "CIUDAD_DEPARTAMENTO14")
  // private String ciudadDepartamento14;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_14")
  // private String fechaDePrimerReporte14;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_14")
  // private String fechaDeUltimoReporte14;

  // @Column(name = "GRUPO_14")
  // private String grupo14;

  // @Column(name = "PRODCUTO_ACTIVO_14")
  // private String prodcutoActivo14;

  // @Column(name = "NO_REPORTES_14")
  // private String noReportes14;

  // @Column(name = "UBICACION_TELEFONO_15")
  // private String ubicacionTelefono15;

  // @Column(name = "PREFIJO_15")
  // private String prefijo15;

  // @Column(name = "TELEFONO_15")
  // private String telefono15;

  // @Column(name = "CIUDAD_DEPARTAMENTO15")
  // private String ciudadDepartamento15;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_15")
  // private String fechaDePrimerReporte15;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_15")
  // private String fechaDeUltimoReporte15;

  // @Column(name = "GRUPO_15")
  // private String grupo15;

  // @Column(name = "PRODCUTO_ACTIVO_15")
  // private String prodcutoActivo15;

  // @Column(name = "NO_REPORTES_15")
  // private String noReportes15;

  // @Column(name = "UBICACION_TELEFONO_16")
  // private String ubicacionTelefono16;

  // @Column(name = "PREFIJO_16")
  // private String prefijo16;

  // @Column(name = "TELEFONO_16")
  // private String telefono16;

  // @Column(name = "CIUDAD_DEPARTAMENTO16")
  // private String ciudadDepartamento16;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_16")
  // private String fechaDePrimerReporte16;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_16")
  // private String fechaDeUltimoReporte16;

  // @Column(name = "GRUPO_16")
  // private String grupo16;

  // @Column(name = "PRODCUTO_ACTIVO_16")
  // private String prodcutoActivo16;

  // @Column(name = "NO_REPORTES_16")
  // private String noReportes16;

  // @Column(name = "UBICACION_TELEFONO_17")
  // private String ubicacionTelefono17;

  // @Column(name = "PREFIJO_17")
  // private String prefijo17;

  // @Column(name = "TELEFONO_17")
  // private String telefono17;

  // @Column(name = "CIUDAD_DEPARTAMENTO17")
  // private String ciudadDepartamento17;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_17")
  // private String fechaDePrimerReporte17;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_17")
  // private String fechaDeUltimoReporte17;

  // @Column(name = "GRUPO_17")
  // private String grupo17;

  // @Column(name = "PRODCUTO_ACTIVO_17")
  // private String prodcutoActivo17;

  // @Column(name = "NO_REPORTES_17")
  // private String noReportes17;

  // @Column(name = "UBICACION_TELEFONO_18")
  // private String ubicacionTelefono18;

  // @Column(name = "PREFIJO_18")
  // private String prefijo18;

  // @Column(name = "TELEFONO_18")
  // private String telefono18;

  // @Column(name = "CIUDAD_DEPARTAMENTO18")
  // private String ciudadDepartamento18;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_18")
  // private String fechaDePrimerReporte18;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_18")
  // private String fechaDeUltimoReporte18;

  // @Column(name = "GRUPO_18")
  // private String grupo18;

  // @Column(name = "PRODCUTO_ACTIVO_18")
  // private String prodcutoActivo18;

  // @Column(name = "NO_REPORTES_18")
  // private String noReportes18;

  // @Column(name = "UBICACION_TELEFONO_19")
  // private String ubicacionTelefono19;

  // @Column(name = "PREFIJO_19")
  // private String prefijo19;

  // @Column(name = "TELEFONO_19")
  // private String telefono19;

  // @Column(name = "CIUDAD_DEPARTAMENTO19")
  // private String ciudadDepartamento19;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_19")
  // private String fechaDePrimerReporte19;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_19")
  // private String fechaDeUltimoReporte19;

  // @Column(name = "GRUPO_19")
  // private String grupo19;

  // @Column(name = "PRODCUTO_ACTIVO_19")
  // private String prodcutoActivo19;

  // @Column(name = "NO_REPORTES_19")
  // private String noReportes19;

  // @Column(name = "UBICACION_TELEFONO_20")
  // private String ubicacionTelefono20;

  // @Column(name = "PREFIJO_20")
  // private String prefijo20;

  // @Column(name = "TELEFONO_20")
  // private String telefono20;

  // @Column(name = "CIUDAD_DEPARTAMENTO20")
  // private String ciudadDepartamento20;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_20")
  // private String fechaDePrimerReporte20;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_20")
  // private String fechaDeUltimoReporte20;

  // @Column(name = "GRUPO_20")
  // private String grupo20;

  // @Column(name = "PRODCUTO_ACTIVO_20")
  // private String prodcutoActivo20;

  // @Column(name = "NO_REPORTES_20")
  // private String noReportes20;

  @Column(name = "CELULAR_21")
  private String celular21;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_21")
  // private String fechaDePrimerReporte21;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_21")
  // private String fechaDeUltimoReporte21;

  // @Column(name = "GRUPO_21")
  // private String grupo21;

  // @Column(name = "PRODCUTO_ACTIVO_21")
  // private String prodcutoActivo21;

  // @Column(name = "NO_REPORTES_21")
  // private String noReportes21;

  @Column(name = "CELULAR_22")
  private String celular22;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_22")
  // private String fechaDePrimerReporte22;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_22")
  // private String fechaDeUltimoReporte22;

  // @Column(name = "GRUPO_22")
  // private String grupo22;

  // @Column(name = "PRODCUTO_ACTIVO_22")
  // private String prodcutoActivo22;

  // @Column(name = "NO_REPORTES_22")
  // private String noReportes22;

  @Column(name = "CELULAR_23")
  private String celular23;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_23")
  // private String fechaDePrimerReporte23;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_23")
  // private String fechaDeUltimoReporte23;

  // @Column(name = "GRUPO_23")
  // private String grupo23;

  // @Column(name = "PRODCUTO_ACTIVO_23")
  // private String prodcutoActivo23;

  // @Column(name = "NO_REPORTES_23")
  // private String noReportes23;

  // @Column(name = "CELULAR_24")
  // private String celular24;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_24")
  // private String fechaDePrimerReporte24;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_24")
  // private String fechaDeUltimoReporte24;

  // @Column(name = "GRUPO_24")
  // private String grupo24;

  // @Column(name = "PRODCUTO_ACTIVO_24")
  // private String prodcutoActivo24;

  // @Column(name = "NO_REPORTES_24")
  // private String noReportes24;

  // @Column(name = "CELULAR_25")
  // private String celular25;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_25")
  // private String fechaDePrimerReporte25;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_25")
  // private String fechaDeUltimoReporte25;

  // @Column(name = "GRUPO_25")
  // private String grupo25;

  // @Column(name = "PRODCUTO_ACTIVO_25")
  // private String prodcutoActivo25;

  // @Column(name = "NO_REPORTES_25")
  // private String noReportes25;

  // @Column(name = "CELULAR_26")
  // private String celular26;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_26")
  // private String fechaDePrimerReporte26;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_26")
  // private String fechaDeUltimoReporte26;

  // @Column(name = "GRUPO_26")
  // private String grupo26;

  // @Column(name = "PRODCUTO_ACTIVO_26")
  // private String prodcutoActivo26;

  // @Column(name = "NO_REPORTES_26")
  // private String noReportes26;

  // @Column(name = "CELULAR_27")
  // private String celular27;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_27")
  // private String fechaDePrimerReporte27;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_27")
  // private String fechaDeUltimoReporte27;

  // @Column(name = "GRUPO_27")
  // private String grupo27;

  // @Column(name = "PRODCUTO_ACTIVO_27")
  // private String prodcutoActivo27;

  // @Column(name = "NO_REPORTES_27")
  // private String noReportes27;

  // @Column(name = "CELULAR_28")
  // private String celular28;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_28")
  // private String fechaDePrimerReporte28;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_28")
  // private String fechaDeUltimoReporte28;

  // @Column(name = "GRUPO_28")
  // private String grupo28;

  // @Column(name = "PRODCUTO_ACTIVO_28")
  // private String prodcutoActivo28;

  // @Column(name = "NO_REPORTES_28")
  // private String noReportes28;

  // @Column(name = "CELULAR_29")
  // private String celular29;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_29")
  // private String fechaDePrimerReporte29;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_29")
  // private String fechaDeUltimoReporte29;

  // @Column(name = "GRUPO_29")
  // private String grupo29;

  // @Column(name = "PRODCUTO_ACTIVO_29")
  // private String prodcutoActivo29;

  // @Column(name = "NO_REPORTES_29")
  // private String noReportes29;

  // @Column(name = "CELULAR_30")
  // private String celular30;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_30")
  // private String fechaDePrimerReporte30;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_30")
  // private String fechaDeUltimoReporte30;

  // @Column(name = "GRUPO_30")
  // private String grupo30;

  // @Column(name = "PRODCUTO_ACTIVO_30")
  // private String prodcutoActivo30;

  // @Column(name = "NO_REPORTES_30")
  // private String noReportes30;

  @Column(name = "CORREO_31")
  private String correo31;

  // @Column(name = "NO_REPORTES_31")
  // private String noReportes31;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_31")
  // private String fechaDePrimerReporte31;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_31")
  // private String fechaDeUltimoReporte31;

  @Column(name = "CORREO_32")
  private String correo32;

  // @Column(name = "NO_REPORTES_32")
  // private String noReportes32;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_32")
  // private String fechaDePrimerReporte32;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_32")
  // private String fechaDeUltimoReporte32;

  @Column(name = "CORREO_33")
  private String correo33;

  // @Column(name = "NO_REPORTES_33")
  // private String noReportes33;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_33")
  // private String fechaDePrimerReporte33;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_33")
  // private String fechaDeUltimoReporte33;

  // @Column(name = "CORREO_34")
  // private String correo34;

  // @Column(name = "NO_REPORTES_34")
  // private String noReportes34;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_34")
  // private String fechaDePrimerReporte34;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_34")
  // private String fechaDeUltimoReporte34;

  // @Column(name = "CORREO_35")
  // private String correo35;

  // @Column(name = "NO_REPORTES_35")
  // private String noReportes35;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_35")
  // private String fechaDePrimerReporte35;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_35")
  // private String fechaDeUltimoReporte35;

  // @Column(name = "CORREO_36")
  // private String correo36;

  // @Column(name = "NO_REPORTES_36")
  // private String noReportes36;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_36")
  // private String fechaDePrimerReporte36;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_36")
  // private String fechaDeUltimoReporte36;

  // @Column(name = "CORREO_37")
  // private String correo37;

  // @Column(name = "NO_REPORTES_37")
  // private String noReportes37;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_37")
  // private String fechaDePrimerReporte37;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_37")
  // private String fechaDeUltimoReporte37;

  // @Column(name = "CORREO_38")
  // private String correo38;

  // @Column(name = "NO_REPORTES_38")
  // private String noReportes38;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_38")
  // private String fechaDePrimerReporte38;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_38")
  // private String fechaDeUltimoReporte38;

  // @Column(name = "CORREO_39")
  // private String correo39;

  // @Column(name = "NO_REPORTES_39")
  // private String noReportes39;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_39")
  // private String fechaDePrimerReporte39;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_39")
  // private String fechaDeUltimoReporte39;

  // @Column(name = "CORREO_40")
  // private String correo40;

  // @Column(name = "NO_REPORTES_40")
  // private String noReportes40;

  // @Column(name = "FECHA_DE_PRIMER_REPORTE_40")
  // private String fechaDePrimerReporte40;

  // @Column(name = "FECHA_DE_ULTIMO_REPORTE_40")
  // private String fechaDeUltimoReporte40;

  @Column(name = "FECHA_CARGUE")
  private Timestamp fechaCargue;

  public String getTipoIdentificacion() {
    return tipoIdentificacion;
  }

  public void setTipoIdentificacion(String tipoIdentificacion) {
    this.tipoIdentificacion = tipoIdentificacion;
  }

  public String getNumeroIdentificacion() {
    return numeroIdentificacion;
  }

  public void setNumeroIdentificacion(String numeroIdentificacion) {
    this.numeroIdentificacion = numeroIdentificacion;
  }
}
