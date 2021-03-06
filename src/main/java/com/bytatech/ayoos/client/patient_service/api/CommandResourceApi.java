/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.patient_service.api;

import com.bytatech.ayoos.client.patient_service.model.AddressLineDTO;
import com.bytatech.ayoos.client.patient_service.model.PatientDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-15T11:46:55.747+05:30[Asia/Kolkata]")

@Api(value = "CommandResource", description = "the CommandResource API")
public interface CommandResourceApi {

    @ApiOperation(value = "createAddressLine", nickname = "createAddressLineUsingPOST1", notes = "", response = AddressLineDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/address-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<AddressLineDTO> createAddressLineUsingPOST1(@ApiParam(value = "addressLineDTO" ,required=true )  @Valid @RequestBody AddressLineDTO addressLineDTO);


    @ApiOperation(value = "createPatient", nickname = "createPatientUsingPOST", notes = "", response = PatientDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PatientDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/patients",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PatientDTO> createPatientUsingPOST(@ApiParam(value = "patientDTO" ,required=true )  @Valid @RequestBody PatientDTO patientDTO);


    @ApiOperation(value = "updateAddressLine", nickname = "updateAddressLineUsingPUT1", notes = "", response = AddressLineDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AddressLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/address-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<AddressLineDTO> updateAddressLineUsingPUT1(@ApiParam(value = "addressLineDTO" ,required=true )  @Valid @RequestBody AddressLineDTO addressLineDTO);


    @ApiOperation(value = "updatePatient", nickname = "updatePatientUsingPUT", notes = "", response = PatientDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PatientDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/patients",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<PatientDTO> updatePatientUsingPUT(@ApiParam(value = "patientDTO" ,required=true )  @Valid @RequestBody PatientDTO patientDTO);

}
