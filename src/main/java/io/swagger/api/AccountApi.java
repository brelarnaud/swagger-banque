/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Operation;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-28T08:27:01.906Z")

@Api(value = "Account", description = "the Account API")
public interface AccountApi {

    @ApiOperation(value = "Finds Account by ID", nickname = "findAccountbyID", notes = "Multiple status values can be provided with comma separated strings", response = Operation.class, responseContainer = "List", tags={ "Account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Operation.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "le compte n'existe pas") })
    @RequestMapping(value = "/Account/Operation",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Operation>> findAccountbyID(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true) @Valid @RequestParam(value = "ID", required = true) String ID);

}