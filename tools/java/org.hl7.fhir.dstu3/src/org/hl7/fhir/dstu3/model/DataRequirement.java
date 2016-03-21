package org.hl7.fhir.dstu3.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Mar 21, 2016 11:55+1100 for FHIR v1.3.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.dstu3.exceptions.FHIRException;
/**
 * Describes a required data item for evaluation in terms of the type of data, and optional code- or date-based filters of the data.
 */
@DatatypeDef(name="DataRequirement")
public class DataRequirement extends Type implements ICompositeType {

    @Block()
    public static class DataRequirementCodeFilterComponent extends Element implements IBaseDatatypeElement {
        /**
         * The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
         */
        @Child(name = "path", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The code-valued attribute of the filter", formalDefinition="The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept." )
        protected StringType path;

        /**
         * The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
         */
        @Child(name = "valueSet", type = {StringType.class, ValueSet.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The valueset for the code filter", formalDefinition="The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset." )
        protected Type valueSet;

        /**
         * The codeable concept for the code filter. Only one of valueSet or codeableConcept may be specified. If codeableConcepts are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codeable concepts.
         */
        @Child(name = "codeableConcept", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="The codeableConcepts for the filter", formalDefinition="The codeable concept for the code filter. Only one of valueSet or codeableConcept may be specified. If codeableConcepts are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codeable concepts." )
        protected List<CodeableConcept> codeableConcept;

        private static final long serialVersionUID = -666343535L;

    /**
     * Constructor
     */
      public DataRequirementCodeFilterComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DataRequirementCodeFilterComponent(StringType path) {
        super();
        this.path = path;
      }

        /**
         * @return {@link #path} (The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public StringType getPathElement() { 
          if (this.path == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DataRequirementCodeFilterComponent.path");
            else if (Configuration.doAutoCreate())
              this.path = new StringType(); // bb
          return this.path;
        }

        public boolean hasPathElement() { 
          return this.path != null && !this.path.isEmpty();
        }

        public boolean hasPath() { 
          return this.path != null && !this.path.isEmpty();
        }

        /**
         * @param value {@link #path} (The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public DataRequirementCodeFilterComponent setPathElement(StringType value) { 
          this.path = value;
          return this;
        }

        /**
         * @return The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
         */
        public String getPath() { 
          return this.path == null ? null : this.path.getValue();
        }

        /**
         * @param value The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
         */
        public DataRequirementCodeFilterComponent setPath(String value) { 
            if (this.path == null)
              this.path = new StringType();
            this.path.setValue(value);
          return this;
        }

        /**
         * @return {@link #valueSet} (The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public Type getValueSet() { 
          return this.valueSet;
        }

        /**
         * @return {@link #valueSet} (The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public StringType getValueSetStringType() throws FHIRException { 
          if (!(this.valueSet instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.valueSet.getClass().getName()+" was encountered");
          return (StringType) this.valueSet;
        }

        public boolean hasValueSetStringType() { 
          return this.valueSet instanceof StringType;
        }

        /**
         * @return {@link #valueSet} (The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public Reference getValueSetReference() throws FHIRException { 
          if (!(this.valueSet instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.valueSet.getClass().getName()+" was encountered");
          return (Reference) this.valueSet;
        }

        public boolean hasValueSetReference() { 
          return this.valueSet instanceof Reference;
        }

        public boolean hasValueSet() { 
          return this.valueSet != null && !this.valueSet.isEmpty();
        }

        /**
         * @param value {@link #valueSet} (The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public DataRequirementCodeFilterComponent setValueSet(Type value) { 
          this.valueSet = value;
          return this;
        }

        /**
         * @return {@link #codeableConcept} (The codeable concept for the code filter. Only one of valueSet or codeableConcept may be specified. If codeableConcepts are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codeable concepts.)
         */
        public List<CodeableConcept> getCodeableConcept() { 
          if (this.codeableConcept == null)
            this.codeableConcept = new ArrayList<CodeableConcept>();
          return this.codeableConcept;
        }

        public boolean hasCodeableConcept() { 
          if (this.codeableConcept == null)
            return false;
          for (CodeableConcept item : this.codeableConcept)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #codeableConcept} (The codeable concept for the code filter. Only one of valueSet or codeableConcept may be specified. If codeableConcepts are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codeable concepts.)
         */
    // syntactic sugar
        public CodeableConcept addCodeableConcept() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.codeableConcept == null)
            this.codeableConcept = new ArrayList<CodeableConcept>();
          this.codeableConcept.add(t);
          return t;
        }

    // syntactic sugar
        public DataRequirementCodeFilterComponent addCodeableConcept(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.codeableConcept == null)
            this.codeableConcept = new ArrayList<CodeableConcept>();
          this.codeableConcept.add(t);
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("path", "string", "The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.", 0, java.lang.Integer.MAX_VALUE, path));
          childrenList.add(new Property("valueSet[x]", "string|Reference(ValueSet)", "The valueset for the code filter. The valueSet or codeableConcept elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.", 0, java.lang.Integer.MAX_VALUE, valueSet));
          childrenList.add(new Property("codeableConcept", "CodeableConcept", "The codeable concept for the code filter. Only one of valueSet or codeableConcept may be specified. If codeableConcepts are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codeable concepts.", 0, java.lang.Integer.MAX_VALUE, codeableConcept));
        }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("path"))
          this.path = castToString(value); // StringType
        else if (name.equals("valueSet[x]"))
          this.valueSet = (Type) value; // Type
        else if (name.equals("codeableConcept"))
          this.getCodeableConcept().add(castToCodeableConcept(value));
        else
          super.setProperty(name, value);
      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("path")) {
          throw new FHIRException("Cannot call addChild on a primitive type DataRequirement.path");
        }
        else if (name.equals("valueSetString")) {
          this.valueSet = new StringType();
          return this.valueSet;
        }
        else if (name.equals("valueSetReference")) {
          this.valueSet = new Reference();
          return this.valueSet;
        }
        else if (name.equals("codeableConcept")) {
          return addCodeableConcept();
        }
        else
          return super.addChild(name);
      }

      public DataRequirementCodeFilterComponent copy() {
        DataRequirementCodeFilterComponent dst = new DataRequirementCodeFilterComponent();
        copyValues(dst);
        dst.path = path == null ? null : path.copy();
        dst.valueSet = valueSet == null ? null : valueSet.copy();
        if (codeableConcept != null) {
          dst.codeableConcept = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : codeableConcept)
            dst.codeableConcept.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DataRequirementCodeFilterComponent))
          return false;
        DataRequirementCodeFilterComponent o = (DataRequirementCodeFilterComponent) other;
        return compareDeep(path, o.path, true) && compareDeep(valueSet, o.valueSet, true) && compareDeep(codeableConcept, o.codeableConcept, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DataRequirementCodeFilterComponent))
          return false;
        DataRequirementCodeFilterComponent o = (DataRequirementCodeFilterComponent) other;
        return compareValues(path, o.path, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (path == null || path.isEmpty()) && (valueSet == null || valueSet.isEmpty())
           && (codeableConcept == null || codeableConcept.isEmpty());
      }

  public String fhirType() {
    return "DataRequirement.codeFilter";

  }

  }

    @Block()
    public static class DataRequirementDateFilterComponent extends Element implements IBaseDatatypeElement {
        /**
         * The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
         */
        @Child(name = "path", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The date-valued attribute of the filter", formalDefinition="The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing." )
        protected StringType path;

        /**
         * The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime.
         */
        @Child(name = "value", type = {DateTimeType.class, Period.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The value of the filter, as a Period or dateTime value", formalDefinition="The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime." )
        protected Type value;

        private static final long serialVersionUID = 1791957163L;

    /**
     * Constructor
     */
      public DataRequirementDateFilterComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DataRequirementDateFilterComponent(StringType path) {
        super();
        this.path = path;
      }

        /**
         * @return {@link #path} (The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public StringType getPathElement() { 
          if (this.path == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DataRequirementDateFilterComponent.path");
            else if (Configuration.doAutoCreate())
              this.path = new StringType(); // bb
          return this.path;
        }

        public boolean hasPathElement() { 
          return this.path != null && !this.path.isEmpty();
        }

        public boolean hasPath() { 
          return this.path != null && !this.path.isEmpty();
        }

        /**
         * @param value {@link #path} (The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public DataRequirementDateFilterComponent setPathElement(StringType value) { 
          this.path = value;
          return this;
        }

        /**
         * @return The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
         */
        public String getPath() { 
          return this.path == null ? null : this.path.getValue();
        }

        /**
         * @param value The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
         */
        public DataRequirementDateFilterComponent setPath(String value) { 
            if (this.path == null)
              this.path = new StringType();
            this.path.setValue(value);
          return this;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime.)
         */
        public Type getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime.)
         */
        public DateTimeType getValueDateTimeType() throws FHIRException { 
          if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateTimeType) this.value;
        }

        public boolean hasValueDateTimeType() { 
          return this.value instanceof DateTimeType;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime.)
         */
        public Period getValuePeriod() throws FHIRException { 
          if (!(this.value instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Period) this.value;
        }

        public boolean hasValuePeriod() { 
          return this.value instanceof Period;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime.)
         */
        public DataRequirementDateFilterComponent setValue(Type value) { 
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("path", "string", "The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.", 0, java.lang.Integer.MAX_VALUE, path));
          childrenList.add(new Property("value[x]", "dateTime|Period", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime.", 0, java.lang.Integer.MAX_VALUE, value));
        }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("path"))
          this.path = castToString(value); // StringType
        else if (name.equals("value[x]"))
          this.value = (Type) value; // Type
        else
          super.setProperty(name, value);
      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("path")) {
          throw new FHIRException("Cannot call addChild on a primitive type DataRequirement.path");
        }
        else if (name.equals("valueDateTime")) {
          this.value = new DateTimeType();
          return this.value;
        }
        else if (name.equals("valuePeriod")) {
          this.value = new Period();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public DataRequirementDateFilterComponent copy() {
        DataRequirementDateFilterComponent dst = new DataRequirementDateFilterComponent();
        copyValues(dst);
        dst.path = path == null ? null : path.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DataRequirementDateFilterComponent))
          return false;
        DataRequirementDateFilterComponent o = (DataRequirementDateFilterComponent) other;
        return compareDeep(path, o.path, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DataRequirementDateFilterComponent))
          return false;
        DataRequirementDateFilterComponent o = (DataRequirementDateFilterComponent) other;
        return compareValues(path, o.path, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (path == null || path.isEmpty()) && (value == null || value.isEmpty())
          ;
      }

  public String fhirType() {
    return "DataRequirement.dateFilter";

  }

  }

    /**
     * The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
     */
    @Child(name = "type", type = {CodeType.class}, order=0, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The type of the required data", formalDefinition="The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile." )
    protected CodeType type;

    /**
     * The profile of the required data, specified as the uri of the profile definition.
     */
    @Child(name = "profile", type = {StructureDefinition.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The profile of the required data", formalDefinition="The profile of the required data, specified as the uri of the profile definition." )
    protected Reference profile;

    /**
     * The actual object that is the target of the reference (The profile of the required data, specified as the uri of the profile definition.)
     */
    protected StructureDefinition profileTarget;

    /**
     * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.
     */
    @Child(name = "mustSupport", type = {StringType.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Indicates that specific structure elements are referenced by the knowledge module", formalDefinition="Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available." )
    protected List<StringType> mustSupport;

    /**
     * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
     */
    @Child(name = "codeFilter", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Code filters for the data", formalDefinition="Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data." )
    protected List<DataRequirementCodeFilterComponent> codeFilter;

    /**
     * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
     */
    @Child(name = "dateFilter", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Date filters for the data", formalDefinition="Date filters specify additional constraints on the data in terms of the applicable date range for specific elements." )
    protected List<DataRequirementDateFilterComponent> dateFilter;

    private static final long serialVersionUID = 1768899744L;

  /**
   * Constructor
   */
    public DataRequirement() {
      super();
    }

  /**
   * Constructor
   */
    public DataRequirement(CodeType type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DataRequirement.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeType(); // bb
      return this.type;
    }

    public boolean hasTypeElement() { 
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public DataRequirement setTypeElement(CodeType value) { 
      this.type = value;
      return this;
    }

    /**
     * @return The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
     */
    public String getType() { 
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
     */
    public DataRequirement setType(String value) { 
        if (this.type == null)
          this.type = new CodeType();
        this.type.setValue(value);
      return this;
    }

    /**
     * @return {@link #profile} (The profile of the required data, specified as the uri of the profile definition.)
     */
    public Reference getProfile() { 
      if (this.profile == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DataRequirement.profile");
        else if (Configuration.doAutoCreate())
          this.profile = new Reference(); // cc
      return this.profile;
    }

    public boolean hasProfile() { 
      return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (The profile of the required data, specified as the uri of the profile definition.)
     */
    public DataRequirement setProfile(Reference value) { 
      this.profile = value;
      return this;
    }

    /**
     * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The profile of the required data, specified as the uri of the profile definition.)
     */
    public StructureDefinition getProfileTarget() { 
      if (this.profileTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DataRequirement.profile");
        else if (Configuration.doAutoCreate())
          this.profileTarget = new StructureDefinition(); // aa
      return this.profileTarget;
    }

    /**
     * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The profile of the required data, specified as the uri of the profile definition.)
     */
    public DataRequirement setProfileTarget(StructureDefinition value) { 
      this.profileTarget = value;
      return this;
    }

    /**
     * @return {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.)
     */
    public List<StringType> getMustSupport() { 
      if (this.mustSupport == null)
        this.mustSupport = new ArrayList<StringType>();
      return this.mustSupport;
    }

    public boolean hasMustSupport() { 
      if (this.mustSupport == null)
        return false;
      for (StringType item : this.mustSupport)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.)
     */
    // syntactic sugar
    public StringType addMustSupportElement() {//2 
      StringType t = new StringType();
      if (this.mustSupport == null)
        this.mustSupport = new ArrayList<StringType>();
      this.mustSupport.add(t);
      return t;
    }

    /**
     * @param value {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.)
     */
    public DataRequirement addMustSupport(String value) { //1
      StringType t = new StringType();
      t.setValue(value);
      if (this.mustSupport == null)
        this.mustSupport = new ArrayList<StringType>();
      this.mustSupport.add(t);
      return this;
    }

    /**
     * @param value {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.)
     */
    public boolean hasMustSupport(String value) { 
      if (this.mustSupport == null)
        return false;
      for (StringType v : this.mustSupport)
        if (v.equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #codeFilter} (Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.)
     */
    public List<DataRequirementCodeFilterComponent> getCodeFilter() { 
      if (this.codeFilter == null)
        this.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
      return this.codeFilter;
    }

    public boolean hasCodeFilter() { 
      if (this.codeFilter == null)
        return false;
      for (DataRequirementCodeFilterComponent item : this.codeFilter)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #codeFilter} (Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.)
     */
    // syntactic sugar
    public DataRequirementCodeFilterComponent addCodeFilter() { //3
      DataRequirementCodeFilterComponent t = new DataRequirementCodeFilterComponent();
      if (this.codeFilter == null)
        this.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
      this.codeFilter.add(t);
      return t;
    }

    // syntactic sugar
    public DataRequirement addCodeFilter(DataRequirementCodeFilterComponent t) { //3
      if (t == null)
        return this;
      if (this.codeFilter == null)
        this.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
      this.codeFilter.add(t);
      return this;
    }

    /**
     * @return {@link #dateFilter} (Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.)
     */
    public List<DataRequirementDateFilterComponent> getDateFilter() { 
      if (this.dateFilter == null)
        this.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
      return this.dateFilter;
    }

    public boolean hasDateFilter() { 
      if (this.dateFilter == null)
        return false;
      for (DataRequirementDateFilterComponent item : this.dateFilter)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #dateFilter} (Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.)
     */
    // syntactic sugar
    public DataRequirementDateFilterComponent addDateFilter() { //3
      DataRequirementDateFilterComponent t = new DataRequirementDateFilterComponent();
      if (this.dateFilter == null)
        this.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
      this.dateFilter.add(t);
      return t;
    }

    // syntactic sugar
    public DataRequirement addDateFilter(DataRequirementDateFilterComponent t) { //3
      if (t == null)
        return this;
      if (this.dateFilter == null)
        this.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
      this.dateFilter.add(t);
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "The profile of the required data, specified as the uri of the profile definition.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("mustSupport", "string", "Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.", 0, java.lang.Integer.MAX_VALUE, mustSupport));
        childrenList.add(new Property("codeFilter", "", "Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.", 0, java.lang.Integer.MAX_VALUE, codeFilter));
        childrenList.add(new Property("dateFilter", "", "Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.", 0, java.lang.Integer.MAX_VALUE, dateFilter));
      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
          this.type = castToCode(value); // CodeType
        else if (name.equals("profile"))
          this.profile = castToReference(value); // Reference
        else if (name.equals("mustSupport"))
          this.getMustSupport().add(castToString(value));
        else if (name.equals("codeFilter"))
          this.getCodeFilter().add((DataRequirementCodeFilterComponent) value);
        else if (name.equals("dateFilter"))
          this.getDateFilter().add((DataRequirementDateFilterComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          throw new FHIRException("Cannot call addChild on a primitive type DataRequirement.type");
        }
        else if (name.equals("profile")) {
          this.profile = new Reference();
          return this.profile;
        }
        else if (name.equals("mustSupport")) {
          throw new FHIRException("Cannot call addChild on a primitive type DataRequirement.mustSupport");
        }
        else if (name.equals("codeFilter")) {
          return addCodeFilter();
        }
        else if (name.equals("dateFilter")) {
          return addDateFilter();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "DataRequirement";

  }

      public DataRequirement copy() {
        DataRequirement dst = new DataRequirement();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.profile = profile == null ? null : profile.copy();
        if (mustSupport != null) {
          dst.mustSupport = new ArrayList<StringType>();
          for (StringType i : mustSupport)
            dst.mustSupport.add(i.copy());
        };
        if (codeFilter != null) {
          dst.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
          for (DataRequirementCodeFilterComponent i : codeFilter)
            dst.codeFilter.add(i.copy());
        };
        if (dateFilter != null) {
          dst.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
          for (DataRequirementDateFilterComponent i : dateFilter)
            dst.dateFilter.add(i.copy());
        };
        return dst;
      }

      protected DataRequirement typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DataRequirement))
          return false;
        DataRequirement o = (DataRequirement) other;
        return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true) && compareDeep(mustSupport, o.mustSupport, true)
           && compareDeep(codeFilter, o.codeFilter, true) && compareDeep(dateFilter, o.dateFilter, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DataRequirement))
          return false;
        DataRequirement o = (DataRequirement) other;
        return compareValues(type, o.type, true) && compareValues(mustSupport, o.mustSupport, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (profile == null || profile.isEmpty())
           && (mustSupport == null || mustSupport.isEmpty()) && (codeFilter == null || codeFilter.isEmpty())
           && (dateFilter == null || dateFilter.isEmpty());
      }


}

