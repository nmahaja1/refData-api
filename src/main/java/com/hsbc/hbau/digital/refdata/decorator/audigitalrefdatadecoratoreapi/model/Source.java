
package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ISOCOUNTRYCODE.AW.value",
    "ISOCOUNTRYCODE.AW.description",
    "ISOCOUNTRYCODE.AW.isEditable",
    "ISOCOUNTRYCODE.BH.value",
    "ISOCOUNTRYCODE.BH.description",
    "ISOCOUNTRYCODE.BH.isEditable",
    "ISOCOUNTRYCODE.BV.value",
    "ISOCOUNTRYCODE.BV.description",
    "ISOCOUNTRYCODE.BV.isEditable",
    "ISOCOUNTRYCODE.CH.value",
    "ISOCOUNTRYCODE.CH.description",
    "ISOCOUNTRYCODE.CH.isEditable",
    "ISOCOUNTRYCODE.CY.value",
    "ISOCOUNTRYCODE.CY.description",
    "ISOCOUNTRYCODE.CY.isEditable",
    "ISOCOUNTRYCODE.EH.value",
    "ISOCOUNTRYCODE.EH.description",
    "ISOCOUNTRYCODE.EH.isEditable",
    "ISOCOUNTRYCODE.GG.value",
    "ISOCOUNTRYCODE.GG.description",
    "ISOCOUNTRYCODE.GG.isEditable",
    "ISOCOUNTRYCODE.HK.value",
    "ISOCOUNTRYCODE.HK.description",
    "ISOCOUNTRYCODE.HK.isEditable",
    "ISOCOUNTRYCODE.IS.value",
    "ISOCOUNTRYCODE.IS.description",
    "ISOCOUNTRYCODE.IS.isEditable",
    "ISOCOUNTRYCODE.KW.value",
    "ISOCOUNTRYCODE.KW.description",
    "ISOCOUNTRYCODE.KW.isEditable",
    "ISOCOUNTRYCODE.LU.value",
    "ISOCOUNTRYCODE.LU.description",
    "ISOCOUNTRYCODE.LU.isEditable",
    "ISOCOUNTRYCODE.MQ.value",
    "ISOCOUNTRYCODE.MQ.description",
    "ISOCOUNTRYCODE.MQ.isEditable",
    "ISOCOUNTRYCODE.NG.value",
    "ISOCOUNTRYCODE.NG.description",
    "ISOCOUNTRYCODE.NG.isEditable",
    "ISOCOUNTRYCODE.PE.value",
    "ISOCOUNTRYCODE.PE.description",
    "ISOCOUNTRYCODE.PE.isEditable",
    "ISOCOUNTRYCODE.PR.value",
    "ISOCOUNTRYCODE.PR.description",
    "ISOCOUNTRYCODE.PR.isEditable",
    "ISOCOUNTRYCODE.RW.value",
    "ISOCOUNTRYCODE.RW.description",
    "ISOCOUNTRYCODE.RW.isEditable",
    "ISOCOUNTRYCODE.SJ.value",
    "ISOCOUNTRYCODE.SJ.description",
    "ISOCOUNTRYCODE.SJ.isEditable",
    "ISOCOUNTRYCODE.TD.value",
    "ISOCOUNTRYCODE.TD.description",
    "ISOCOUNTRYCODE.TD.isEditable",
    "ISOCOUNTRYCODE.TV.value",
    "ISOCOUNTRYCODE.TV.description",
    "ISOCOUNTRYCODE.TV.isEditable",
    "ISOCOUNTRYCODE.VG.value",
    "ISOCOUNTRYCODE.VG.description",
    "ISOCOUNTRYCODE.VG.isEditable",
    "ISOCOUNTRYCODE.BQ.value",
    "ISOCOUNTRYCODE.BQ.description",
    "ISOCOUNTRYCODE.BQ.isEditable",
    "ISOCOUNTRYCODE.AU.value",
    "ISOCOUNTRYCODE.AU.description",
    "ISOCOUNTRYCODE.AU.isEditable",
    "ISOCOUNTRYCODE.BM.value",
    "ISOCOUNTRYCODE.BM.description",
    "ISOCOUNTRYCODE.BM.isEditable",
    "ISOCOUNTRYCODE.CA.value",
    "ISOCOUNTRYCODE.CA.description",
    "ISOCOUNTRYCODE.CA.isEditable",
    "ISOCOUNTRYCODE.CO.value",
    "ISOCOUNTRYCODE.CO.description",
    "ISOCOUNTRYCODE.CO.isEditable",
    "ISOCOUNTRYCODE.EE.value",
    "ISOCOUNTRYCODE.EE.description",
    "ISOCOUNTRYCODE.EE.isEditable",
    "ISOCOUNTRYCODE.GE.value",
    "ISOCOUNTRYCODE.GE.description",
    "ISOCOUNTRYCODE.GE.isEditable",
    "ISOCOUNTRYCODE.HR.value",
    "ISOCOUNTRYCODE.HR.description",
    "ISOCOUNTRYCODE.HR.isEditable",
    "ISOCOUNTRYCODE.KE.value",
    "ISOCOUNTRYCODE.KE.description",
    "ISOCOUNTRYCODE.KE.isEditable",
    "ISOCOUNTRYCODE.LI.value",
    "ISOCOUNTRYCODE.LI.description",
    "ISOCOUNTRYCODE.LI.isEditable",
    "ISOCOUNTRYCODE.MR.value",
    "ISOCOUNTRYCODE.MR.description",
    "ISOCOUNTRYCODE.MR.isEditable",
    "ISOCOUNTRYCODE.PM.value",
    "ISOCOUNTRYCODE.PM.description",
    "ISOCOUNTRYCODE.PM.isEditable",
    "ISOCOUNTRYCODE.SC.value",
    "ISOCOUNTRYCODE.SC.description",
    "ISOCOUNTRYCODE.SC.isEditable",
    "ISOCOUNTRYCODE.SO.value",
    "ISOCOUNTRYCODE.SO.description",
    "ISOCOUNTRYCODE.SO.isEditable",
    "ISOCOUNTRYCODE.TM.value",
    "ISOCOUNTRYCODE.TM.description",
    "ISOCOUNTRYCODE.TM.isEditable",
    "ISOCOUNTRYCODE.VN.value",
    "ISOCOUNTRYCODE.VN.description",
    "ISOCOUNTRYCODE.VN.isEditable",
    "ISOCOUNTRYCODE.GQ.value",
    "ISOCOUNTRYCODE.GQ.description",
    "ISOCOUNTRYCODE.GQ.isEditable",
    "ISOCOUNTRYCODE.KH.value",
    "ISOCOUNTRYCODE.KH.description",
    "ISOCOUNTRYCODE.KH.isEditable",
    "ISOCOUNTRYCODE.LA.value",
    "ISOCOUNTRYCODE.LA.description",
    "ISOCOUNTRYCODE.LA.isEditable",
    "ISOCOUNTRYCODE.LK.value",
    "ISOCOUNTRYCODE.LK.description",
    "ISOCOUNTRYCODE.LK.isEditable",
    "ISOCOUNTRYCODE.LT.value",
    "ISOCOUNTRYCODE.LT.description",
    "ISOCOUNTRYCODE.LT.isEditable",
    "ISOCOUNTRYCODE.LY.value",
    "ISOCOUNTRYCODE.LY.description",
    "ISOCOUNTRYCODE.LY.isEditable",
    "ISOCOUNTRYCODE.MC.value",
    "ISOCOUNTRYCODE.MC.description",
    "ISOCOUNTRYCODE.MC.isEditable",
    "ISOCOUNTRYCODE.MH.value",
    "ISOCOUNTRYCODE.MH.description",
    "ISOCOUNTRYCODE.MH.isEditable",
    "ISOCOUNTRYCODE.MM.value",
    "ISOCOUNTRYCODE.MM.description",
    "ISOCOUNTRYCODE.MM.isEditable",
    "ISOCOUNTRYCODE.MP.value",
    "ISOCOUNTRYCODE.MP.description",
    "ISOCOUNTRYCODE.MP.isEditable",
    "ISOCOUNTRYCODE.MS.value",
    "ISOCOUNTRYCODE.MS.description",
    "ISOCOUNTRYCODE.MS.isEditable",
    "ISOCOUNTRYCODE.MV.value",
    "ISOCOUNTRYCODE.MV.description",
    "ISOCOUNTRYCODE.MV.isEditable",
    "ISOCOUNTRYCODE.NU.value",
    "ISOCOUNTRYCODE.NU.description",
    "ISOCOUNTRYCODE.NU.isEditable",
    "ISOCOUNTRYCODE.ST.value",
    "ISOCOUNTRYCODE.ST.description",
    "ISOCOUNTRYCODE.ST.isEditable",
    "ISOCOUNTRYCODE.TC.value",
    "ISOCOUNTRYCODE.TC.description",
    "ISOCOUNTRYCODE.TC.isEditable",
    "ISOCOUNTRYCODE.TG.value",
    "ISOCOUNTRYCODE.TG.description",
    "ISOCOUNTRYCODE.TG.isEditable",
    "ISOCOUNTRYCODE.TK.value",
    "ISOCOUNTRYCODE.TK.description",
    "ISOCOUNTRYCODE.TK.isEditable",
    "ISOCOUNTRYCODE.TO.value",
    "ISOCOUNTRYCODE.TO.description",
    "ISOCOUNTRYCODE.TO.isEditable",
    "ISOCOUNTRYCODE.TT.value",
    "ISOCOUNTRYCODE.TT.description",
    "ISOCOUNTRYCODE.TT.isEditable",
    "ISOCOUNTRYCODE.UA.value",
    "ISOCOUNTRYCODE.UA.description",
    "ISOCOUNTRYCODE.UA.isEditable",
    "ISOCOUNTRYCODE.UM.value",
    "ISOCOUNTRYCODE.UM.description",
    "ISOCOUNTRYCODE.UM.isEditable",
    "ISOCOUNTRYCODE.VA.value",
    "ISOCOUNTRYCODE.VA.description",
    "ISOCOUNTRYCODE.VA.isEditable",
    "ISOCOUNTRYCODE.VI.value",
    "ISOCOUNTRYCODE.VI.description",
    "ISOCOUNTRYCODE.VI.isEditable",
    "ISOCOUNTRYCODE.WF.value",
    "ISOCOUNTRYCODE.WF.description",
    "ISOCOUNTRYCODE.WF.isEditable",
    "ISOCOUNTRYCODE.ZA.value",
    "ISOCOUNTRYCODE.ZA.description",
    "ISOCOUNTRYCODE.ZA.isEditable",
    "ISOCOUNTRYCODE.AX.value",
    "ISOCOUNTRYCODE.AX.description",
    "ISOCOUNTRYCODE.AX.isEditable",
    "ISOCOUNTRYCODE.MF.value",
    "ISOCOUNTRYCODE.MF.description",
    "ISOCOUNTRYCODE.MF.isEditable",
    "ISOCOUNTRYCODE.CW.value",
    "ISOCOUNTRYCODE.CW.description",
    "ISOCOUNTRYCODE.CW.isEditable",
    "ISOCOUNTRYCODE.BL.value",
    "ISOCOUNTRYCODE.BL.description",
    "ISOCOUNTRYCODE.BL.isEditable",
    "ISOCOUNTRYCODE.SX.value",
    "ISOCOUNTRYCODE.SX.description",
    "ISOCOUNTRYCODE.SX.isEditable",
    "ISOCOUNTRYCODE.TL.value",
    "ISOCOUNTRYCODE.TL.description",
    "ISOCOUNTRYCODE.TL.isEditable",
    "ISOCOUNTRYCODE.SS.value",
    "ISOCOUNTRYCODE.SS.description",
    "ISOCOUNTRYCODE.SS.isEditable",
    "ISOCOUNTRYCODE.RS.value",
    "ISOCOUNTRYCODE.RS.description",
    "ISOCOUNTRYCODE.RS.isEditable",
    "ISOCOUNTRYCODE.AD.value",
    "ISOCOUNTRYCODE.AD.description",
    "ISOCOUNTRYCODE.AD.isEditable",
    "ISOCOUNTRYCODE.AE.value",
    "ISOCOUNTRYCODE.AE.description",
    "ISOCOUNTRYCODE.AE.isEditable",
    "ISOCOUNTRYCODE.AF.value",
    "ISOCOUNTRYCODE.AF.description",
    "ISOCOUNTRYCODE.AF.isEditable",
    "ISOCOUNTRYCODE.AG.value",
    "ISOCOUNTRYCODE.AG.description",
    "ISOCOUNTRYCODE.AG.isEditable",
    "ISOCOUNTRYCODE.AI.value",
    "ISOCOUNTRYCODE.AI.description",
    "ISOCOUNTRYCODE.AI.isEditable",
    "ISOCOUNTRYCODE.AL.value",
    "ISOCOUNTRYCODE.AL.description",
    "ISOCOUNTRYCODE.AL.isEditable",
    "ISOCOUNTRYCODE.AM.value",
    "ISOCOUNTRYCODE.AM.description",
    "ISOCOUNTRYCODE.AM.isEditable",
    "ISOCOUNTRYCODE.AO.value",
    "ISOCOUNTRYCODE.AO.description",
    "ISOCOUNTRYCODE.AO.isEditable",
    "ISOCOUNTRYCODE.AQ.value",
    "ISOCOUNTRYCODE.AQ.description",
    "ISOCOUNTRYCODE.AQ.isEditable",
    "ISOCOUNTRYCODE.AR.value",
    "ISOCOUNTRYCODE.AR.description",
    "ISOCOUNTRYCODE.AR.isEditable",
    "ISOCOUNTRYCODE.AS.value",
    "ISOCOUNTRYCODE.AS.description",
    "ISOCOUNTRYCODE.AS.isEditable",
    "ISOCOUNTRYCODE.AT.value",
    "ISOCOUNTRYCODE.AT.description",
    "ISOCOUNTRYCODE.AT.isEditable",
    "ISOCOUNTRYCODE.AZ.value",
    "ISOCOUNTRYCODE.AZ.description",
    "ISOCOUNTRYCODE.AZ.isEditable",
    "ISOCOUNTRYCODE.BA.value",
    "ISOCOUNTRYCODE.BA.description",
    "ISOCOUNTRYCODE.BA.isEditable",
    "ISOCOUNTRYCODE.BB.value",
    "ISOCOUNTRYCODE.BB.description",
    "ISOCOUNTRYCODE.BB.isEditable",
    "ISOCOUNTRYCODE.BD.value",
    "ISOCOUNTRYCODE.BD.description",
    "ISOCOUNTRYCODE.BD.isEditable",
    "ISOCOUNTRYCODE.BE.value",
    "ISOCOUNTRYCODE.BE.description",
    "ISOCOUNTRYCODE.BE.isEditable",
    "ISOCOUNTRYCODE.BF.value",
    "ISOCOUNTRYCODE.BF.description",
    "ISOCOUNTRYCODE.BF.isEditable",
    "ISOCOUNTRYCODE.BG.value",
    "ISOCOUNTRYCODE.BG.description",
    "ISOCOUNTRYCODE.BG.isEditable",
    "ISOCOUNTRYCODE.BI.value",
    "ISOCOUNTRYCODE.BI.description",
    "ISOCOUNTRYCODE.BI.isEditable",
    "ISOCOUNTRYCODE.BJ.value",
    "ISOCOUNTRYCODE.BJ.description",
    "ISOCOUNTRYCODE.BJ.isEditable",
    "ISOCOUNTRYCODE.BN.value",
    "ISOCOUNTRYCODE.BN.description",
    "ISOCOUNTRYCODE.BN.isEditable",
    "ISOCOUNTRYCODE.BO.value",
    "ISOCOUNTRYCODE.BO.description",
    "ISOCOUNTRYCODE.BO.isEditable",
    "ISOCOUNTRYCODE.BR.value",
    "ISOCOUNTRYCODE.BR.description",
    "ISOCOUNTRYCODE.BR.isEditable",
    "ISOCOUNTRYCODE.BS.value",
    "ISOCOUNTRYCODE.BS.description",
    "ISOCOUNTRYCODE.BS.isEditable",
    "ISOCOUNTRYCODE.BT.value",
    "ISOCOUNTRYCODE.BT.description",
    "ISOCOUNTRYCODE.BT.isEditable",
    "ISOCOUNTRYCODE.BW.value",
    "ISOCOUNTRYCODE.BW.description",
    "ISOCOUNTRYCODE.BW.isEditable",
    "ISOCOUNTRYCODE.BY.value",
    "ISOCOUNTRYCODE.BY.description",
    "ISOCOUNTRYCODE.BY.isEditable",
    "ISOCOUNTRYCODE.BZ.value",
    "ISOCOUNTRYCODE.BZ.description",
    "ISOCOUNTRYCODE.BZ.isEditable",
    "ISOCOUNTRYCODE.CC.value",
    "ISOCOUNTRYCODE.CC.description",
    "ISOCOUNTRYCODE.CC.isEditable",
    "ISOCOUNTRYCODE.CD.value",
    "ISOCOUNTRYCODE.CD.description",
    "ISOCOUNTRYCODE.CD.isEditable",
    "ISOCOUNTRYCODE.CF.value",
    "ISOCOUNTRYCODE.CF.description",
    "ISOCOUNTRYCODE.CF.isEditable",
    "ISOCOUNTRYCODE.CG.value",
    "ISOCOUNTRYCODE.CG.description",
    "ISOCOUNTRYCODE.CG.isEditable",
    "ISOCOUNTRYCODE.CI.value",
    "ISOCOUNTRYCODE.CI.description",
    "ISOCOUNTRYCODE.CI.isEditable",
    "ISOCOUNTRYCODE.CK.value",
    "ISOCOUNTRYCODE.CK.description",
    "ISOCOUNTRYCODE.CK.isEditable",
    "ISOCOUNTRYCODE.CL.value",
    "ISOCOUNTRYCODE.CL.description",
    "ISOCOUNTRYCODE.CL.isEditable",
    "ISOCOUNTRYCODE.CM.value",
    "ISOCOUNTRYCODE.CM.description",
    "ISOCOUNTRYCODE.CM.isEditable",
    "ISOCOUNTRYCODE.CN.value",
    "ISOCOUNTRYCODE.CN.description",
    "ISOCOUNTRYCODE.CN.isEditable",
    "ISOCOUNTRYCODE.CR.value",
    "ISOCOUNTRYCODE.CR.description",
    "ISOCOUNTRYCODE.CR.isEditable",
    "ISOCOUNTRYCODE.CU.value",
    "ISOCOUNTRYCODE.CU.description",
    "ISOCOUNTRYCODE.CU.isEditable",
    "ISOCOUNTRYCODE.CV.value",
    "ISOCOUNTRYCODE.CV.description",
    "ISOCOUNTRYCODE.CV.isEditable",
    "ISOCOUNTRYCODE.CZ.value",
    "ISOCOUNTRYCODE.CZ.description",
    "ISOCOUNTRYCODE.CZ.isEditable",
    "ISOCOUNTRYCODE.DE.value",
    "ISOCOUNTRYCODE.DE.description",
    "ISOCOUNTRYCODE.DE.isEditable",
    "ISOCOUNTRYCODE.DK.value",
    "ISOCOUNTRYCODE.DK.description",
    "ISOCOUNTRYCODE.DK.isEditable",
    "ISOCOUNTRYCODE.DM.value",
    "ISOCOUNTRYCODE.DM.description",
    "ISOCOUNTRYCODE.DM.isEditable",
    "ISOCOUNTRYCODE.DZ.value",
    "ISOCOUNTRYCODE.DZ.description",
    "ISOCOUNTRYCODE.DZ.isEditable",
    "ISOCOUNTRYCODE.EC.value",
    "ISOCOUNTRYCODE.EC.description",
    "ISOCOUNTRYCODE.EC.isEditable",
    "ISOCOUNTRYCODE.ES.value",
    "ISOCOUNTRYCODE.ES.description",
    "ISOCOUNTRYCODE.ES.isEditable",
    "ISOCOUNTRYCODE.ET.value",
    "ISOCOUNTRYCODE.ET.description",
    "ISOCOUNTRYCODE.ET.isEditable",
    "ISOCOUNTRYCODE.FJ.value",
    "ISOCOUNTRYCODE.FJ.description",
    "ISOCOUNTRYCODE.FJ.isEditable",
    "ISOCOUNTRYCODE.FK.value",
    "ISOCOUNTRYCODE.FK.description",
    "ISOCOUNTRYCODE.FK.isEditable",
    "ISOCOUNTRYCODE.FO.value",
    "ISOCOUNTRYCODE.FO.description",
    "ISOCOUNTRYCODE.FO.isEditable",
    "ISOCOUNTRYCODE.FR.value",
    "ISOCOUNTRYCODE.FR.description",
    "ISOCOUNTRYCODE.FR.isEditable",
    "ISOCOUNTRYCODE.GA.value",
    "ISOCOUNTRYCODE.GA.description",
    "ISOCOUNTRYCODE.GA.isEditable",
    "ISOCOUNTRYCODE.GD.value",
    "ISOCOUNTRYCODE.GD.description",
    "ISOCOUNTRYCODE.GD.isEditable",
    "ISOCOUNTRYCODE.GH.value",
    "ISOCOUNTRYCODE.GH.description",
    "ISOCOUNTRYCODE.GH.isEditable",
    "ISOCOUNTRYCODE.GL.value",
    "ISOCOUNTRYCODE.GL.description",
    "ISOCOUNTRYCODE.GL.isEditable",
    "ISOCOUNTRYCODE.GM.value",
    "ISOCOUNTRYCODE.GM.description",
    "ISOCOUNTRYCODE.GM.isEditable",
    "ISOCOUNTRYCODE.GP.value",
    "ISOCOUNTRYCODE.GP.description",
    "ISOCOUNTRYCODE.GP.isEditable",
    "ISOCOUNTRYCODE.GR.value",
    "ISOCOUNTRYCODE.GR.description",
    "ISOCOUNTRYCODE.GR.isEditable",
    "ISOCOUNTRYCODE.GS.value",
    "ISOCOUNTRYCODE.GS.description",
    "ISOCOUNTRYCODE.GS.isEditable",
    "ISOCOUNTRYCODE.GT.value",
    "ISOCOUNTRYCODE.GT.description",
    "ISOCOUNTRYCODE.GT.isEditable",
    "ISOCOUNTRYCODE.GW.value",
    "ISOCOUNTRYCODE.GW.description",
    "ISOCOUNTRYCODE.GW.isEditable",
    "ISOCOUNTRYCODE.HM.value",
    "ISOCOUNTRYCODE.HM.description",
    "ISOCOUNTRYCODE.HM.isEditable",
    "ISOCOUNTRYCODE.HT.value",
    "ISOCOUNTRYCODE.HT.description",
    "ISOCOUNTRYCODE.HT.isEditable",
    "ISOCOUNTRYCODE.ID.value",
    "ISOCOUNTRYCODE.ID.description",
    "ISOCOUNTRYCODE.ID.isEditable",
    "ISOCOUNTRYCODE.IL.value",
    "ISOCOUNTRYCODE.IL.description",
    "ISOCOUNTRYCODE.IL.isEditable",
    "ISOCOUNTRYCODE.IM.value",
    "ISOCOUNTRYCODE.IM.description",
    "ISOCOUNTRYCODE.IM.isEditable",
    "ISOCOUNTRYCODE.IO.value",
    "ISOCOUNTRYCODE.IO.description",
    "ISOCOUNTRYCODE.IO.isEditable",
    "ISOCOUNTRYCODE.IQ.value",
    "ISOCOUNTRYCODE.IQ.description",
    "ISOCOUNTRYCODE.IQ.isEditable",
    "ISOCOUNTRYCODE.IT.value",
    "ISOCOUNTRYCODE.IT.description",
    "ISOCOUNTRYCODE.IT.isEditable",
    "ISOCOUNTRYCODE.JM.value",
    "ISOCOUNTRYCODE.JM.description",
    "ISOCOUNTRYCODE.JM.isEditable",
    "ISOCOUNTRYCODE.JO.value",
    "ISOCOUNTRYCODE.JO.description",
    "ISOCOUNTRYCODE.JO.isEditable",
    "ISOCOUNTRYCODE.KG.value",
    "ISOCOUNTRYCODE.KG.description",
    "ISOCOUNTRYCODE.KG.isEditable",
    "ISOCOUNTRYCODE.KI.value",
    "ISOCOUNTRYCODE.KI.description",
    "ISOCOUNTRYCODE.KI.isEditable",
    "ISOCOUNTRYCODE.KN.value",
    "ISOCOUNTRYCODE.KN.description",
    "ISOCOUNTRYCODE.KN.isEditable",
    "ISOCOUNTRYCODE.KP.value",
    "ISOCOUNTRYCODE.KP.description",
    "ISOCOUNTRYCODE.KP.isEditable",
    "ISOCOUNTRYCODE.KY.value",
    "ISOCOUNTRYCODE.KY.description",
    "ISOCOUNTRYCODE.KY.isEditable",
    "ISOCOUNTRYCODE.KZ.value",
    "ISOCOUNTRYCODE.KZ.description",
    "ISOCOUNTRYCODE.KZ.isEditable",
    "ISOCOUNTRYCODE.LB.value",
    "ISOCOUNTRYCODE.LB.description",
    "ISOCOUNTRYCODE.LB.isEditable",
    "ISOCOUNTRYCODE.LC.value",
    "ISOCOUNTRYCODE.LC.description",
    "ISOCOUNTRYCODE.LC.isEditable",
    "ISOCOUNTRYCODE.LR.value",
    "ISOCOUNTRYCODE.LR.description",
    "ISOCOUNTRYCODE.LR.isEditable",
    "ISOCOUNTRYCODE.LS.value",
    "ISOCOUNTRYCODE.LS.description",
    "ISOCOUNTRYCODE.LS.isEditable",
    "ISOCOUNTRYCODE.LV.value",
    "ISOCOUNTRYCODE.LV.description",
    "ISOCOUNTRYCODE.LV.isEditable",
    "ISOCOUNTRYCODE.MA.value",
    "ISOCOUNTRYCODE.MA.description",
    "ISOCOUNTRYCODE.MA.isEditable",
    "ISOCOUNTRYCODE.MD.value",
    "ISOCOUNTRYCODE.MD.description",
    "ISOCOUNTRYCODE.MD.isEditable",
    "ISOCOUNTRYCODE.MG.value",
    "ISOCOUNTRYCODE.MG.description",
    "ISOCOUNTRYCODE.MG.isEditable",
    "ISOCOUNTRYCODE.MK.value",
    "ISOCOUNTRYCODE.MK.description",
    "ISOCOUNTRYCODE.MK.isEditable",
    "ISOCOUNTRYCODE.ML.value",
    "ISOCOUNTRYCODE.ML.description",
    "ISOCOUNTRYCODE.ML.isEditable",
    "ISOCOUNTRYCODE.MN.value",
    "ISOCOUNTRYCODE.MN.description",
    "ISOCOUNTRYCODE.MN.isEditable",
    "ISOCOUNTRYCODE.MO.value",
    "ISOCOUNTRYCODE.MO.description",
    "ISOCOUNTRYCODE.MO.isEditable",
    "ISOCOUNTRYCODE.MT.value",
    "ISOCOUNTRYCODE.MT.description",
    "ISOCOUNTRYCODE.MT.isEditable",
    "ISOCOUNTRYCODE.MU.value",
    "ISOCOUNTRYCODE.MU.description",
    "ISOCOUNTRYCODE.MU.isEditable",
    "ISOCOUNTRYCODE.MW.value",
    "ISOCOUNTRYCODE.MW.description",
    "ISOCOUNTRYCODE.MW.isEditable",
    "ISOCOUNTRYCODE.MX.value",
    "ISOCOUNTRYCODE.MX.description",
    "ISOCOUNTRYCODE.MX.isEditable",
    "ISOCOUNTRYCODE.MY.value",
    "ISOCOUNTRYCODE.MY.description",
    "ISOCOUNTRYCODE.MY.isEditable",
    "ISOCOUNTRYCODE.MZ.value",
    "ISOCOUNTRYCODE.MZ.description",
    "ISOCOUNTRYCODE.MZ.isEditable",
    "ISOCOUNTRYCODE.NA.value",
    "ISOCOUNTRYCODE.NA.description",
    "ISOCOUNTRYCODE.NA.isEditable",
    "ISOCOUNTRYCODE.NC.value",
    "ISOCOUNTRYCODE.NC.description",
    "ISOCOUNTRYCODE.NC.isEditable",
    "ISOCOUNTRYCODE.NE.value",
    "ISOCOUNTRYCODE.NE.description",
    "ISOCOUNTRYCODE.NE.isEditable",
    "ISOCOUNTRYCODE.NF.value",
    "ISOCOUNTRYCODE.NF.description",
    "ISOCOUNTRYCODE.NF.isEditable",
    "ISOCOUNTRYCODE.NI.value",
    "ISOCOUNTRYCODE.NI.description",
    "ISOCOUNTRYCODE.NI.isEditable",
    "ISOCOUNTRYCODE.NL.value",
    "ISOCOUNTRYCODE.NL.description",
    "ISOCOUNTRYCODE.NL.isEditable",
    "ISOCOUNTRYCODE.NO.value",
    "ISOCOUNTRYCODE.NO.description",
    "ISOCOUNTRYCODE.NO.isEditable",
    "ISOCOUNTRYCODE.NP.value",
    "ISOCOUNTRYCODE.NP.description",
    "ISOCOUNTRYCODE.NP.isEditable",
    "ISOCOUNTRYCODE.NR.value",
    "ISOCOUNTRYCODE.NR.description",
    "ISOCOUNTRYCODE.NR.isEditable",
    "ISOCOUNTRYCODE.NZ.value",
    "ISOCOUNTRYCODE.NZ.description",
    "ISOCOUNTRYCODE.NZ.isEditable",
    "ISOCOUNTRYCODE.OM.value",
    "ISOCOUNTRYCODE.OM.description",
    "ISOCOUNTRYCODE.OM.isEditable",
    "ISOCOUNTRYCODE.PA.value",
    "ISOCOUNTRYCODE.PA.description",
    "ISOCOUNTRYCODE.PA.isEditable",
    "ISOCOUNTRYCODE.PF.value",
    "ISOCOUNTRYCODE.PF.description",
    "ISOCOUNTRYCODE.PF.isEditable",
    "ISOCOUNTRYCODE.PG.value",
    "ISOCOUNTRYCODE.PG.description",
    "ISOCOUNTRYCODE.PG.isEditable",
    "ISOCOUNTRYCODE.PH.value",
    "ISOCOUNTRYCODE.PH.description",
    "ISOCOUNTRYCODE.PH.isEditable",
    "ISOCOUNTRYCODE.PK.value",
    "ISOCOUNTRYCODE.PK.description",
    "ISOCOUNTRYCODE.PK.isEditable",
    "ISOCOUNTRYCODE.PL.value",
    "ISOCOUNTRYCODE.PL.description",
    "ISOCOUNTRYCODE.PL.isEditable",
    "ISOCOUNTRYCODE.PN.value",
    "ISOCOUNTRYCODE.PN.description",
    "ISOCOUNTRYCODE.PN.isEditable",
    "ISOCOUNTRYCODE.PS.value",
    "ISOCOUNTRYCODE.PS.description",
    "ISOCOUNTRYCODE.PS.isEditable",
    "ISOCOUNTRYCODE.PT.value",
    "ISOCOUNTRYCODE.PT.description",
    "ISOCOUNTRYCODE.PT.isEditable",
    "ISOCOUNTRYCODE.PW.value",
    "ISOCOUNTRYCODE.PW.description",
    "ISOCOUNTRYCODE.PW.isEditable",
    "ISOCOUNTRYCODE.PY.value",
    "ISOCOUNTRYCODE.PY.description",
    "ISOCOUNTRYCODE.PY.isEditable",
    "ISOCOUNTRYCODE.QA.value",
    "ISOCOUNTRYCODE.QA.description",
    "ISOCOUNTRYCODE.QA.isEditable",
    "ISOCOUNTRYCODE.RE.value",
    "ISOCOUNTRYCODE.RE.description",
    "ISOCOUNTRYCODE.RE.isEditable",
    "ISOCOUNTRYCODE.RO.value",
    "ISOCOUNTRYCODE.RO.description",
    "ISOCOUNTRYCODE.RO.isEditable",
    "ISOCOUNTRYCODE.RU.value",
    "ISOCOUNTRYCODE.RU.description",
    "ISOCOUNTRYCODE.RU.isEditable",
    "ISOCOUNTRYCODE.SA.value",
    "ISOCOUNTRYCODE.SA.description",
    "ISOCOUNTRYCODE.SA.isEditable",
    "ISOCOUNTRYCODE.SB.value",
    "ISOCOUNTRYCODE.SB.description",
    "ISOCOUNTRYCODE.SB.isEditable",
    "ISOCOUNTRYCODE.SD.value",
    "ISOCOUNTRYCODE.SD.description",
    "ISOCOUNTRYCODE.SD.isEditable",
    "ISOCOUNTRYCODE.SE.value",
    "ISOCOUNTRYCODE.SE.description",
    "ISOCOUNTRYCODE.SE.isEditable",
    "ISOCOUNTRYCODE.SG.value",
    "ISOCOUNTRYCODE.SG.description",
    "ISOCOUNTRYCODE.SG.isEditable",
    "ISOCOUNTRYCODE.SH.value",
    "ISOCOUNTRYCODE.SH.description",
    "ISOCOUNTRYCODE.SH.isEditable",
    "ISOCOUNTRYCODE.SI.value",
    "ISOCOUNTRYCODE.SI.description",
    "ISOCOUNTRYCODE.SI.isEditable",
    "ISOCOUNTRYCODE.SK.value",
    "ISOCOUNTRYCODE.SK.description",
    "ISOCOUNTRYCODE.SK.isEditable",
    "ISOCOUNTRYCODE.SL.value",
    "ISOCOUNTRYCODE.SL.description",
    "ISOCOUNTRYCODE.SL.isEditable",
    "ISOCOUNTRYCODE.SM.value",
    "ISOCOUNTRYCODE.SM.description",
    "ISOCOUNTRYCODE.SM.isEditable",
    "ISOCOUNTRYCODE.SN.value",
    "ISOCOUNTRYCODE.SN.description",
    "ISOCOUNTRYCODE.SN.isEditable",
    "ISOCOUNTRYCODE.SR.value",
    "ISOCOUNTRYCODE.SR.description",
    "ISOCOUNTRYCODE.SR.isEditable",
    "ISOCOUNTRYCODE.SV.value",
    "ISOCOUNTRYCODE.SV.description",
    "ISOCOUNTRYCODE.SV.isEditable",
    "ISOCOUNTRYCODE.SY.value",
    "ISOCOUNTRYCODE.SY.description",
    "ISOCOUNTRYCODE.SY.isEditable",
    "ISOCOUNTRYCODE.SZ.value",
    "ISOCOUNTRYCODE.SZ.description",
    "ISOCOUNTRYCODE.SZ.isEditable",
    "ISOCOUNTRYCODE.TF.value",
    "ISOCOUNTRYCODE.TF.description",
    "ISOCOUNTRYCODE.TF.isEditable",
    "ISOCOUNTRYCODE.TH.value",
    "ISOCOUNTRYCODE.TH.description",
    "ISOCOUNTRYCODE.TH.isEditable",
    "ISOCOUNTRYCODE.TJ.value",
    "ISOCOUNTRYCODE.TJ.description",
    "ISOCOUNTRYCODE.TJ.isEditable",
    "ISOCOUNTRYCODE.TN.value",
    "ISOCOUNTRYCODE.TN.description",
    "ISOCOUNTRYCODE.TN.isEditable",
    "ISOCOUNTRYCODE.TR.value",
    "ISOCOUNTRYCODE.TR.description",
    "ISOCOUNTRYCODE.TR.isEditable",
    "ISOCOUNTRYCODE.TW.value",
    "ISOCOUNTRYCODE.TW.description",
    "ISOCOUNTRYCODE.TW.isEditable",
    "ISOCOUNTRYCODE.TZ.value",
    "ISOCOUNTRYCODE.TZ.description",
    "ISOCOUNTRYCODE.TZ.isEditable",
    "ISOCOUNTRYCODE.UG.value",
    "ISOCOUNTRYCODE.UG.description",
    "ISOCOUNTRYCODE.UG.isEditable",
    "ISOCOUNTRYCODE.US.value",
    "ISOCOUNTRYCODE.US.description",
    "ISOCOUNTRYCODE.US.isEditable",
    "ISOCOUNTRYCODE.UY.value",
    "ISOCOUNTRYCODE.UY.description",
    "ISOCOUNTRYCODE.UY.isEditable",
    "ISOCOUNTRYCODE.UZ.value",
    "ISOCOUNTRYCODE.UZ.description",
    "ISOCOUNTRYCODE.UZ.isEditable",
    "ISOCOUNTRYCODE.VC.value",
    "ISOCOUNTRYCODE.VC.description",
    "ISOCOUNTRYCODE.VC.isEditable",
    "ISOCOUNTRYCODE.VE.value",
    "ISOCOUNTRYCODE.VE.description",
    "ISOCOUNTRYCODE.VE.isEditable",
    "ISOCOUNTRYCODE.VU.value",
    "ISOCOUNTRYCODE.VU.description",
    "ISOCOUNTRYCODE.VU.isEditable",
    "ISOCOUNTRYCODE.WS.value",
    "ISOCOUNTRYCODE.WS.description",
    "ISOCOUNTRYCODE.WS.isEditable",
    "ISOCOUNTRYCODE.YE.value",
    "ISOCOUNTRYCODE.YE.description",
    "ISOCOUNTRYCODE.YE.isEditable",
    "ISOCOUNTRYCODE.YT.value",
    "ISOCOUNTRYCODE.YT.description",
    "ISOCOUNTRYCODE.YT.isEditable",
    "ISOCOUNTRYCODE.ZM.value",
    "ISOCOUNTRYCODE.ZM.description",
    "ISOCOUNTRYCODE.ZM.isEditable",
    "ISOCOUNTRYCODE.ZW.value",
    "ISOCOUNTRYCODE.ZW.description",
    "ISOCOUNTRYCODE.ZW.isEditable",
    "ISOCOUNTRYCODE.CX.value",
    "ISOCOUNTRYCODE.CX.description",
    "ISOCOUNTRYCODE.CX.isEditable",
    "ISOCOUNTRYCODE.DJ.value",
    "ISOCOUNTRYCODE.DJ.description",
    "ISOCOUNTRYCODE.DJ.isEditable",
    "ISOCOUNTRYCODE.DO.value",
    "ISOCOUNTRYCODE.DO.description",
    "ISOCOUNTRYCODE.DO.isEditable",
    "ISOCOUNTRYCODE.EG.value",
    "ISOCOUNTRYCODE.EG.description",
    "ISOCOUNTRYCODE.EG.isEditable",
    "ISOCOUNTRYCODE.ER.value",
    "ISOCOUNTRYCODE.ER.description",
    "ISOCOUNTRYCODE.ER.isEditable",
    "ISOCOUNTRYCODE.FI.value",
    "ISOCOUNTRYCODE.FI.description",
    "ISOCOUNTRYCODE.FI.isEditable",
    "ISOCOUNTRYCODE.FM.value",
    "ISOCOUNTRYCODE.FM.description",
    "ISOCOUNTRYCODE.FM.isEditable",
    "ISOCOUNTRYCODE.GB.value",
    "ISOCOUNTRYCODE.GB.description",
    "ISOCOUNTRYCODE.GB.isEditable",
    "ISOCOUNTRYCODE.GF.value",
    "ISOCOUNTRYCODE.GF.description",
    "ISOCOUNTRYCODE.GF.isEditable",
    "ISOCOUNTRYCODE.GI.value",
    "ISOCOUNTRYCODE.GI.description",
    "ISOCOUNTRYCODE.GI.isEditable",
    "ISOCOUNTRYCODE.GN.value",
    "ISOCOUNTRYCODE.GN.description",
    "ISOCOUNTRYCODE.GN.isEditable",
    "ISOCOUNTRYCODE.GU.value",
    "ISOCOUNTRYCODE.GU.description",
    "ISOCOUNTRYCODE.GU.isEditable",
    "ISOCOUNTRYCODE.GY.value",
    "ISOCOUNTRYCODE.GY.description",
    "ISOCOUNTRYCODE.GY.isEditable",
    "ISOCOUNTRYCODE.HN.value",
    "ISOCOUNTRYCODE.HN.description",
    "ISOCOUNTRYCODE.HN.isEditable",
    "ISOCOUNTRYCODE.HU.value",
    "ISOCOUNTRYCODE.HU.description",
    "ISOCOUNTRYCODE.HU.isEditable",
    "ISOCOUNTRYCODE.IE.value",
    "ISOCOUNTRYCODE.IE.description",
    "ISOCOUNTRYCODE.IE.isEditable",
    "ISOCOUNTRYCODE.IN.value",
    "ISOCOUNTRYCODE.IN.description",
    "ISOCOUNTRYCODE.IN.isEditable",
    "ISOCOUNTRYCODE.IR.value",
    "ISOCOUNTRYCODE.IR.description",
    "ISOCOUNTRYCODE.IR.isEditable",
    "ISOCOUNTRYCODE.JE.value",
    "ISOCOUNTRYCODE.JE.description",
    "ISOCOUNTRYCODE.JE.isEditable",
    "ISOCOUNTRYCODE.JP.value",
    "ISOCOUNTRYCODE.JP.description",
    "ISOCOUNTRYCODE.JP.isEditable",
    "ISOCOUNTRYCODE.KM.value",
    "ISOCOUNTRYCODE.KM.description",
    "ISOCOUNTRYCODE.KM.isEditable",
    "ISOCOUNTRYCODE.KR.value",
    "ISOCOUNTRYCODE.KR.description",
    "ISOCOUNTRYCODE.KR.isEditable",
    "ISOCOUNTRYCODE.ME.value",
    "ISOCOUNTRYCODE.ME.description",
    "ISOCOUNTRYCODE.ME.isEditable"
})
public class Source {

    @JsonProperty("ISOCOUNTRYCODE.AW.value")
    private String iSOCOUNTRYCODEAWValue;
    @JsonProperty("ISOCOUNTRYCODE.AW.description")
    private String iSOCOUNTRYCODEAWDescription;
    @JsonProperty("ISOCOUNTRYCODE.AW.isEditable")
    private String iSOCOUNTRYCODEAWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BH.value")
    private String iSOCOUNTRYCODEBHValue;
    @JsonProperty("ISOCOUNTRYCODE.BH.description")
    private String iSOCOUNTRYCODEBHDescription;
    @JsonProperty("ISOCOUNTRYCODE.BH.isEditable")
    private String iSOCOUNTRYCODEBHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BV.value")
    private String iSOCOUNTRYCODEBVValue;
    @JsonProperty("ISOCOUNTRYCODE.BV.description")
    private String iSOCOUNTRYCODEBVDescription;
    @JsonProperty("ISOCOUNTRYCODE.BV.isEditable")
    private String iSOCOUNTRYCODEBVIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CH.value")
    private String iSOCOUNTRYCODECHValue;
    @JsonProperty("ISOCOUNTRYCODE.CH.description")
    private String iSOCOUNTRYCODECHDescription;
    @JsonProperty("ISOCOUNTRYCODE.CH.isEditable")
    private String iSOCOUNTRYCODECHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CY.value")
    private String iSOCOUNTRYCODECYValue;
    @JsonProperty("ISOCOUNTRYCODE.CY.description")
    private String iSOCOUNTRYCODECYDescription;
    @JsonProperty("ISOCOUNTRYCODE.CY.isEditable")
    private String iSOCOUNTRYCODECYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.EH.value")
    private String iSOCOUNTRYCODEEHValue;
    @JsonProperty("ISOCOUNTRYCODE.EH.description")
    private String iSOCOUNTRYCODEEHDescription;
    @JsonProperty("ISOCOUNTRYCODE.EH.isEditable")
    private String iSOCOUNTRYCODEEHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GG.value")
    private String iSOCOUNTRYCODEGGValue;
    @JsonProperty("ISOCOUNTRYCODE.GG.description")
    private String iSOCOUNTRYCODEGGDescription;
    @JsonProperty("ISOCOUNTRYCODE.GG.isEditable")
    private String iSOCOUNTRYCODEGGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.HK.value")
    private String iSOCOUNTRYCODEHKValue;
    @JsonProperty("ISOCOUNTRYCODE.HK.description")
    private String iSOCOUNTRYCODEHKDescription;
    @JsonProperty("ISOCOUNTRYCODE.HK.isEditable")
    private String iSOCOUNTRYCODEHKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IS.value")
    private String iSOCOUNTRYCODEISValue;
    @JsonProperty("ISOCOUNTRYCODE.IS.description")
    private String iSOCOUNTRYCODEISDescription;
    @JsonProperty("ISOCOUNTRYCODE.IS.isEditable")
    private String iSOCOUNTRYCODEISIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KW.value")
    private String iSOCOUNTRYCODEKWValue;
    @JsonProperty("ISOCOUNTRYCODE.KW.description")
    private String iSOCOUNTRYCODEKWDescription;
    @JsonProperty("ISOCOUNTRYCODE.KW.isEditable")
    private String iSOCOUNTRYCODEKWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LU.value")
    private String iSOCOUNTRYCODELUValue;
    @JsonProperty("ISOCOUNTRYCODE.LU.description")
    private String iSOCOUNTRYCODELUDescription;
    @JsonProperty("ISOCOUNTRYCODE.LU.isEditable")
    private String iSOCOUNTRYCODELUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MQ.value")
    private String iSOCOUNTRYCODEMQValue;
    @JsonProperty("ISOCOUNTRYCODE.MQ.description")
    private String iSOCOUNTRYCODEMQDescription;
    @JsonProperty("ISOCOUNTRYCODE.MQ.isEditable")
    private String iSOCOUNTRYCODEMQIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NG.value")
    private String iSOCOUNTRYCODENGValue;
    @JsonProperty("ISOCOUNTRYCODE.NG.description")
    private String iSOCOUNTRYCODENGDescription;
    @JsonProperty("ISOCOUNTRYCODE.NG.isEditable")
    private String iSOCOUNTRYCODENGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PE.value")
    private String iSOCOUNTRYCODEPEValue;
    @JsonProperty("ISOCOUNTRYCODE.PE.description")
    private String iSOCOUNTRYCODEPEDescription;
    @JsonProperty("ISOCOUNTRYCODE.PE.isEditable")
    private String iSOCOUNTRYCODEPEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PR.value")
    private String iSOCOUNTRYCODEPRValue;
    @JsonProperty("ISOCOUNTRYCODE.PR.description")
    private String iSOCOUNTRYCODEPRDescription;
    @JsonProperty("ISOCOUNTRYCODE.PR.isEditable")
    private String iSOCOUNTRYCODEPRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.RW.value")
    private String iSOCOUNTRYCODERWValue;
    @JsonProperty("ISOCOUNTRYCODE.RW.description")
    private String iSOCOUNTRYCODERWDescription;
    @JsonProperty("ISOCOUNTRYCODE.RW.isEditable")
    private String iSOCOUNTRYCODERWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SJ.value")
    private String iSOCOUNTRYCODESJValue;
    @JsonProperty("ISOCOUNTRYCODE.SJ.description")
    private String iSOCOUNTRYCODESJDescription;
    @JsonProperty("ISOCOUNTRYCODE.SJ.isEditable")
    private String iSOCOUNTRYCODESJIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TD.value")
    private String iSOCOUNTRYCODETDValue;
    @JsonProperty("ISOCOUNTRYCODE.TD.description")
    private String iSOCOUNTRYCODETDDescription;
    @JsonProperty("ISOCOUNTRYCODE.TD.isEditable")
    private String iSOCOUNTRYCODETDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TV.value")
    private String iSOCOUNTRYCODETVValue;
    @JsonProperty("ISOCOUNTRYCODE.TV.description")
    private String iSOCOUNTRYCODETVDescription;
    @JsonProperty("ISOCOUNTRYCODE.TV.isEditable")
    private String iSOCOUNTRYCODETVIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VG.value")
    private String iSOCOUNTRYCODEVGValue;
    @JsonProperty("ISOCOUNTRYCODE.VG.description")
    private String iSOCOUNTRYCODEVGDescription;
    @JsonProperty("ISOCOUNTRYCODE.VG.isEditable")
    private String iSOCOUNTRYCODEVGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BQ.value")
    private String iSOCOUNTRYCODEBQValue;
    @JsonProperty("ISOCOUNTRYCODE.BQ.description")
    private String iSOCOUNTRYCODEBQDescription;
    @JsonProperty("ISOCOUNTRYCODE.BQ.isEditable")
    private String iSOCOUNTRYCODEBQIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AU.value")
    private String iSOCOUNTRYCODEAUValue;
    @JsonProperty("ISOCOUNTRYCODE.AU.description")
    private String iSOCOUNTRYCODEAUDescription;
    @JsonProperty("ISOCOUNTRYCODE.AU.isEditable")
    private String iSOCOUNTRYCODEAUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BM.value")
    private String iSOCOUNTRYCODEBMValue;
    @JsonProperty("ISOCOUNTRYCODE.BM.description")
    private String iSOCOUNTRYCODEBMDescription;
    @JsonProperty("ISOCOUNTRYCODE.BM.isEditable")
    private String iSOCOUNTRYCODEBMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CA.value")
    private String iSOCOUNTRYCODECAValue;
    @JsonProperty("ISOCOUNTRYCODE.CA.description")
    private String iSOCOUNTRYCODECADescription;
    @JsonProperty("ISOCOUNTRYCODE.CA.isEditable")
    private String iSOCOUNTRYCODECAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CO.value")
    private String iSOCOUNTRYCODECOValue;
    @JsonProperty("ISOCOUNTRYCODE.CO.description")
    private String iSOCOUNTRYCODECODescription;
    @JsonProperty("ISOCOUNTRYCODE.CO.isEditable")
    private String iSOCOUNTRYCODECOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.EE.value")
    private String iSOCOUNTRYCODEEEValue;
    @JsonProperty("ISOCOUNTRYCODE.EE.description")
    private String iSOCOUNTRYCODEEEDescription;
    @JsonProperty("ISOCOUNTRYCODE.EE.isEditable")
    private String iSOCOUNTRYCODEEEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GE.value")
    private String iSOCOUNTRYCODEGEValue;
    @JsonProperty("ISOCOUNTRYCODE.GE.description")
    private String iSOCOUNTRYCODEGEDescription;
    @JsonProperty("ISOCOUNTRYCODE.GE.isEditable")
    private String iSOCOUNTRYCODEGEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.HR.value")
    private String iSOCOUNTRYCODEHRValue;
    @JsonProperty("ISOCOUNTRYCODE.HR.description")
    private String iSOCOUNTRYCODEHRDescription;
    @JsonProperty("ISOCOUNTRYCODE.HR.isEditable")
    private String iSOCOUNTRYCODEHRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KE.value")
    private String iSOCOUNTRYCODEKEValue;
    @JsonProperty("ISOCOUNTRYCODE.KE.description")
    private String iSOCOUNTRYCODEKEDescription;
    @JsonProperty("ISOCOUNTRYCODE.KE.isEditable")
    private String iSOCOUNTRYCODEKEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LI.value")
    private String iSOCOUNTRYCODELIValue;
    @JsonProperty("ISOCOUNTRYCODE.LI.description")
    private String iSOCOUNTRYCODELIDescription;
    @JsonProperty("ISOCOUNTRYCODE.LI.isEditable")
    private String iSOCOUNTRYCODELIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MR.value")
    private String iSOCOUNTRYCODEMRValue;
    @JsonProperty("ISOCOUNTRYCODE.MR.description")
    private String iSOCOUNTRYCODEMRDescription;
    @JsonProperty("ISOCOUNTRYCODE.MR.isEditable")
    private String iSOCOUNTRYCODEMRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PM.value")
    private String iSOCOUNTRYCODEPMValue;
    @JsonProperty("ISOCOUNTRYCODE.PM.description")
    private String iSOCOUNTRYCODEPMDescription;
    @JsonProperty("ISOCOUNTRYCODE.PM.isEditable")
    private String iSOCOUNTRYCODEPMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SC.value")
    private String iSOCOUNTRYCODESCValue;
    @JsonProperty("ISOCOUNTRYCODE.SC.description")
    private String iSOCOUNTRYCODESCDescription;
    @JsonProperty("ISOCOUNTRYCODE.SC.isEditable")
    private String iSOCOUNTRYCODESCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SO.value")
    private String iSOCOUNTRYCODESOValue;
    @JsonProperty("ISOCOUNTRYCODE.SO.description")
    private String iSOCOUNTRYCODESODescription;
    @JsonProperty("ISOCOUNTRYCODE.SO.isEditable")
    private String iSOCOUNTRYCODESOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TM.value")
    private String iSOCOUNTRYCODETMValue;
    @JsonProperty("ISOCOUNTRYCODE.TM.description")
    private String iSOCOUNTRYCODETMDescription;
    @JsonProperty("ISOCOUNTRYCODE.TM.isEditable")
    private String iSOCOUNTRYCODETMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VN.value")
    private String iSOCOUNTRYCODEVNValue;
    @JsonProperty("ISOCOUNTRYCODE.VN.description")
    private String iSOCOUNTRYCODEVNDescription;
    @JsonProperty("ISOCOUNTRYCODE.VN.isEditable")
    private String iSOCOUNTRYCODEVNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GQ.value")
    private String iSOCOUNTRYCODEGQValue;
    @JsonProperty("ISOCOUNTRYCODE.GQ.description")
    private String iSOCOUNTRYCODEGQDescription;
    @JsonProperty("ISOCOUNTRYCODE.GQ.isEditable")
    private String iSOCOUNTRYCODEGQIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KH.value")
    private String iSOCOUNTRYCODEKHValue;
    @JsonProperty("ISOCOUNTRYCODE.KH.description")
    private String iSOCOUNTRYCODEKHDescription;
    @JsonProperty("ISOCOUNTRYCODE.KH.isEditable")
    private String iSOCOUNTRYCODEKHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LA.value")
    private String iSOCOUNTRYCODELAValue;
    @JsonProperty("ISOCOUNTRYCODE.LA.description")
    private String iSOCOUNTRYCODELADescription;
    @JsonProperty("ISOCOUNTRYCODE.LA.isEditable")
    private String iSOCOUNTRYCODELAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LK.value")
    private String iSOCOUNTRYCODELKValue;
    @JsonProperty("ISOCOUNTRYCODE.LK.description")
    private String iSOCOUNTRYCODELKDescription;
    @JsonProperty("ISOCOUNTRYCODE.LK.isEditable")
    private String iSOCOUNTRYCODELKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LT.value")
    private String iSOCOUNTRYCODELTValue;
    @JsonProperty("ISOCOUNTRYCODE.LT.description")
    private String iSOCOUNTRYCODELTDescription;
    @JsonProperty("ISOCOUNTRYCODE.LT.isEditable")
    private String iSOCOUNTRYCODELTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LY.value")
    private String iSOCOUNTRYCODELYValue;
    @JsonProperty("ISOCOUNTRYCODE.LY.description")
    private String iSOCOUNTRYCODELYDescription;
    @JsonProperty("ISOCOUNTRYCODE.LY.isEditable")
    private String iSOCOUNTRYCODELYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MC.value")
    private String iSOCOUNTRYCODEMCValue;
    @JsonProperty("ISOCOUNTRYCODE.MC.description")
    private String iSOCOUNTRYCODEMCDescription;
    @JsonProperty("ISOCOUNTRYCODE.MC.isEditable")
    private String iSOCOUNTRYCODEMCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MH.value")
    private String iSOCOUNTRYCODEMHValue;
    @JsonProperty("ISOCOUNTRYCODE.MH.description")
    private String iSOCOUNTRYCODEMHDescription;
    @JsonProperty("ISOCOUNTRYCODE.MH.isEditable")
    private String iSOCOUNTRYCODEMHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MM.value")
    private String iSOCOUNTRYCODEMMValue;
    @JsonProperty("ISOCOUNTRYCODE.MM.description")
    private String iSOCOUNTRYCODEMMDescription;
    @JsonProperty("ISOCOUNTRYCODE.MM.isEditable")
    private String iSOCOUNTRYCODEMMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MP.value")
    private String iSOCOUNTRYCODEMPValue;
    @JsonProperty("ISOCOUNTRYCODE.MP.description")
    private String iSOCOUNTRYCODEMPDescription;
    @JsonProperty("ISOCOUNTRYCODE.MP.isEditable")
    private String iSOCOUNTRYCODEMPIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MS.value")
    private String iSOCOUNTRYCODEMSValue;
    @JsonProperty("ISOCOUNTRYCODE.MS.description")
    private String iSOCOUNTRYCODEMSDescription;
    @JsonProperty("ISOCOUNTRYCODE.MS.isEditable")
    private String iSOCOUNTRYCODEMSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MV.value")
    private String iSOCOUNTRYCODEMVValue;
    @JsonProperty("ISOCOUNTRYCODE.MV.description")
    private String iSOCOUNTRYCODEMVDescription;
    @JsonProperty("ISOCOUNTRYCODE.MV.isEditable")
    private String iSOCOUNTRYCODEMVIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NU.value")
    private String iSOCOUNTRYCODENUValue;
    @JsonProperty("ISOCOUNTRYCODE.NU.description")
    private String iSOCOUNTRYCODENUDescription;
    @JsonProperty("ISOCOUNTRYCODE.NU.isEditable")
    private String iSOCOUNTRYCODENUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ST.value")
    private String iSOCOUNTRYCODESTValue;
    @JsonProperty("ISOCOUNTRYCODE.ST.description")
    private String iSOCOUNTRYCODESTDescription;
    @JsonProperty("ISOCOUNTRYCODE.ST.isEditable")
    private String iSOCOUNTRYCODESTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TC.value")
    private String iSOCOUNTRYCODETCValue;
    @JsonProperty("ISOCOUNTRYCODE.TC.description")
    private String iSOCOUNTRYCODETCDescription;
    @JsonProperty("ISOCOUNTRYCODE.TC.isEditable")
    private String iSOCOUNTRYCODETCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TG.value")
    private String iSOCOUNTRYCODETGValue;
    @JsonProperty("ISOCOUNTRYCODE.TG.description")
    private String iSOCOUNTRYCODETGDescription;
    @JsonProperty("ISOCOUNTRYCODE.TG.isEditable")
    private String iSOCOUNTRYCODETGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TK.value")
    private String iSOCOUNTRYCODETKValue;
    @JsonProperty("ISOCOUNTRYCODE.TK.description")
    private String iSOCOUNTRYCODETKDescription;
    @JsonProperty("ISOCOUNTRYCODE.TK.isEditable")
    private String iSOCOUNTRYCODETKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TO.value")
    private String iSOCOUNTRYCODETOValue;
    @JsonProperty("ISOCOUNTRYCODE.TO.description")
    private String iSOCOUNTRYCODETODescription;
    @JsonProperty("ISOCOUNTRYCODE.TO.isEditable")
    private String iSOCOUNTRYCODETOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TT.value")
    private String iSOCOUNTRYCODETTValue;
    @JsonProperty("ISOCOUNTRYCODE.TT.description")
    private String iSOCOUNTRYCODETTDescription;
    @JsonProperty("ISOCOUNTRYCODE.TT.isEditable")
    private String iSOCOUNTRYCODETTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.UA.value")
    private String iSOCOUNTRYCODEUAValue;
    @JsonProperty("ISOCOUNTRYCODE.UA.description")
    private String iSOCOUNTRYCODEUADescription;
    @JsonProperty("ISOCOUNTRYCODE.UA.isEditable")
    private String iSOCOUNTRYCODEUAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.UM.value")
    private String iSOCOUNTRYCODEUMValue;
    @JsonProperty("ISOCOUNTRYCODE.UM.description")
    private String iSOCOUNTRYCODEUMDescription;
    @JsonProperty("ISOCOUNTRYCODE.UM.isEditable")
    private String iSOCOUNTRYCODEUMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VA.value")
    private String iSOCOUNTRYCODEVAValue;
    @JsonProperty("ISOCOUNTRYCODE.VA.description")
    private String iSOCOUNTRYCODEVADescription;
    @JsonProperty("ISOCOUNTRYCODE.VA.isEditable")
    private String iSOCOUNTRYCODEVAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VI.value")
    private String iSOCOUNTRYCODEVIValue;
    @JsonProperty("ISOCOUNTRYCODE.VI.description")
    private String iSOCOUNTRYCODEVIDescription;
    @JsonProperty("ISOCOUNTRYCODE.VI.isEditable")
    private String iSOCOUNTRYCODEVIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.WF.value")
    private String iSOCOUNTRYCODEWFValue;
    @JsonProperty("ISOCOUNTRYCODE.WF.description")
    private String iSOCOUNTRYCODEWFDescription;
    @JsonProperty("ISOCOUNTRYCODE.WF.isEditable")
    private String iSOCOUNTRYCODEWFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ZA.value")
    private String iSOCOUNTRYCODEZAValue;
    @JsonProperty("ISOCOUNTRYCODE.ZA.description")
    private String iSOCOUNTRYCODEZADescription;
    @JsonProperty("ISOCOUNTRYCODE.ZA.isEditable")
    private String iSOCOUNTRYCODEZAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AX.value")
    private String iSOCOUNTRYCODEAXValue;
    @JsonProperty("ISOCOUNTRYCODE.AX.description")
    private String iSOCOUNTRYCODEAXDescription;
    @JsonProperty("ISOCOUNTRYCODE.AX.isEditable")
    private String iSOCOUNTRYCODEAXIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MF.value")
    private String iSOCOUNTRYCODEMFValue;
    @JsonProperty("ISOCOUNTRYCODE.MF.description")
    private String iSOCOUNTRYCODEMFDescription;
    @JsonProperty("ISOCOUNTRYCODE.MF.isEditable")
    private String iSOCOUNTRYCODEMFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CW.value")
    private String iSOCOUNTRYCODECWValue;
    @JsonProperty("ISOCOUNTRYCODE.CW.description")
    private String iSOCOUNTRYCODECWDescription;
    @JsonProperty("ISOCOUNTRYCODE.CW.isEditable")
    private String iSOCOUNTRYCODECWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BL.value")
    private String iSOCOUNTRYCODEBLValue;
    @JsonProperty("ISOCOUNTRYCODE.BL.description")
    private String iSOCOUNTRYCODEBLDescription;
    @JsonProperty("ISOCOUNTRYCODE.BL.isEditable")
    private String iSOCOUNTRYCODEBLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SX.value")
    private String iSOCOUNTRYCODESXValue;
    @JsonProperty("ISOCOUNTRYCODE.SX.description")
    private String iSOCOUNTRYCODESXDescription;
    @JsonProperty("ISOCOUNTRYCODE.SX.isEditable")
    private String iSOCOUNTRYCODESXIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TL.value")
    private String iSOCOUNTRYCODETLValue;
    @JsonProperty("ISOCOUNTRYCODE.TL.description")
    private String iSOCOUNTRYCODETLDescription;
    @JsonProperty("ISOCOUNTRYCODE.TL.isEditable")
    private String iSOCOUNTRYCODETLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SS.value")
    private String iSOCOUNTRYCODESSValue;
    @JsonProperty("ISOCOUNTRYCODE.SS.description")
    private String iSOCOUNTRYCODESSDescription;
    @JsonProperty("ISOCOUNTRYCODE.SS.isEditable")
    private String iSOCOUNTRYCODESSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.RS.value")
    private String iSOCOUNTRYCODERSValue;
    @JsonProperty("ISOCOUNTRYCODE.RS.description")
    private String iSOCOUNTRYCODERSDescription;
    @JsonProperty("ISOCOUNTRYCODE.RS.isEditable")
    private String iSOCOUNTRYCODERSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AD.value")
    private String iSOCOUNTRYCODEADValue;
    @JsonProperty("ISOCOUNTRYCODE.AD.description")
    private String iSOCOUNTRYCODEADDescription;
    @JsonProperty("ISOCOUNTRYCODE.AD.isEditable")
    private String iSOCOUNTRYCODEADIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AE.value")
    private String iSOCOUNTRYCODEAEValue;
    @JsonProperty("ISOCOUNTRYCODE.AE.description")
    private String iSOCOUNTRYCODEAEDescription;
    @JsonProperty("ISOCOUNTRYCODE.AE.isEditable")
    private String iSOCOUNTRYCODEAEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AF.value")
    private String iSOCOUNTRYCODEAFValue;
    @JsonProperty("ISOCOUNTRYCODE.AF.description")
    private String iSOCOUNTRYCODEAFDescription;
    @JsonProperty("ISOCOUNTRYCODE.AF.isEditable")
    private String iSOCOUNTRYCODEAFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AG.value")
    private String iSOCOUNTRYCODEAGValue;
    @JsonProperty("ISOCOUNTRYCODE.AG.description")
    private String iSOCOUNTRYCODEAGDescription;
    @JsonProperty("ISOCOUNTRYCODE.AG.isEditable")
    private String iSOCOUNTRYCODEAGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AI.value")
    private String iSOCOUNTRYCODEAIValue;
    @JsonProperty("ISOCOUNTRYCODE.AI.description")
    private String iSOCOUNTRYCODEAIDescription;
    @JsonProperty("ISOCOUNTRYCODE.AI.isEditable")
    private String iSOCOUNTRYCODEAIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AL.value")
    private String iSOCOUNTRYCODEALValue;
    @JsonProperty("ISOCOUNTRYCODE.AL.description")
    private String iSOCOUNTRYCODEALDescription;
    @JsonProperty("ISOCOUNTRYCODE.AL.isEditable")
    private String iSOCOUNTRYCODEALIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AM.value")
    private String iSOCOUNTRYCODEAMValue;
    @JsonProperty("ISOCOUNTRYCODE.AM.description")
    private String iSOCOUNTRYCODEAMDescription;
    @JsonProperty("ISOCOUNTRYCODE.AM.isEditable")
    private String iSOCOUNTRYCODEAMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AO.value")
    private String iSOCOUNTRYCODEAOValue;
    @JsonProperty("ISOCOUNTRYCODE.AO.description")
    private String iSOCOUNTRYCODEAODescription;
    @JsonProperty("ISOCOUNTRYCODE.AO.isEditable")
    private String iSOCOUNTRYCODEAOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AQ.value")
    private String iSOCOUNTRYCODEAQValue;
    @JsonProperty("ISOCOUNTRYCODE.AQ.description")
    private String iSOCOUNTRYCODEAQDescription;
    @JsonProperty("ISOCOUNTRYCODE.AQ.isEditable")
    private String iSOCOUNTRYCODEAQIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AR.value")
    private String iSOCOUNTRYCODEARValue;
    @JsonProperty("ISOCOUNTRYCODE.AR.description")
    private String iSOCOUNTRYCODEARDescription;
    @JsonProperty("ISOCOUNTRYCODE.AR.isEditable")
    private String iSOCOUNTRYCODEARIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AS.value")
    private String iSOCOUNTRYCODEASValue;
    @JsonProperty("ISOCOUNTRYCODE.AS.description")
    private String iSOCOUNTRYCODEASDescription;
    @JsonProperty("ISOCOUNTRYCODE.AS.isEditable")
    private String iSOCOUNTRYCODEASIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AT.value")
    private String iSOCOUNTRYCODEATValue;
    @JsonProperty("ISOCOUNTRYCODE.AT.description")
    private String iSOCOUNTRYCODEATDescription;
    @JsonProperty("ISOCOUNTRYCODE.AT.isEditable")
    private String iSOCOUNTRYCODEATIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.AZ.value")
    private String iSOCOUNTRYCODEAZValue;
    @JsonProperty("ISOCOUNTRYCODE.AZ.description")
    private String iSOCOUNTRYCODEAZDescription;
    @JsonProperty("ISOCOUNTRYCODE.AZ.isEditable")
    private String iSOCOUNTRYCODEAZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BA.value")
    private String iSOCOUNTRYCODEBAValue;
    @JsonProperty("ISOCOUNTRYCODE.BA.description")
    private String iSOCOUNTRYCODEBADescription;
    @JsonProperty("ISOCOUNTRYCODE.BA.isEditable")
    private String iSOCOUNTRYCODEBAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BB.value")
    private String iSOCOUNTRYCODEBBValue;
    @JsonProperty("ISOCOUNTRYCODE.BB.description")
    private String iSOCOUNTRYCODEBBDescription;
    @JsonProperty("ISOCOUNTRYCODE.BB.isEditable")
    private String iSOCOUNTRYCODEBBIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BD.value")
    private String iSOCOUNTRYCODEBDValue;
    @JsonProperty("ISOCOUNTRYCODE.BD.description")
    private String iSOCOUNTRYCODEBDDescription;
    @JsonProperty("ISOCOUNTRYCODE.BD.isEditable")
    private String iSOCOUNTRYCODEBDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BE.value")
    private String iSOCOUNTRYCODEBEValue;
    @JsonProperty("ISOCOUNTRYCODE.BE.description")
    private String iSOCOUNTRYCODEBEDescription;
    @JsonProperty("ISOCOUNTRYCODE.BE.isEditable")
    private String iSOCOUNTRYCODEBEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BF.value")
    private String iSOCOUNTRYCODEBFValue;
    @JsonProperty("ISOCOUNTRYCODE.BF.description")
    private String iSOCOUNTRYCODEBFDescription;
    @JsonProperty("ISOCOUNTRYCODE.BF.isEditable")
    private String iSOCOUNTRYCODEBFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BG.value")
    private String iSOCOUNTRYCODEBGValue;
    @JsonProperty("ISOCOUNTRYCODE.BG.description")
    private String iSOCOUNTRYCODEBGDescription;
    @JsonProperty("ISOCOUNTRYCODE.BG.isEditable")
    private String iSOCOUNTRYCODEBGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BI.value")
    private String iSOCOUNTRYCODEBIValue;
    @JsonProperty("ISOCOUNTRYCODE.BI.description")
    private String iSOCOUNTRYCODEBIDescription;
    @JsonProperty("ISOCOUNTRYCODE.BI.isEditable")
    private String iSOCOUNTRYCODEBIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BJ.value")
    private String iSOCOUNTRYCODEBJValue;
    @JsonProperty("ISOCOUNTRYCODE.BJ.description")
    private String iSOCOUNTRYCODEBJDescription;
    @JsonProperty("ISOCOUNTRYCODE.BJ.isEditable")
    private String iSOCOUNTRYCODEBJIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BN.value")
    private String iSOCOUNTRYCODEBNValue;
    @JsonProperty("ISOCOUNTRYCODE.BN.description")
    private String iSOCOUNTRYCODEBNDescription;
    @JsonProperty("ISOCOUNTRYCODE.BN.isEditable")
    private String iSOCOUNTRYCODEBNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BO.value")
    private String iSOCOUNTRYCODEBOValue;
    @JsonProperty("ISOCOUNTRYCODE.BO.description")
    private String iSOCOUNTRYCODEBODescription;
    @JsonProperty("ISOCOUNTRYCODE.BO.isEditable")
    private String iSOCOUNTRYCODEBOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BR.value")
    private String iSOCOUNTRYCODEBRValue;
    @JsonProperty("ISOCOUNTRYCODE.BR.description")
    private String iSOCOUNTRYCODEBRDescription;
    @JsonProperty("ISOCOUNTRYCODE.BR.isEditable")
    private String iSOCOUNTRYCODEBRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BS.value")
    private String iSOCOUNTRYCODEBSValue;
    @JsonProperty("ISOCOUNTRYCODE.BS.description")
    private String iSOCOUNTRYCODEBSDescription;
    @JsonProperty("ISOCOUNTRYCODE.BS.isEditable")
    private String iSOCOUNTRYCODEBSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BT.value")
    private String iSOCOUNTRYCODEBTValue;
    @JsonProperty("ISOCOUNTRYCODE.BT.description")
    private String iSOCOUNTRYCODEBTDescription;
    @JsonProperty("ISOCOUNTRYCODE.BT.isEditable")
    private String iSOCOUNTRYCODEBTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BW.value")
    private String iSOCOUNTRYCODEBWValue;
    @JsonProperty("ISOCOUNTRYCODE.BW.description")
    private String iSOCOUNTRYCODEBWDescription;
    @JsonProperty("ISOCOUNTRYCODE.BW.isEditable")
    private String iSOCOUNTRYCODEBWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BY.value")
    private String iSOCOUNTRYCODEBYValue;
    @JsonProperty("ISOCOUNTRYCODE.BY.description")
    private String iSOCOUNTRYCODEBYDescription;
    @JsonProperty("ISOCOUNTRYCODE.BY.isEditable")
    private String iSOCOUNTRYCODEBYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.BZ.value")
    private String iSOCOUNTRYCODEBZValue;
    @JsonProperty("ISOCOUNTRYCODE.BZ.description")
    private String iSOCOUNTRYCODEBZDescription;
    @JsonProperty("ISOCOUNTRYCODE.BZ.isEditable")
    private String iSOCOUNTRYCODEBZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CC.value")
    private String iSOCOUNTRYCODECCValue;
    @JsonProperty("ISOCOUNTRYCODE.CC.description")
    private String iSOCOUNTRYCODECCDescription;
    @JsonProperty("ISOCOUNTRYCODE.CC.isEditable")
    private String iSOCOUNTRYCODECCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CD.value")
    private String iSOCOUNTRYCODECDValue;
    @JsonProperty("ISOCOUNTRYCODE.CD.description")
    private String iSOCOUNTRYCODECDDescription;
    @JsonProperty("ISOCOUNTRYCODE.CD.isEditable")
    private String iSOCOUNTRYCODECDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CF.value")
    private String iSOCOUNTRYCODECFValue;
    @JsonProperty("ISOCOUNTRYCODE.CF.description")
    private String iSOCOUNTRYCODECFDescription;
    @JsonProperty("ISOCOUNTRYCODE.CF.isEditable")
    private String iSOCOUNTRYCODECFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CG.value")
    private String iSOCOUNTRYCODECGValue;
    @JsonProperty("ISOCOUNTRYCODE.CG.description")
    private String iSOCOUNTRYCODECGDescription;
    @JsonProperty("ISOCOUNTRYCODE.CG.isEditable")
    private String iSOCOUNTRYCODECGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CI.value")
    private String iSOCOUNTRYCODECIValue;
    @JsonProperty("ISOCOUNTRYCODE.CI.description")
    private String iSOCOUNTRYCODECIDescription;
    @JsonProperty("ISOCOUNTRYCODE.CI.isEditable")
    private String iSOCOUNTRYCODECIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CK.value")
    private String iSOCOUNTRYCODECKValue;
    @JsonProperty("ISOCOUNTRYCODE.CK.description")
    private String iSOCOUNTRYCODECKDescription;
    @JsonProperty("ISOCOUNTRYCODE.CK.isEditable")
    private String iSOCOUNTRYCODECKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CL.value")
    private String iSOCOUNTRYCODECLValue;
    @JsonProperty("ISOCOUNTRYCODE.CL.description")
    private String iSOCOUNTRYCODECLDescription;
    @JsonProperty("ISOCOUNTRYCODE.CL.isEditable")
    private String iSOCOUNTRYCODECLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CM.value")
    private String iSOCOUNTRYCODECMValue;
    @JsonProperty("ISOCOUNTRYCODE.CM.description")
    private String iSOCOUNTRYCODECMDescription;
    @JsonProperty("ISOCOUNTRYCODE.CM.isEditable")
    private String iSOCOUNTRYCODECMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CN.value")
    private String iSOCOUNTRYCODECNValue;
    @JsonProperty("ISOCOUNTRYCODE.CN.description")
    private String iSOCOUNTRYCODECNDescription;
    @JsonProperty("ISOCOUNTRYCODE.CN.isEditable")
    private String iSOCOUNTRYCODECNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CR.value")
    private String iSOCOUNTRYCODECRValue;
    @JsonProperty("ISOCOUNTRYCODE.CR.description")
    private String iSOCOUNTRYCODECRDescription;
    @JsonProperty("ISOCOUNTRYCODE.CR.isEditable")
    private String iSOCOUNTRYCODECRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CU.value")
    private String iSOCOUNTRYCODECUValue;
    @JsonProperty("ISOCOUNTRYCODE.CU.description")
    private String iSOCOUNTRYCODECUDescription;
    @JsonProperty("ISOCOUNTRYCODE.CU.isEditable")
    private String iSOCOUNTRYCODECUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CV.value")
    private String iSOCOUNTRYCODECVValue;
    @JsonProperty("ISOCOUNTRYCODE.CV.description")
    private String iSOCOUNTRYCODECVDescription;
    @JsonProperty("ISOCOUNTRYCODE.CV.isEditable")
    private String iSOCOUNTRYCODECVIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CZ.value")
    private String iSOCOUNTRYCODECZValue;
    @JsonProperty("ISOCOUNTRYCODE.CZ.description")
    private String iSOCOUNTRYCODECZDescription;
    @JsonProperty("ISOCOUNTRYCODE.CZ.isEditable")
    private String iSOCOUNTRYCODECZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.DE.value")
    private String iSOCOUNTRYCODEDEValue;
    @JsonProperty("ISOCOUNTRYCODE.DE.description")
    private String iSOCOUNTRYCODEDEDescription;
    @JsonProperty("ISOCOUNTRYCODE.DE.isEditable")
    private String iSOCOUNTRYCODEDEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.DK.value")
    private String iSOCOUNTRYCODEDKValue;
    @JsonProperty("ISOCOUNTRYCODE.DK.description")
    private String iSOCOUNTRYCODEDKDescription;
    @JsonProperty("ISOCOUNTRYCODE.DK.isEditable")
    private String iSOCOUNTRYCODEDKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.DM.value")
    private String iSOCOUNTRYCODEDMValue;
    @JsonProperty("ISOCOUNTRYCODE.DM.description")
    private String iSOCOUNTRYCODEDMDescription;
    @JsonProperty("ISOCOUNTRYCODE.DM.isEditable")
    private String iSOCOUNTRYCODEDMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.DZ.value")
    private String iSOCOUNTRYCODEDZValue;
    @JsonProperty("ISOCOUNTRYCODE.DZ.description")
    private String iSOCOUNTRYCODEDZDescription;
    @JsonProperty("ISOCOUNTRYCODE.DZ.isEditable")
    private String iSOCOUNTRYCODEDZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.EC.value")
    private String iSOCOUNTRYCODEECValue;
    @JsonProperty("ISOCOUNTRYCODE.EC.description")
    private String iSOCOUNTRYCODEECDescription;
    @JsonProperty("ISOCOUNTRYCODE.EC.isEditable")
    private String iSOCOUNTRYCODEECIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ES.value")
    private String iSOCOUNTRYCODEESValue;
    @JsonProperty("ISOCOUNTRYCODE.ES.description")
    private String iSOCOUNTRYCODEESDescription;
    @JsonProperty("ISOCOUNTRYCODE.ES.isEditable")
    private String iSOCOUNTRYCODEESIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ET.value")
    private String iSOCOUNTRYCODEETValue;
    @JsonProperty("ISOCOUNTRYCODE.ET.description")
    private String iSOCOUNTRYCODEETDescription;
    @JsonProperty("ISOCOUNTRYCODE.ET.isEditable")
    private String iSOCOUNTRYCODEETIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.FJ.value")
    private String iSOCOUNTRYCODEFJValue;
    @JsonProperty("ISOCOUNTRYCODE.FJ.description")
    private String iSOCOUNTRYCODEFJDescription;
    @JsonProperty("ISOCOUNTRYCODE.FJ.isEditable")
    private String iSOCOUNTRYCODEFJIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.FK.value")
    private String iSOCOUNTRYCODEFKValue;
    @JsonProperty("ISOCOUNTRYCODE.FK.description")
    private String iSOCOUNTRYCODEFKDescription;
    @JsonProperty("ISOCOUNTRYCODE.FK.isEditable")
    private String iSOCOUNTRYCODEFKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.FO.value")
    private String iSOCOUNTRYCODEFOValue;
    @JsonProperty("ISOCOUNTRYCODE.FO.description")
    private String iSOCOUNTRYCODEFODescription;
    @JsonProperty("ISOCOUNTRYCODE.FO.isEditable")
    private String iSOCOUNTRYCODEFOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.FR.value")
    private String iSOCOUNTRYCODEFRValue;
    @JsonProperty("ISOCOUNTRYCODE.FR.description")
    private String iSOCOUNTRYCODEFRDescription;
    @JsonProperty("ISOCOUNTRYCODE.FR.isEditable")
    private String iSOCOUNTRYCODEFRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GA.value")
    private String iSOCOUNTRYCODEGAValue;
    @JsonProperty("ISOCOUNTRYCODE.GA.description")
    private String iSOCOUNTRYCODEGADescription;
    @JsonProperty("ISOCOUNTRYCODE.GA.isEditable")
    private String iSOCOUNTRYCODEGAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GD.value")
    private String iSOCOUNTRYCODEGDValue;
    @JsonProperty("ISOCOUNTRYCODE.GD.description")
    private String iSOCOUNTRYCODEGDDescription;
    @JsonProperty("ISOCOUNTRYCODE.GD.isEditable")
    private String iSOCOUNTRYCODEGDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GH.value")
    private String iSOCOUNTRYCODEGHValue;
    @JsonProperty("ISOCOUNTRYCODE.GH.description")
    private String iSOCOUNTRYCODEGHDescription;
    @JsonProperty("ISOCOUNTRYCODE.GH.isEditable")
    private String iSOCOUNTRYCODEGHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GL.value")
    private String iSOCOUNTRYCODEGLValue;
    @JsonProperty("ISOCOUNTRYCODE.GL.description")
    private String iSOCOUNTRYCODEGLDescription;
    @JsonProperty("ISOCOUNTRYCODE.GL.isEditable")
    private String iSOCOUNTRYCODEGLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GM.value")
    private String iSOCOUNTRYCODEGMValue;
    @JsonProperty("ISOCOUNTRYCODE.GM.description")
    private String iSOCOUNTRYCODEGMDescription;
    @JsonProperty("ISOCOUNTRYCODE.GM.isEditable")
    private String iSOCOUNTRYCODEGMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GP.value")
    private String iSOCOUNTRYCODEGPValue;
    @JsonProperty("ISOCOUNTRYCODE.GP.description")
    private String iSOCOUNTRYCODEGPDescription;
    @JsonProperty("ISOCOUNTRYCODE.GP.isEditable")
    private String iSOCOUNTRYCODEGPIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GR.value")
    private String iSOCOUNTRYCODEGRValue;
    @JsonProperty("ISOCOUNTRYCODE.GR.description")
    private String iSOCOUNTRYCODEGRDescription;
    @JsonProperty("ISOCOUNTRYCODE.GR.isEditable")
    private String iSOCOUNTRYCODEGRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GS.value")
    private String iSOCOUNTRYCODEGSValue;
    @JsonProperty("ISOCOUNTRYCODE.GS.description")
    private String iSOCOUNTRYCODEGSDescription;
    @JsonProperty("ISOCOUNTRYCODE.GS.isEditable")
    private String iSOCOUNTRYCODEGSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GT.value")
    private String iSOCOUNTRYCODEGTValue;
    @JsonProperty("ISOCOUNTRYCODE.GT.description")
    private String iSOCOUNTRYCODEGTDescription;
    @JsonProperty("ISOCOUNTRYCODE.GT.isEditable")
    private String iSOCOUNTRYCODEGTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GW.value")
    private String iSOCOUNTRYCODEGWValue;
    @JsonProperty("ISOCOUNTRYCODE.GW.description")
    private String iSOCOUNTRYCODEGWDescription;
    @JsonProperty("ISOCOUNTRYCODE.GW.isEditable")
    private String iSOCOUNTRYCODEGWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.HM.value")
    private String iSOCOUNTRYCODEHMValue;
    @JsonProperty("ISOCOUNTRYCODE.HM.description")
    private String iSOCOUNTRYCODEHMDescription;
    @JsonProperty("ISOCOUNTRYCODE.HM.isEditable")
    private String iSOCOUNTRYCODEHMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.HT.value")
    private String iSOCOUNTRYCODEHTValue;
    @JsonProperty("ISOCOUNTRYCODE.HT.description")
    private String iSOCOUNTRYCODEHTDescription;
    @JsonProperty("ISOCOUNTRYCODE.HT.isEditable")
    private String iSOCOUNTRYCODEHTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ID.value")
    private String iSOCOUNTRYCODEIDValue;
    @JsonProperty("ISOCOUNTRYCODE.ID.description")
    private String iSOCOUNTRYCODEIDDescription;
    @JsonProperty("ISOCOUNTRYCODE.ID.isEditable")
    private String iSOCOUNTRYCODEIDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IL.value")
    private String iSOCOUNTRYCODEILValue;
    @JsonProperty("ISOCOUNTRYCODE.IL.description")
    private String iSOCOUNTRYCODEILDescription;
    @JsonProperty("ISOCOUNTRYCODE.IL.isEditable")
    private String iSOCOUNTRYCODEILIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IM.value")
    private String iSOCOUNTRYCODEIMValue;
    @JsonProperty("ISOCOUNTRYCODE.IM.description")
    private String iSOCOUNTRYCODEIMDescription;
    @JsonProperty("ISOCOUNTRYCODE.IM.isEditable")
    private String iSOCOUNTRYCODEIMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IO.value")
    private String iSOCOUNTRYCODEIOValue;
    @JsonProperty("ISOCOUNTRYCODE.IO.description")
    private String iSOCOUNTRYCODEIODescription;
    @JsonProperty("ISOCOUNTRYCODE.IO.isEditable")
    private String iSOCOUNTRYCODEIOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IQ.value")
    private String iSOCOUNTRYCODEIQValue;
    @JsonProperty("ISOCOUNTRYCODE.IQ.description")
    private String iSOCOUNTRYCODEIQDescription;
    @JsonProperty("ISOCOUNTRYCODE.IQ.isEditable")
    private String iSOCOUNTRYCODEIQIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IT.value")
    private String iSOCOUNTRYCODEITValue;
    @JsonProperty("ISOCOUNTRYCODE.IT.description")
    private String iSOCOUNTRYCODEITDescription;
    @JsonProperty("ISOCOUNTRYCODE.IT.isEditable")
    private String iSOCOUNTRYCODEITIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.JM.value")
    private String iSOCOUNTRYCODEJMValue;
    @JsonProperty("ISOCOUNTRYCODE.JM.description")
    private String iSOCOUNTRYCODEJMDescription;
    @JsonProperty("ISOCOUNTRYCODE.JM.isEditable")
    private String iSOCOUNTRYCODEJMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.JO.value")
    private String iSOCOUNTRYCODEJOValue;
    @JsonProperty("ISOCOUNTRYCODE.JO.description")
    private String iSOCOUNTRYCODEJODescription;
    @JsonProperty("ISOCOUNTRYCODE.JO.isEditable")
    private String iSOCOUNTRYCODEJOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KG.value")
    private String iSOCOUNTRYCODEKGValue;
    @JsonProperty("ISOCOUNTRYCODE.KG.description")
    private String iSOCOUNTRYCODEKGDescription;
    @JsonProperty("ISOCOUNTRYCODE.KG.isEditable")
    private String iSOCOUNTRYCODEKGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KI.value")
    private String iSOCOUNTRYCODEKIValue;
    @JsonProperty("ISOCOUNTRYCODE.KI.description")
    private String iSOCOUNTRYCODEKIDescription;
    @JsonProperty("ISOCOUNTRYCODE.KI.isEditable")
    private String iSOCOUNTRYCODEKIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KN.value")
    private String iSOCOUNTRYCODEKNValue;
    @JsonProperty("ISOCOUNTRYCODE.KN.description")
    private String iSOCOUNTRYCODEKNDescription;
    @JsonProperty("ISOCOUNTRYCODE.KN.isEditable")
    private String iSOCOUNTRYCODEKNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KP.value")
    private String iSOCOUNTRYCODEKPValue;
    @JsonProperty("ISOCOUNTRYCODE.KP.description")
    private String iSOCOUNTRYCODEKPDescription;
    @JsonProperty("ISOCOUNTRYCODE.KP.isEditable")
    private String iSOCOUNTRYCODEKPIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KY.value")
    private String iSOCOUNTRYCODEKYValue;
    @JsonProperty("ISOCOUNTRYCODE.KY.description")
    private String iSOCOUNTRYCODEKYDescription;
    @JsonProperty("ISOCOUNTRYCODE.KY.isEditable")
    private String iSOCOUNTRYCODEKYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KZ.value")
    private String iSOCOUNTRYCODEKZValue;
    @JsonProperty("ISOCOUNTRYCODE.KZ.description")
    private String iSOCOUNTRYCODEKZDescription;
    @JsonProperty("ISOCOUNTRYCODE.KZ.isEditable")
    private String iSOCOUNTRYCODEKZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LB.value")
    private String iSOCOUNTRYCODELBValue;
    @JsonProperty("ISOCOUNTRYCODE.LB.description")
    private String iSOCOUNTRYCODELBDescription;
    @JsonProperty("ISOCOUNTRYCODE.LB.isEditable")
    private String iSOCOUNTRYCODELBIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LC.value")
    private String iSOCOUNTRYCODELCValue;
    @JsonProperty("ISOCOUNTRYCODE.LC.description")
    private String iSOCOUNTRYCODELCDescription;
    @JsonProperty("ISOCOUNTRYCODE.LC.isEditable")
    private String iSOCOUNTRYCODELCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LR.value")
    private String iSOCOUNTRYCODELRValue;
    @JsonProperty("ISOCOUNTRYCODE.LR.description")
    private String iSOCOUNTRYCODELRDescription;
    @JsonProperty("ISOCOUNTRYCODE.LR.isEditable")
    private String iSOCOUNTRYCODELRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LS.value")
    private String iSOCOUNTRYCODELSValue;
    @JsonProperty("ISOCOUNTRYCODE.LS.description")
    private String iSOCOUNTRYCODELSDescription;
    @JsonProperty("ISOCOUNTRYCODE.LS.isEditable")
    private String iSOCOUNTRYCODELSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.LV.value")
    private String iSOCOUNTRYCODELVValue;
    @JsonProperty("ISOCOUNTRYCODE.LV.description")
    private String iSOCOUNTRYCODELVDescription;
    @JsonProperty("ISOCOUNTRYCODE.LV.isEditable")
    private String iSOCOUNTRYCODELVIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MA.value")
    private String iSOCOUNTRYCODEMAValue;
    @JsonProperty("ISOCOUNTRYCODE.MA.description")
    private String iSOCOUNTRYCODEMADescription;
    @JsonProperty("ISOCOUNTRYCODE.MA.isEditable")
    private String iSOCOUNTRYCODEMAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MD.value")
    private String iSOCOUNTRYCODEMDValue;
    @JsonProperty("ISOCOUNTRYCODE.MD.description")
    private String iSOCOUNTRYCODEMDDescription;
    @JsonProperty("ISOCOUNTRYCODE.MD.isEditable")
    private String iSOCOUNTRYCODEMDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MG.value")
    private String iSOCOUNTRYCODEMGValue;
    @JsonProperty("ISOCOUNTRYCODE.MG.description")
    private String iSOCOUNTRYCODEMGDescription;
    @JsonProperty("ISOCOUNTRYCODE.MG.isEditable")
    private String iSOCOUNTRYCODEMGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MK.value")
    private String iSOCOUNTRYCODEMKValue;
    @JsonProperty("ISOCOUNTRYCODE.MK.description")
    private String iSOCOUNTRYCODEMKDescription;
    @JsonProperty("ISOCOUNTRYCODE.MK.isEditable")
    private String iSOCOUNTRYCODEMKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ML.value")
    private String iSOCOUNTRYCODEMLValue;
    @JsonProperty("ISOCOUNTRYCODE.ML.description")
    private String iSOCOUNTRYCODEMLDescription;
    @JsonProperty("ISOCOUNTRYCODE.ML.isEditable")
    private String iSOCOUNTRYCODEMLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MN.value")
    private String iSOCOUNTRYCODEMNValue;
    @JsonProperty("ISOCOUNTRYCODE.MN.description")
    private String iSOCOUNTRYCODEMNDescription;
    @JsonProperty("ISOCOUNTRYCODE.MN.isEditable")
    private String iSOCOUNTRYCODEMNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MO.value")
    private String iSOCOUNTRYCODEMOValue;
    @JsonProperty("ISOCOUNTRYCODE.MO.description")
    private String iSOCOUNTRYCODEMODescription;
    @JsonProperty("ISOCOUNTRYCODE.MO.isEditable")
    private String iSOCOUNTRYCODEMOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MT.value")
    private String iSOCOUNTRYCODEMTValue;
    @JsonProperty("ISOCOUNTRYCODE.MT.description")
    private String iSOCOUNTRYCODEMTDescription;
    @JsonProperty("ISOCOUNTRYCODE.MT.isEditable")
    private String iSOCOUNTRYCODEMTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MU.value")
    private String iSOCOUNTRYCODEMUValue;
    @JsonProperty("ISOCOUNTRYCODE.MU.description")
    private String iSOCOUNTRYCODEMUDescription;
    @JsonProperty("ISOCOUNTRYCODE.MU.isEditable")
    private String iSOCOUNTRYCODEMUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MW.value")
    private String iSOCOUNTRYCODEMWValue;
    @JsonProperty("ISOCOUNTRYCODE.MW.description")
    private String iSOCOUNTRYCODEMWDescription;
    @JsonProperty("ISOCOUNTRYCODE.MW.isEditable")
    private String iSOCOUNTRYCODEMWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MX.value")
    private String iSOCOUNTRYCODEMXValue;
    @JsonProperty("ISOCOUNTRYCODE.MX.description")
    private String iSOCOUNTRYCODEMXDescription;
    @JsonProperty("ISOCOUNTRYCODE.MX.isEditable")
    private String iSOCOUNTRYCODEMXIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MY.value")
    private String iSOCOUNTRYCODEMYValue;
    @JsonProperty("ISOCOUNTRYCODE.MY.description")
    private String iSOCOUNTRYCODEMYDescription;
    @JsonProperty("ISOCOUNTRYCODE.MY.isEditable")
    private String iSOCOUNTRYCODEMYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.MZ.value")
    private String iSOCOUNTRYCODEMZValue;
    @JsonProperty("ISOCOUNTRYCODE.MZ.description")
    private String iSOCOUNTRYCODEMZDescription;
    @JsonProperty("ISOCOUNTRYCODE.MZ.isEditable")
    private String iSOCOUNTRYCODEMZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NA.value")
    private String iSOCOUNTRYCODENAValue;
    @JsonProperty("ISOCOUNTRYCODE.NA.description")
    private String iSOCOUNTRYCODENADescription;
    @JsonProperty("ISOCOUNTRYCODE.NA.isEditable")
    private String iSOCOUNTRYCODENAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NC.value")
    private String iSOCOUNTRYCODENCValue;
    @JsonProperty("ISOCOUNTRYCODE.NC.description")
    private String iSOCOUNTRYCODENCDescription;
    @JsonProperty("ISOCOUNTRYCODE.NC.isEditable")
    private String iSOCOUNTRYCODENCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NE.value")
    private String iSOCOUNTRYCODENEValue;
    @JsonProperty("ISOCOUNTRYCODE.NE.description")
    private String iSOCOUNTRYCODENEDescription;
    @JsonProperty("ISOCOUNTRYCODE.NE.isEditable")
    private String iSOCOUNTRYCODENEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NF.value")
    private String iSOCOUNTRYCODENFValue;
    @JsonProperty("ISOCOUNTRYCODE.NF.description")
    private String iSOCOUNTRYCODENFDescription;
    @JsonProperty("ISOCOUNTRYCODE.NF.isEditable")
    private String iSOCOUNTRYCODENFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NI.value")
    private String iSOCOUNTRYCODENIValue;
    @JsonProperty("ISOCOUNTRYCODE.NI.description")
    private String iSOCOUNTRYCODENIDescription;
    @JsonProperty("ISOCOUNTRYCODE.NI.isEditable")
    private String iSOCOUNTRYCODENIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NL.value")
    private String iSOCOUNTRYCODENLValue;
    @JsonProperty("ISOCOUNTRYCODE.NL.description")
    private String iSOCOUNTRYCODENLDescription;
    @JsonProperty("ISOCOUNTRYCODE.NL.isEditable")
    private String iSOCOUNTRYCODENLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NO.value")
    private String iSOCOUNTRYCODENOValue;
    @JsonProperty("ISOCOUNTRYCODE.NO.description")
    private String iSOCOUNTRYCODENODescription;
    @JsonProperty("ISOCOUNTRYCODE.NO.isEditable")
    private String iSOCOUNTRYCODENOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NP.value")
    private String iSOCOUNTRYCODENPValue;
    @JsonProperty("ISOCOUNTRYCODE.NP.description")
    private String iSOCOUNTRYCODENPDescription;
    @JsonProperty("ISOCOUNTRYCODE.NP.isEditable")
    private String iSOCOUNTRYCODENPIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NR.value")
    private String iSOCOUNTRYCODENRValue;
    @JsonProperty("ISOCOUNTRYCODE.NR.description")
    private String iSOCOUNTRYCODENRDescription;
    @JsonProperty("ISOCOUNTRYCODE.NR.isEditable")
    private String iSOCOUNTRYCODENRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.NZ.value")
    private String iSOCOUNTRYCODENZValue;
    @JsonProperty("ISOCOUNTRYCODE.NZ.description")
    private String iSOCOUNTRYCODENZDescription;
    @JsonProperty("ISOCOUNTRYCODE.NZ.isEditable")
    private String iSOCOUNTRYCODENZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.OM.value")
    private String iSOCOUNTRYCODEOMValue;
    @JsonProperty("ISOCOUNTRYCODE.OM.description")
    private String iSOCOUNTRYCODEOMDescription;
    @JsonProperty("ISOCOUNTRYCODE.OM.isEditable")
    private String iSOCOUNTRYCODEOMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PA.value")
    private String iSOCOUNTRYCODEPAValue;
    @JsonProperty("ISOCOUNTRYCODE.PA.description")
    private String iSOCOUNTRYCODEPADescription;
    @JsonProperty("ISOCOUNTRYCODE.PA.isEditable")
    private String iSOCOUNTRYCODEPAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PF.value")
    private String iSOCOUNTRYCODEPFValue;
    @JsonProperty("ISOCOUNTRYCODE.PF.description")
    private String iSOCOUNTRYCODEPFDescription;
    @JsonProperty("ISOCOUNTRYCODE.PF.isEditable")
    private String iSOCOUNTRYCODEPFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PG.value")
    private String iSOCOUNTRYCODEPGValue;
    @JsonProperty("ISOCOUNTRYCODE.PG.description")
    private String iSOCOUNTRYCODEPGDescription;
    @JsonProperty("ISOCOUNTRYCODE.PG.isEditable")
    private String iSOCOUNTRYCODEPGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PH.value")
    private String iSOCOUNTRYCODEPHValue;
    @JsonProperty("ISOCOUNTRYCODE.PH.description")
    private String iSOCOUNTRYCODEPHDescription;
    @JsonProperty("ISOCOUNTRYCODE.PH.isEditable")
    private String iSOCOUNTRYCODEPHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PK.value")
    private String iSOCOUNTRYCODEPKValue;
    @JsonProperty("ISOCOUNTRYCODE.PK.description")
    private String iSOCOUNTRYCODEPKDescription;
    @JsonProperty("ISOCOUNTRYCODE.PK.isEditable")
    private String iSOCOUNTRYCODEPKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PL.value")
    private String iSOCOUNTRYCODEPLValue;
    @JsonProperty("ISOCOUNTRYCODE.PL.description")
    private String iSOCOUNTRYCODEPLDescription;
    @JsonProperty("ISOCOUNTRYCODE.PL.isEditable")
    private String iSOCOUNTRYCODEPLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PN.value")
    private String iSOCOUNTRYCODEPNValue;
    @JsonProperty("ISOCOUNTRYCODE.PN.description")
    private String iSOCOUNTRYCODEPNDescription;
    @JsonProperty("ISOCOUNTRYCODE.PN.isEditable")
    private String iSOCOUNTRYCODEPNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PS.value")
    private String iSOCOUNTRYCODEPSValue;
    @JsonProperty("ISOCOUNTRYCODE.PS.description")
    private String iSOCOUNTRYCODEPSDescription;
    @JsonProperty("ISOCOUNTRYCODE.PS.isEditable")
    private String iSOCOUNTRYCODEPSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PT.value")
    private String iSOCOUNTRYCODEPTValue;
    @JsonProperty("ISOCOUNTRYCODE.PT.description")
    private String iSOCOUNTRYCODEPTDescription;
    @JsonProperty("ISOCOUNTRYCODE.PT.isEditable")
    private String iSOCOUNTRYCODEPTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PW.value")
    private String iSOCOUNTRYCODEPWValue;
    @JsonProperty("ISOCOUNTRYCODE.PW.description")
    private String iSOCOUNTRYCODEPWDescription;
    @JsonProperty("ISOCOUNTRYCODE.PW.isEditable")
    private String iSOCOUNTRYCODEPWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.PY.value")
    private String iSOCOUNTRYCODEPYValue;
    @JsonProperty("ISOCOUNTRYCODE.PY.description")
    private String iSOCOUNTRYCODEPYDescription;
    @JsonProperty("ISOCOUNTRYCODE.PY.isEditable")
    private String iSOCOUNTRYCODEPYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.QA.value")
    private String iSOCOUNTRYCODEQAValue;
    @JsonProperty("ISOCOUNTRYCODE.QA.description")
    private String iSOCOUNTRYCODEQADescription;
    @JsonProperty("ISOCOUNTRYCODE.QA.isEditable")
    private String iSOCOUNTRYCODEQAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.RE.value")
    private String iSOCOUNTRYCODEREValue;
    @JsonProperty("ISOCOUNTRYCODE.RE.description")
    private String iSOCOUNTRYCODEREDescription;
    @JsonProperty("ISOCOUNTRYCODE.RE.isEditable")
    private String iSOCOUNTRYCODEREIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.RO.value")
    private String iSOCOUNTRYCODEROValue;
    @JsonProperty("ISOCOUNTRYCODE.RO.description")
    private String iSOCOUNTRYCODERODescription;
    @JsonProperty("ISOCOUNTRYCODE.RO.isEditable")
    private String iSOCOUNTRYCODEROIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.RU.value")
    private String iSOCOUNTRYCODERUValue;
    @JsonProperty("ISOCOUNTRYCODE.RU.description")
    private String iSOCOUNTRYCODERUDescription;
    @JsonProperty("ISOCOUNTRYCODE.RU.isEditable")
    private String iSOCOUNTRYCODERUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SA.value")
    private String iSOCOUNTRYCODESAValue;
    @JsonProperty("ISOCOUNTRYCODE.SA.description")
    private String iSOCOUNTRYCODESADescription;
    @JsonProperty("ISOCOUNTRYCODE.SA.isEditable")
    private String iSOCOUNTRYCODESAIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SB.value")
    private String iSOCOUNTRYCODESBValue;
    @JsonProperty("ISOCOUNTRYCODE.SB.description")
    private String iSOCOUNTRYCODESBDescription;
    @JsonProperty("ISOCOUNTRYCODE.SB.isEditable")
    private String iSOCOUNTRYCODESBIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SD.value")
    private String iSOCOUNTRYCODESDValue;
    @JsonProperty("ISOCOUNTRYCODE.SD.description")
    private String iSOCOUNTRYCODESDDescription;
    @JsonProperty("ISOCOUNTRYCODE.SD.isEditable")
    private String iSOCOUNTRYCODESDIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SE.value")
    private String iSOCOUNTRYCODESEValue;
    @JsonProperty("ISOCOUNTRYCODE.SE.description")
    private String iSOCOUNTRYCODESEDescription;
    @JsonProperty("ISOCOUNTRYCODE.SE.isEditable")
    private String iSOCOUNTRYCODESEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SG.value")
    private String iSOCOUNTRYCODESGValue;
    @JsonProperty("ISOCOUNTRYCODE.SG.description")
    private String iSOCOUNTRYCODESGDescription;
    @JsonProperty("ISOCOUNTRYCODE.SG.isEditable")
    private String iSOCOUNTRYCODESGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SH.value")
    private String iSOCOUNTRYCODESHValue;
    @JsonProperty("ISOCOUNTRYCODE.SH.description")
    private String iSOCOUNTRYCODESHDescription;
    @JsonProperty("ISOCOUNTRYCODE.SH.isEditable")
    private String iSOCOUNTRYCODESHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SI.value")
    private String iSOCOUNTRYCODESIValue;
    @JsonProperty("ISOCOUNTRYCODE.SI.description")
    private String iSOCOUNTRYCODESIDescription;
    @JsonProperty("ISOCOUNTRYCODE.SI.isEditable")
    private String iSOCOUNTRYCODESIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SK.value")
    private String iSOCOUNTRYCODESKValue;
    @JsonProperty("ISOCOUNTRYCODE.SK.description")
    private String iSOCOUNTRYCODESKDescription;
    @JsonProperty("ISOCOUNTRYCODE.SK.isEditable")
    private String iSOCOUNTRYCODESKIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SL.value")
    private String iSOCOUNTRYCODESLValue;
    @JsonProperty("ISOCOUNTRYCODE.SL.description")
    private String iSOCOUNTRYCODESLDescription;
    @JsonProperty("ISOCOUNTRYCODE.SL.isEditable")
    private String iSOCOUNTRYCODESLIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SM.value")
    private String iSOCOUNTRYCODESMValue;
    @JsonProperty("ISOCOUNTRYCODE.SM.description")
    private String iSOCOUNTRYCODESMDescription;
    @JsonProperty("ISOCOUNTRYCODE.SM.isEditable")
    private String iSOCOUNTRYCODESMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SN.value")
    private String iSOCOUNTRYCODESNValue;
    @JsonProperty("ISOCOUNTRYCODE.SN.description")
    private String iSOCOUNTRYCODESNDescription;
    @JsonProperty("ISOCOUNTRYCODE.SN.isEditable")
    private String iSOCOUNTRYCODESNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SR.value")
    private String iSOCOUNTRYCODESRValue;
    @JsonProperty("ISOCOUNTRYCODE.SR.description")
    private String iSOCOUNTRYCODESRDescription;
    @JsonProperty("ISOCOUNTRYCODE.SR.isEditable")
    private String iSOCOUNTRYCODESRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SV.value")
    private String iSOCOUNTRYCODESVValue;
    @JsonProperty("ISOCOUNTRYCODE.SV.description")
    private String iSOCOUNTRYCODESVDescription;
    @JsonProperty("ISOCOUNTRYCODE.SV.isEditable")
    private String iSOCOUNTRYCODESVIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SY.value")
    private String iSOCOUNTRYCODESYValue;
    @JsonProperty("ISOCOUNTRYCODE.SY.description")
    private String iSOCOUNTRYCODESYDescription;
    @JsonProperty("ISOCOUNTRYCODE.SY.isEditable")
    private String iSOCOUNTRYCODESYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.SZ.value")
    private String iSOCOUNTRYCODESZValue;
    @JsonProperty("ISOCOUNTRYCODE.SZ.description")
    private String iSOCOUNTRYCODESZDescription;
    @JsonProperty("ISOCOUNTRYCODE.SZ.isEditable")
    private String iSOCOUNTRYCODESZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TF.value")
    private String iSOCOUNTRYCODETFValue;
    @JsonProperty("ISOCOUNTRYCODE.TF.description")
    private String iSOCOUNTRYCODETFDescription;
    @JsonProperty("ISOCOUNTRYCODE.TF.isEditable")
    private String iSOCOUNTRYCODETFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TH.value")
    private String iSOCOUNTRYCODETHValue;
    @JsonProperty("ISOCOUNTRYCODE.TH.description")
    private String iSOCOUNTRYCODETHDescription;
    @JsonProperty("ISOCOUNTRYCODE.TH.isEditable")
    private String iSOCOUNTRYCODETHIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TJ.value")
    private String iSOCOUNTRYCODETJValue;
    @JsonProperty("ISOCOUNTRYCODE.TJ.description")
    private String iSOCOUNTRYCODETJDescription;
    @JsonProperty("ISOCOUNTRYCODE.TJ.isEditable")
    private String iSOCOUNTRYCODETJIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TN.value")
    private String iSOCOUNTRYCODETNValue;
    @JsonProperty("ISOCOUNTRYCODE.TN.description")
    private String iSOCOUNTRYCODETNDescription;
    @JsonProperty("ISOCOUNTRYCODE.TN.isEditable")
    private String iSOCOUNTRYCODETNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TR.value")
    private String iSOCOUNTRYCODETRValue;
    @JsonProperty("ISOCOUNTRYCODE.TR.description")
    private String iSOCOUNTRYCODETRDescription;
    @JsonProperty("ISOCOUNTRYCODE.TR.isEditable")
    private String iSOCOUNTRYCODETRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TW.value")
    private String iSOCOUNTRYCODETWValue;
    @JsonProperty("ISOCOUNTRYCODE.TW.description")
    private String iSOCOUNTRYCODETWDescription;
    @JsonProperty("ISOCOUNTRYCODE.TW.isEditable")
    private String iSOCOUNTRYCODETWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.TZ.value")
    private String iSOCOUNTRYCODETZValue;
    @JsonProperty("ISOCOUNTRYCODE.TZ.description")
    private String iSOCOUNTRYCODETZDescription;
    @JsonProperty("ISOCOUNTRYCODE.TZ.isEditable")
    private String iSOCOUNTRYCODETZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.UG.value")
    private String iSOCOUNTRYCODEUGValue;
    @JsonProperty("ISOCOUNTRYCODE.UG.description")
    private String iSOCOUNTRYCODEUGDescription;
    @JsonProperty("ISOCOUNTRYCODE.UG.isEditable")
    private String iSOCOUNTRYCODEUGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.US.value")
    private String iSOCOUNTRYCODEUSValue;
    @JsonProperty("ISOCOUNTRYCODE.US.description")
    private String iSOCOUNTRYCODEUSDescription;
    @JsonProperty("ISOCOUNTRYCODE.US.isEditable")
    private String iSOCOUNTRYCODEUSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.UY.value")
    private String iSOCOUNTRYCODEUYValue;
    @JsonProperty("ISOCOUNTRYCODE.UY.description")
    private String iSOCOUNTRYCODEUYDescription;
    @JsonProperty("ISOCOUNTRYCODE.UY.isEditable")
    private String iSOCOUNTRYCODEUYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.UZ.value")
    private String iSOCOUNTRYCODEUZValue;
    @JsonProperty("ISOCOUNTRYCODE.UZ.description")
    private String iSOCOUNTRYCODEUZDescription;
    @JsonProperty("ISOCOUNTRYCODE.UZ.isEditable")
    private String iSOCOUNTRYCODEUZIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VC.value")
    private String iSOCOUNTRYCODEVCValue;
    @JsonProperty("ISOCOUNTRYCODE.VC.description")
    private String iSOCOUNTRYCODEVCDescription;
    @JsonProperty("ISOCOUNTRYCODE.VC.isEditable")
    private String iSOCOUNTRYCODEVCIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VE.value")
    private String iSOCOUNTRYCODEVEValue;
    @JsonProperty("ISOCOUNTRYCODE.VE.description")
    private String iSOCOUNTRYCODEVEDescription;
    @JsonProperty("ISOCOUNTRYCODE.VE.isEditable")
    private String iSOCOUNTRYCODEVEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.VU.value")
    private String iSOCOUNTRYCODEVUValue;
    @JsonProperty("ISOCOUNTRYCODE.VU.description")
    private String iSOCOUNTRYCODEVUDescription;
    @JsonProperty("ISOCOUNTRYCODE.VU.isEditable")
    private String iSOCOUNTRYCODEVUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.WS.value")
    private String iSOCOUNTRYCODEWSValue;
    @JsonProperty("ISOCOUNTRYCODE.WS.description")
    private String iSOCOUNTRYCODEWSDescription;
    @JsonProperty("ISOCOUNTRYCODE.WS.isEditable")
    private String iSOCOUNTRYCODEWSIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.YE.value")
    private String iSOCOUNTRYCODEYEValue;
    @JsonProperty("ISOCOUNTRYCODE.YE.description")
    private String iSOCOUNTRYCODEYEDescription;
    @JsonProperty("ISOCOUNTRYCODE.YE.isEditable")
    private String iSOCOUNTRYCODEYEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.YT.value")
    private String iSOCOUNTRYCODEYTValue;
    @JsonProperty("ISOCOUNTRYCODE.YT.description")
    private String iSOCOUNTRYCODEYTDescription;
    @JsonProperty("ISOCOUNTRYCODE.YT.isEditable")
    private String iSOCOUNTRYCODEYTIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ZM.value")
    private String iSOCOUNTRYCODEZMValue;
    @JsonProperty("ISOCOUNTRYCODE.ZM.description")
    private String iSOCOUNTRYCODEZMDescription;
    @JsonProperty("ISOCOUNTRYCODE.ZM.isEditable")
    private String iSOCOUNTRYCODEZMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ZW.value")
    private String iSOCOUNTRYCODEZWValue;
    @JsonProperty("ISOCOUNTRYCODE.ZW.description")
    private String iSOCOUNTRYCODEZWDescription;
    @JsonProperty("ISOCOUNTRYCODE.ZW.isEditable")
    private String iSOCOUNTRYCODEZWIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.CX.value")
    private String iSOCOUNTRYCODECXValue;
    @JsonProperty("ISOCOUNTRYCODE.CX.description")
    private String iSOCOUNTRYCODECXDescription;
    @JsonProperty("ISOCOUNTRYCODE.CX.isEditable")
    private String iSOCOUNTRYCODECXIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.DJ.value")
    private String iSOCOUNTRYCODEDJValue;
    @JsonProperty("ISOCOUNTRYCODE.DJ.description")
    private String iSOCOUNTRYCODEDJDescription;
    @JsonProperty("ISOCOUNTRYCODE.DJ.isEditable")
    private String iSOCOUNTRYCODEDJIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.DO.value")
    private String iSOCOUNTRYCODEDOValue;
    @JsonProperty("ISOCOUNTRYCODE.DO.description")
    private String iSOCOUNTRYCODEDODescription;
    @JsonProperty("ISOCOUNTRYCODE.DO.isEditable")
    private String iSOCOUNTRYCODEDOIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.EG.value")
    private String iSOCOUNTRYCODEEGValue;
    @JsonProperty("ISOCOUNTRYCODE.EG.description")
    private String iSOCOUNTRYCODEEGDescription;
    @JsonProperty("ISOCOUNTRYCODE.EG.isEditable")
    private String iSOCOUNTRYCODEEGIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ER.value")
    private String iSOCOUNTRYCODEERValue;
    @JsonProperty("ISOCOUNTRYCODE.ER.description")
    private String iSOCOUNTRYCODEERDescription;
    @JsonProperty("ISOCOUNTRYCODE.ER.isEditable")
    private String iSOCOUNTRYCODEERIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.FI.value")
    private String iSOCOUNTRYCODEFIValue;
    @JsonProperty("ISOCOUNTRYCODE.FI.description")
    private String iSOCOUNTRYCODEFIDescription;
    @JsonProperty("ISOCOUNTRYCODE.FI.isEditable")
    private String iSOCOUNTRYCODEFIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.FM.value")
    private String iSOCOUNTRYCODEFMValue;
    @JsonProperty("ISOCOUNTRYCODE.FM.description")
    private String iSOCOUNTRYCODEFMDescription;
    @JsonProperty("ISOCOUNTRYCODE.FM.isEditable")
    private String iSOCOUNTRYCODEFMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GB.value")
    private String iSOCOUNTRYCODEGBValue;
    @JsonProperty("ISOCOUNTRYCODE.GB.description")
    private String iSOCOUNTRYCODEGBDescription;
    @JsonProperty("ISOCOUNTRYCODE.GB.isEditable")
    private String iSOCOUNTRYCODEGBIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GF.value")
    private String iSOCOUNTRYCODEGFValue;
    @JsonProperty("ISOCOUNTRYCODE.GF.description")
    private String iSOCOUNTRYCODEGFDescription;
    @JsonProperty("ISOCOUNTRYCODE.GF.isEditable")
    private String iSOCOUNTRYCODEGFIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GI.value")
    private String iSOCOUNTRYCODEGIValue;
    @JsonProperty("ISOCOUNTRYCODE.GI.description")
    private String iSOCOUNTRYCODEGIDescription;
    @JsonProperty("ISOCOUNTRYCODE.GI.isEditable")
    private String iSOCOUNTRYCODEGIIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GN.value")
    private String iSOCOUNTRYCODEGNValue;
    @JsonProperty("ISOCOUNTRYCODE.GN.description")
    private String iSOCOUNTRYCODEGNDescription;
    @JsonProperty("ISOCOUNTRYCODE.GN.isEditable")
    private String iSOCOUNTRYCODEGNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GU.value")
    private String iSOCOUNTRYCODEGUValue;
    @JsonProperty("ISOCOUNTRYCODE.GU.description")
    private String iSOCOUNTRYCODEGUDescription;
    @JsonProperty("ISOCOUNTRYCODE.GU.isEditable")
    private String iSOCOUNTRYCODEGUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.GY.value")
    private String iSOCOUNTRYCODEGYValue;
    @JsonProperty("ISOCOUNTRYCODE.GY.description")
    private String iSOCOUNTRYCODEGYDescription;
    @JsonProperty("ISOCOUNTRYCODE.GY.isEditable")
    private String iSOCOUNTRYCODEGYIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.HN.value")
    private String iSOCOUNTRYCODEHNValue;
    @JsonProperty("ISOCOUNTRYCODE.HN.description")
    private String iSOCOUNTRYCODEHNDescription;
    @JsonProperty("ISOCOUNTRYCODE.HN.isEditable")
    private String iSOCOUNTRYCODEHNIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.HU.value")
    private String iSOCOUNTRYCODEHUValue;
    @JsonProperty("ISOCOUNTRYCODE.HU.description")
    private String iSOCOUNTRYCODEHUDescription;
    @JsonProperty("ISOCOUNTRYCODE.HU.isEditable")
    private String iSOCOUNTRYCODEHUIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IE.value")
    private String iSOCOUNTRYCODEIEValue;
    @JsonProperty("ISOCOUNTRYCODE.IE.description")
    private String iSOCOUNTRYCODEIEDescription;
    @JsonProperty("ISOCOUNTRYCODE.IE.isEditable")
    private String iSOCOUNTRYCODEIEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IN.value")
    private String iSOCOUNTRYCODEINValue;
    @JsonProperty("ISOCOUNTRYCODE.IN.description")
    private String iSOCOUNTRYCODEINDescription;
    @JsonProperty("ISOCOUNTRYCODE.IN.isEditable")
    private String iSOCOUNTRYCODEINIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.IR.value")
    private String iSOCOUNTRYCODEIRValue;
    @JsonProperty("ISOCOUNTRYCODE.IR.description")
    private String iSOCOUNTRYCODEIRDescription;
    @JsonProperty("ISOCOUNTRYCODE.IR.isEditable")
    private String iSOCOUNTRYCODEIRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.JE.value")
    private String iSOCOUNTRYCODEJEValue;
    @JsonProperty("ISOCOUNTRYCODE.JE.description")
    private String iSOCOUNTRYCODEJEDescription;
    @JsonProperty("ISOCOUNTRYCODE.JE.isEditable")
    private String iSOCOUNTRYCODEJEIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.JP.value")
    private String iSOCOUNTRYCODEJPValue;
    @JsonProperty("ISOCOUNTRYCODE.JP.description")
    private String iSOCOUNTRYCODEJPDescription;
    @JsonProperty("ISOCOUNTRYCODE.JP.isEditable")
    private String iSOCOUNTRYCODEJPIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KM.value")
    private String iSOCOUNTRYCODEKMValue;
    @JsonProperty("ISOCOUNTRYCODE.KM.description")
    private String iSOCOUNTRYCODEKMDescription;
    @JsonProperty("ISOCOUNTRYCODE.KM.isEditable")
    private String iSOCOUNTRYCODEKMIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.KR.value")
    private String iSOCOUNTRYCODEKRValue;
    @JsonProperty("ISOCOUNTRYCODE.KR.description")
    private String iSOCOUNTRYCODEKRDescription;
    @JsonProperty("ISOCOUNTRYCODE.KR.isEditable")
    private String iSOCOUNTRYCODEKRIsEditable;
    @JsonProperty("ISOCOUNTRYCODE.ME.value")
    private String iSOCOUNTRYCODEMEValue;
    @JsonProperty("ISOCOUNTRYCODE.ME.description")
    private String iSOCOUNTRYCODEMEDescription;
    @JsonProperty("ISOCOUNTRYCODE.ME.isEditable")
    private String iSOCOUNTRYCODEMEIsEditable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ISOCOUNTRYCODE.AW.value")
    public String getISOCOUNTRYCODEAWValue() {
        return iSOCOUNTRYCODEAWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AW.value")
    public void setISOCOUNTRYCODEAWValue(String iSOCOUNTRYCODEAWValue) {
        this.iSOCOUNTRYCODEAWValue = iSOCOUNTRYCODEAWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AW.description")
    public String getISOCOUNTRYCODEAWDescription() {
        return iSOCOUNTRYCODEAWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AW.description")
    public void setISOCOUNTRYCODEAWDescription(String iSOCOUNTRYCODEAWDescription) {
        this.iSOCOUNTRYCODEAWDescription = iSOCOUNTRYCODEAWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AW.isEditable")
    public String getISOCOUNTRYCODEAWIsEditable() {
        return iSOCOUNTRYCODEAWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AW.isEditable")
    public void setISOCOUNTRYCODEAWIsEditable(String iSOCOUNTRYCODEAWIsEditable) {
        this.iSOCOUNTRYCODEAWIsEditable = iSOCOUNTRYCODEAWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BH.value")
    public String getISOCOUNTRYCODEBHValue() {
        return iSOCOUNTRYCODEBHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BH.value")
    public void setISOCOUNTRYCODEBHValue(String iSOCOUNTRYCODEBHValue) {
        this.iSOCOUNTRYCODEBHValue = iSOCOUNTRYCODEBHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BH.description")
    public String getISOCOUNTRYCODEBHDescription() {
        return iSOCOUNTRYCODEBHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BH.description")
    public void setISOCOUNTRYCODEBHDescription(String iSOCOUNTRYCODEBHDescription) {
        this.iSOCOUNTRYCODEBHDescription = iSOCOUNTRYCODEBHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BH.isEditable")
    public String getISOCOUNTRYCODEBHIsEditable() {
        return iSOCOUNTRYCODEBHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BH.isEditable")
    public void setISOCOUNTRYCODEBHIsEditable(String iSOCOUNTRYCODEBHIsEditable) {
        this.iSOCOUNTRYCODEBHIsEditable = iSOCOUNTRYCODEBHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BV.value")
    public String getISOCOUNTRYCODEBVValue() {
        return iSOCOUNTRYCODEBVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BV.value")
    public void setISOCOUNTRYCODEBVValue(String iSOCOUNTRYCODEBVValue) {
        this.iSOCOUNTRYCODEBVValue = iSOCOUNTRYCODEBVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BV.description")
    public String getISOCOUNTRYCODEBVDescription() {
        return iSOCOUNTRYCODEBVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BV.description")
    public void setISOCOUNTRYCODEBVDescription(String iSOCOUNTRYCODEBVDescription) {
        this.iSOCOUNTRYCODEBVDescription = iSOCOUNTRYCODEBVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BV.isEditable")
    public String getISOCOUNTRYCODEBVIsEditable() {
        return iSOCOUNTRYCODEBVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BV.isEditable")
    public void setISOCOUNTRYCODEBVIsEditable(String iSOCOUNTRYCODEBVIsEditable) {
        this.iSOCOUNTRYCODEBVIsEditable = iSOCOUNTRYCODEBVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CH.value")
    public String getISOCOUNTRYCODECHValue() {
        return iSOCOUNTRYCODECHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CH.value")
    public void setISOCOUNTRYCODECHValue(String iSOCOUNTRYCODECHValue) {
        this.iSOCOUNTRYCODECHValue = iSOCOUNTRYCODECHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CH.description")
    public String getISOCOUNTRYCODECHDescription() {
        return iSOCOUNTRYCODECHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CH.description")
    public void setISOCOUNTRYCODECHDescription(String iSOCOUNTRYCODECHDescription) {
        this.iSOCOUNTRYCODECHDescription = iSOCOUNTRYCODECHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CH.isEditable")
    public String getISOCOUNTRYCODECHIsEditable() {
        return iSOCOUNTRYCODECHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CH.isEditable")
    public void setISOCOUNTRYCODECHIsEditable(String iSOCOUNTRYCODECHIsEditable) {
        this.iSOCOUNTRYCODECHIsEditable = iSOCOUNTRYCODECHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CY.value")
    public String getISOCOUNTRYCODECYValue() {
        return iSOCOUNTRYCODECYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CY.value")
    public void setISOCOUNTRYCODECYValue(String iSOCOUNTRYCODECYValue) {
        this.iSOCOUNTRYCODECYValue = iSOCOUNTRYCODECYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CY.description")
    public String getISOCOUNTRYCODECYDescription() {
        return iSOCOUNTRYCODECYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CY.description")
    public void setISOCOUNTRYCODECYDescription(String iSOCOUNTRYCODECYDescription) {
        this.iSOCOUNTRYCODECYDescription = iSOCOUNTRYCODECYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CY.isEditable")
    public String getISOCOUNTRYCODECYIsEditable() {
        return iSOCOUNTRYCODECYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CY.isEditable")
    public void setISOCOUNTRYCODECYIsEditable(String iSOCOUNTRYCODECYIsEditable) {
        this.iSOCOUNTRYCODECYIsEditable = iSOCOUNTRYCODECYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EH.value")
    public String getISOCOUNTRYCODEEHValue() {
        return iSOCOUNTRYCODEEHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EH.value")
    public void setISOCOUNTRYCODEEHValue(String iSOCOUNTRYCODEEHValue) {
        this.iSOCOUNTRYCODEEHValue = iSOCOUNTRYCODEEHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EH.description")
    public String getISOCOUNTRYCODEEHDescription() {
        return iSOCOUNTRYCODEEHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EH.description")
    public void setISOCOUNTRYCODEEHDescription(String iSOCOUNTRYCODEEHDescription) {
        this.iSOCOUNTRYCODEEHDescription = iSOCOUNTRYCODEEHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EH.isEditable")
    public String getISOCOUNTRYCODEEHIsEditable() {
        return iSOCOUNTRYCODEEHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EH.isEditable")
    public void setISOCOUNTRYCODEEHIsEditable(String iSOCOUNTRYCODEEHIsEditable) {
        this.iSOCOUNTRYCODEEHIsEditable = iSOCOUNTRYCODEEHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GG.value")
    public String getISOCOUNTRYCODEGGValue() {
        return iSOCOUNTRYCODEGGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GG.value")
    public void setISOCOUNTRYCODEGGValue(String iSOCOUNTRYCODEGGValue) {
        this.iSOCOUNTRYCODEGGValue = iSOCOUNTRYCODEGGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GG.description")
    public String getISOCOUNTRYCODEGGDescription() {
        return iSOCOUNTRYCODEGGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GG.description")
    public void setISOCOUNTRYCODEGGDescription(String iSOCOUNTRYCODEGGDescription) {
        this.iSOCOUNTRYCODEGGDescription = iSOCOUNTRYCODEGGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GG.isEditable")
    public String getISOCOUNTRYCODEGGIsEditable() {
        return iSOCOUNTRYCODEGGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GG.isEditable")
    public void setISOCOUNTRYCODEGGIsEditable(String iSOCOUNTRYCODEGGIsEditable) {
        this.iSOCOUNTRYCODEGGIsEditable = iSOCOUNTRYCODEGGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HK.value")
    public String getISOCOUNTRYCODEHKValue() {
        return iSOCOUNTRYCODEHKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HK.value")
    public void setISOCOUNTRYCODEHKValue(String iSOCOUNTRYCODEHKValue) {
        this.iSOCOUNTRYCODEHKValue = iSOCOUNTRYCODEHKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HK.description")
    public String getISOCOUNTRYCODEHKDescription() {
        return iSOCOUNTRYCODEHKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HK.description")
    public void setISOCOUNTRYCODEHKDescription(String iSOCOUNTRYCODEHKDescription) {
        this.iSOCOUNTRYCODEHKDescription = iSOCOUNTRYCODEHKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HK.isEditable")
    public String getISOCOUNTRYCODEHKIsEditable() {
        return iSOCOUNTRYCODEHKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HK.isEditable")
    public void setISOCOUNTRYCODEHKIsEditable(String iSOCOUNTRYCODEHKIsEditable) {
        this.iSOCOUNTRYCODEHKIsEditable = iSOCOUNTRYCODEHKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IS.value")
    public String getISOCOUNTRYCODEISValue() {
        return iSOCOUNTRYCODEISValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IS.value")
    public void setISOCOUNTRYCODEISValue(String iSOCOUNTRYCODEISValue) {
        this.iSOCOUNTRYCODEISValue = iSOCOUNTRYCODEISValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IS.description")
    public String getISOCOUNTRYCODEISDescription() {
        return iSOCOUNTRYCODEISDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IS.description")
    public void setISOCOUNTRYCODEISDescription(String iSOCOUNTRYCODEISDescription) {
        this.iSOCOUNTRYCODEISDescription = iSOCOUNTRYCODEISDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IS.isEditable")
    public String getISOCOUNTRYCODEISIsEditable() {
        return iSOCOUNTRYCODEISIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IS.isEditable")
    public void setISOCOUNTRYCODEISIsEditable(String iSOCOUNTRYCODEISIsEditable) {
        this.iSOCOUNTRYCODEISIsEditable = iSOCOUNTRYCODEISIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KW.value")
    public String getISOCOUNTRYCODEKWValue() {
        return iSOCOUNTRYCODEKWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KW.value")
    public void setISOCOUNTRYCODEKWValue(String iSOCOUNTRYCODEKWValue) {
        this.iSOCOUNTRYCODEKWValue = iSOCOUNTRYCODEKWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KW.description")
    public String getISOCOUNTRYCODEKWDescription() {
        return iSOCOUNTRYCODEKWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KW.description")
    public void setISOCOUNTRYCODEKWDescription(String iSOCOUNTRYCODEKWDescription) {
        this.iSOCOUNTRYCODEKWDescription = iSOCOUNTRYCODEKWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KW.isEditable")
    public String getISOCOUNTRYCODEKWIsEditable() {
        return iSOCOUNTRYCODEKWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KW.isEditable")
    public void setISOCOUNTRYCODEKWIsEditable(String iSOCOUNTRYCODEKWIsEditable) {
        this.iSOCOUNTRYCODEKWIsEditable = iSOCOUNTRYCODEKWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LU.value")
    public String getISOCOUNTRYCODELUValue() {
        return iSOCOUNTRYCODELUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LU.value")
    public void setISOCOUNTRYCODELUValue(String iSOCOUNTRYCODELUValue) {
        this.iSOCOUNTRYCODELUValue = iSOCOUNTRYCODELUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LU.description")
    public String getISOCOUNTRYCODELUDescription() {
        return iSOCOUNTRYCODELUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LU.description")
    public void setISOCOUNTRYCODELUDescription(String iSOCOUNTRYCODELUDescription) {
        this.iSOCOUNTRYCODELUDescription = iSOCOUNTRYCODELUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LU.isEditable")
    public String getISOCOUNTRYCODELUIsEditable() {
        return iSOCOUNTRYCODELUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LU.isEditable")
    public void setISOCOUNTRYCODELUIsEditable(String iSOCOUNTRYCODELUIsEditable) {
        this.iSOCOUNTRYCODELUIsEditable = iSOCOUNTRYCODELUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MQ.value")
    public String getISOCOUNTRYCODEMQValue() {
        return iSOCOUNTRYCODEMQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MQ.value")
    public void setISOCOUNTRYCODEMQValue(String iSOCOUNTRYCODEMQValue) {
        this.iSOCOUNTRYCODEMQValue = iSOCOUNTRYCODEMQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MQ.description")
    public String getISOCOUNTRYCODEMQDescription() {
        return iSOCOUNTRYCODEMQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MQ.description")
    public void setISOCOUNTRYCODEMQDescription(String iSOCOUNTRYCODEMQDescription) {
        this.iSOCOUNTRYCODEMQDescription = iSOCOUNTRYCODEMQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MQ.isEditable")
    public String getISOCOUNTRYCODEMQIsEditable() {
        return iSOCOUNTRYCODEMQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MQ.isEditable")
    public void setISOCOUNTRYCODEMQIsEditable(String iSOCOUNTRYCODEMQIsEditable) {
        this.iSOCOUNTRYCODEMQIsEditable = iSOCOUNTRYCODEMQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NG.value")
    public String getISOCOUNTRYCODENGValue() {
        return iSOCOUNTRYCODENGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NG.value")
    public void setISOCOUNTRYCODENGValue(String iSOCOUNTRYCODENGValue) {
        this.iSOCOUNTRYCODENGValue = iSOCOUNTRYCODENGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NG.description")
    public String getISOCOUNTRYCODENGDescription() {
        return iSOCOUNTRYCODENGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NG.description")
    public void setISOCOUNTRYCODENGDescription(String iSOCOUNTRYCODENGDescription) {
        this.iSOCOUNTRYCODENGDescription = iSOCOUNTRYCODENGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NG.isEditable")
    public String getISOCOUNTRYCODENGIsEditable() {
        return iSOCOUNTRYCODENGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NG.isEditable")
    public void setISOCOUNTRYCODENGIsEditable(String iSOCOUNTRYCODENGIsEditable) {
        this.iSOCOUNTRYCODENGIsEditable = iSOCOUNTRYCODENGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PE.value")
    public String getISOCOUNTRYCODEPEValue() {
        return iSOCOUNTRYCODEPEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PE.value")
    public void setISOCOUNTRYCODEPEValue(String iSOCOUNTRYCODEPEValue) {
        this.iSOCOUNTRYCODEPEValue = iSOCOUNTRYCODEPEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PE.description")
    public String getISOCOUNTRYCODEPEDescription() {
        return iSOCOUNTRYCODEPEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PE.description")
    public void setISOCOUNTRYCODEPEDescription(String iSOCOUNTRYCODEPEDescription) {
        this.iSOCOUNTRYCODEPEDescription = iSOCOUNTRYCODEPEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PE.isEditable")
    public String getISOCOUNTRYCODEPEIsEditable() {
        return iSOCOUNTRYCODEPEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PE.isEditable")
    public void setISOCOUNTRYCODEPEIsEditable(String iSOCOUNTRYCODEPEIsEditable) {
        this.iSOCOUNTRYCODEPEIsEditable = iSOCOUNTRYCODEPEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PR.value")
    public String getISOCOUNTRYCODEPRValue() {
        return iSOCOUNTRYCODEPRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PR.value")
    public void setISOCOUNTRYCODEPRValue(String iSOCOUNTRYCODEPRValue) {
        this.iSOCOUNTRYCODEPRValue = iSOCOUNTRYCODEPRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PR.description")
    public String getISOCOUNTRYCODEPRDescription() {
        return iSOCOUNTRYCODEPRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PR.description")
    public void setISOCOUNTRYCODEPRDescription(String iSOCOUNTRYCODEPRDescription) {
        this.iSOCOUNTRYCODEPRDescription = iSOCOUNTRYCODEPRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PR.isEditable")
    public String getISOCOUNTRYCODEPRIsEditable() {
        return iSOCOUNTRYCODEPRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PR.isEditable")
    public void setISOCOUNTRYCODEPRIsEditable(String iSOCOUNTRYCODEPRIsEditable) {
        this.iSOCOUNTRYCODEPRIsEditable = iSOCOUNTRYCODEPRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RW.value")
    public String getISOCOUNTRYCODERWValue() {
        return iSOCOUNTRYCODERWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RW.value")
    public void setISOCOUNTRYCODERWValue(String iSOCOUNTRYCODERWValue) {
        this.iSOCOUNTRYCODERWValue = iSOCOUNTRYCODERWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RW.description")
    public String getISOCOUNTRYCODERWDescription() {
        return iSOCOUNTRYCODERWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RW.description")
    public void setISOCOUNTRYCODERWDescription(String iSOCOUNTRYCODERWDescription) {
        this.iSOCOUNTRYCODERWDescription = iSOCOUNTRYCODERWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RW.isEditable")
    public String getISOCOUNTRYCODERWIsEditable() {
        return iSOCOUNTRYCODERWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RW.isEditable")
    public void setISOCOUNTRYCODERWIsEditable(String iSOCOUNTRYCODERWIsEditable) {
        this.iSOCOUNTRYCODERWIsEditable = iSOCOUNTRYCODERWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SJ.value")
    public String getISOCOUNTRYCODESJValue() {
        return iSOCOUNTRYCODESJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SJ.value")
    public void setISOCOUNTRYCODESJValue(String iSOCOUNTRYCODESJValue) {
        this.iSOCOUNTRYCODESJValue = iSOCOUNTRYCODESJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SJ.description")
    public String getISOCOUNTRYCODESJDescription() {
        return iSOCOUNTRYCODESJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SJ.description")
    public void setISOCOUNTRYCODESJDescription(String iSOCOUNTRYCODESJDescription) {
        this.iSOCOUNTRYCODESJDescription = iSOCOUNTRYCODESJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SJ.isEditable")
    public String getISOCOUNTRYCODESJIsEditable() {
        return iSOCOUNTRYCODESJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SJ.isEditable")
    public void setISOCOUNTRYCODESJIsEditable(String iSOCOUNTRYCODESJIsEditable) {
        this.iSOCOUNTRYCODESJIsEditable = iSOCOUNTRYCODESJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TD.value")
    public String getISOCOUNTRYCODETDValue() {
        return iSOCOUNTRYCODETDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TD.value")
    public void setISOCOUNTRYCODETDValue(String iSOCOUNTRYCODETDValue) {
        this.iSOCOUNTRYCODETDValue = iSOCOUNTRYCODETDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TD.description")
    public String getISOCOUNTRYCODETDDescription() {
        return iSOCOUNTRYCODETDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TD.description")
    public void setISOCOUNTRYCODETDDescription(String iSOCOUNTRYCODETDDescription) {
        this.iSOCOUNTRYCODETDDescription = iSOCOUNTRYCODETDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TD.isEditable")
    public String getISOCOUNTRYCODETDIsEditable() {
        return iSOCOUNTRYCODETDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TD.isEditable")
    public void setISOCOUNTRYCODETDIsEditable(String iSOCOUNTRYCODETDIsEditable) {
        this.iSOCOUNTRYCODETDIsEditable = iSOCOUNTRYCODETDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TV.value")
    public String getISOCOUNTRYCODETVValue() {
        return iSOCOUNTRYCODETVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TV.value")
    public void setISOCOUNTRYCODETVValue(String iSOCOUNTRYCODETVValue) {
        this.iSOCOUNTRYCODETVValue = iSOCOUNTRYCODETVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TV.description")
    public String getISOCOUNTRYCODETVDescription() {
        return iSOCOUNTRYCODETVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TV.description")
    public void setISOCOUNTRYCODETVDescription(String iSOCOUNTRYCODETVDescription) {
        this.iSOCOUNTRYCODETVDescription = iSOCOUNTRYCODETVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TV.isEditable")
    public String getISOCOUNTRYCODETVIsEditable() {
        return iSOCOUNTRYCODETVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TV.isEditable")
    public void setISOCOUNTRYCODETVIsEditable(String iSOCOUNTRYCODETVIsEditable) {
        this.iSOCOUNTRYCODETVIsEditable = iSOCOUNTRYCODETVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VG.value")
    public String getISOCOUNTRYCODEVGValue() {
        return iSOCOUNTRYCODEVGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VG.value")
    public void setISOCOUNTRYCODEVGValue(String iSOCOUNTRYCODEVGValue) {
        this.iSOCOUNTRYCODEVGValue = iSOCOUNTRYCODEVGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VG.description")
    public String getISOCOUNTRYCODEVGDescription() {
        return iSOCOUNTRYCODEVGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VG.description")
    public void setISOCOUNTRYCODEVGDescription(String iSOCOUNTRYCODEVGDescription) {
        this.iSOCOUNTRYCODEVGDescription = iSOCOUNTRYCODEVGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VG.isEditable")
    public String getISOCOUNTRYCODEVGIsEditable() {
        return iSOCOUNTRYCODEVGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VG.isEditable")
    public void setISOCOUNTRYCODEVGIsEditable(String iSOCOUNTRYCODEVGIsEditable) {
        this.iSOCOUNTRYCODEVGIsEditable = iSOCOUNTRYCODEVGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BQ.value")
    public String getISOCOUNTRYCODEBQValue() {
        return iSOCOUNTRYCODEBQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BQ.value")
    public void setISOCOUNTRYCODEBQValue(String iSOCOUNTRYCODEBQValue) {
        this.iSOCOUNTRYCODEBQValue = iSOCOUNTRYCODEBQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BQ.description")
    public String getISOCOUNTRYCODEBQDescription() {
        return iSOCOUNTRYCODEBQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BQ.description")
    public void setISOCOUNTRYCODEBQDescription(String iSOCOUNTRYCODEBQDescription) {
        this.iSOCOUNTRYCODEBQDescription = iSOCOUNTRYCODEBQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BQ.isEditable")
    public String getISOCOUNTRYCODEBQIsEditable() {
        return iSOCOUNTRYCODEBQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BQ.isEditable")
    public void setISOCOUNTRYCODEBQIsEditable(String iSOCOUNTRYCODEBQIsEditable) {
        this.iSOCOUNTRYCODEBQIsEditable = iSOCOUNTRYCODEBQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AU.value")
    public String getISOCOUNTRYCODEAUValue() {
        return iSOCOUNTRYCODEAUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AU.value")
    public void setISOCOUNTRYCODEAUValue(String iSOCOUNTRYCODEAUValue) {
        this.iSOCOUNTRYCODEAUValue = iSOCOUNTRYCODEAUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AU.description")
    public String getISOCOUNTRYCODEAUDescription() {
        return iSOCOUNTRYCODEAUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AU.description")
    public void setISOCOUNTRYCODEAUDescription(String iSOCOUNTRYCODEAUDescription) {
        this.iSOCOUNTRYCODEAUDescription = iSOCOUNTRYCODEAUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AU.isEditable")
    public String getISOCOUNTRYCODEAUIsEditable() {
        return iSOCOUNTRYCODEAUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AU.isEditable")
    public void setISOCOUNTRYCODEAUIsEditable(String iSOCOUNTRYCODEAUIsEditable) {
        this.iSOCOUNTRYCODEAUIsEditable = iSOCOUNTRYCODEAUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BM.value")
    public String getISOCOUNTRYCODEBMValue() {
        return iSOCOUNTRYCODEBMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BM.value")
    public void setISOCOUNTRYCODEBMValue(String iSOCOUNTRYCODEBMValue) {
        this.iSOCOUNTRYCODEBMValue = iSOCOUNTRYCODEBMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BM.description")
    public String getISOCOUNTRYCODEBMDescription() {
        return iSOCOUNTRYCODEBMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BM.description")
    public void setISOCOUNTRYCODEBMDescription(String iSOCOUNTRYCODEBMDescription) {
        this.iSOCOUNTRYCODEBMDescription = iSOCOUNTRYCODEBMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BM.isEditable")
    public String getISOCOUNTRYCODEBMIsEditable() {
        return iSOCOUNTRYCODEBMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BM.isEditable")
    public void setISOCOUNTRYCODEBMIsEditable(String iSOCOUNTRYCODEBMIsEditable) {
        this.iSOCOUNTRYCODEBMIsEditable = iSOCOUNTRYCODEBMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CA.value")
    public String getISOCOUNTRYCODECAValue() {
        return iSOCOUNTRYCODECAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CA.value")
    public void setISOCOUNTRYCODECAValue(String iSOCOUNTRYCODECAValue) {
        this.iSOCOUNTRYCODECAValue = iSOCOUNTRYCODECAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CA.description")
    public String getISOCOUNTRYCODECADescription() {
        return iSOCOUNTRYCODECADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CA.description")
    public void setISOCOUNTRYCODECADescription(String iSOCOUNTRYCODECADescription) {
        this.iSOCOUNTRYCODECADescription = iSOCOUNTRYCODECADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CA.isEditable")
    public String getISOCOUNTRYCODECAIsEditable() {
        return iSOCOUNTRYCODECAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CA.isEditable")
    public void setISOCOUNTRYCODECAIsEditable(String iSOCOUNTRYCODECAIsEditable) {
        this.iSOCOUNTRYCODECAIsEditable = iSOCOUNTRYCODECAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CO.value")
    public String getISOCOUNTRYCODECOValue() {
        return iSOCOUNTRYCODECOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CO.value")
    public void setISOCOUNTRYCODECOValue(String iSOCOUNTRYCODECOValue) {
        this.iSOCOUNTRYCODECOValue = iSOCOUNTRYCODECOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CO.description")
    public String getISOCOUNTRYCODECODescription() {
        return iSOCOUNTRYCODECODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CO.description")
    public void setISOCOUNTRYCODECODescription(String iSOCOUNTRYCODECODescription) {
        this.iSOCOUNTRYCODECODescription = iSOCOUNTRYCODECODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CO.isEditable")
    public String getISOCOUNTRYCODECOIsEditable() {
        return iSOCOUNTRYCODECOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CO.isEditable")
    public void setISOCOUNTRYCODECOIsEditable(String iSOCOUNTRYCODECOIsEditable) {
        this.iSOCOUNTRYCODECOIsEditable = iSOCOUNTRYCODECOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EE.value")
    public String getISOCOUNTRYCODEEEValue() {
        return iSOCOUNTRYCODEEEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EE.value")
    public void setISOCOUNTRYCODEEEValue(String iSOCOUNTRYCODEEEValue) {
        this.iSOCOUNTRYCODEEEValue = iSOCOUNTRYCODEEEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EE.description")
    public String getISOCOUNTRYCODEEEDescription() {
        return iSOCOUNTRYCODEEEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EE.description")
    public void setISOCOUNTRYCODEEEDescription(String iSOCOUNTRYCODEEEDescription) {
        this.iSOCOUNTRYCODEEEDescription = iSOCOUNTRYCODEEEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EE.isEditable")
    public String getISOCOUNTRYCODEEEIsEditable() {
        return iSOCOUNTRYCODEEEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EE.isEditable")
    public void setISOCOUNTRYCODEEEIsEditable(String iSOCOUNTRYCODEEEIsEditable) {
        this.iSOCOUNTRYCODEEEIsEditable = iSOCOUNTRYCODEEEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GE.value")
    public String getISOCOUNTRYCODEGEValue() {
        return iSOCOUNTRYCODEGEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GE.value")
    public void setISOCOUNTRYCODEGEValue(String iSOCOUNTRYCODEGEValue) {
        this.iSOCOUNTRYCODEGEValue = iSOCOUNTRYCODEGEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GE.description")
    public String getISOCOUNTRYCODEGEDescription() {
        return iSOCOUNTRYCODEGEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GE.description")
    public void setISOCOUNTRYCODEGEDescription(String iSOCOUNTRYCODEGEDescription) {
        this.iSOCOUNTRYCODEGEDescription = iSOCOUNTRYCODEGEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GE.isEditable")
    public String getISOCOUNTRYCODEGEIsEditable() {
        return iSOCOUNTRYCODEGEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GE.isEditable")
    public void setISOCOUNTRYCODEGEIsEditable(String iSOCOUNTRYCODEGEIsEditable) {
        this.iSOCOUNTRYCODEGEIsEditable = iSOCOUNTRYCODEGEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HR.value")
    public String getISOCOUNTRYCODEHRValue() {
        return iSOCOUNTRYCODEHRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HR.value")
    public void setISOCOUNTRYCODEHRValue(String iSOCOUNTRYCODEHRValue) {
        this.iSOCOUNTRYCODEHRValue = iSOCOUNTRYCODEHRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HR.description")
    public String getISOCOUNTRYCODEHRDescription() {
        return iSOCOUNTRYCODEHRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HR.description")
    public void setISOCOUNTRYCODEHRDescription(String iSOCOUNTRYCODEHRDescription) {
        this.iSOCOUNTRYCODEHRDescription = iSOCOUNTRYCODEHRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HR.isEditable")
    public String getISOCOUNTRYCODEHRIsEditable() {
        return iSOCOUNTRYCODEHRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HR.isEditable")
    public void setISOCOUNTRYCODEHRIsEditable(String iSOCOUNTRYCODEHRIsEditable) {
        this.iSOCOUNTRYCODEHRIsEditable = iSOCOUNTRYCODEHRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KE.value")
    public String getISOCOUNTRYCODEKEValue() {
        return iSOCOUNTRYCODEKEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KE.value")
    public void setISOCOUNTRYCODEKEValue(String iSOCOUNTRYCODEKEValue) {
        this.iSOCOUNTRYCODEKEValue = iSOCOUNTRYCODEKEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KE.description")
    public String getISOCOUNTRYCODEKEDescription() {
        return iSOCOUNTRYCODEKEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KE.description")
    public void setISOCOUNTRYCODEKEDescription(String iSOCOUNTRYCODEKEDescription) {
        this.iSOCOUNTRYCODEKEDescription = iSOCOUNTRYCODEKEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KE.isEditable")
    public String getISOCOUNTRYCODEKEIsEditable() {
        return iSOCOUNTRYCODEKEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KE.isEditable")
    public void setISOCOUNTRYCODEKEIsEditable(String iSOCOUNTRYCODEKEIsEditable) {
        this.iSOCOUNTRYCODEKEIsEditable = iSOCOUNTRYCODEKEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LI.value")
    public String getISOCOUNTRYCODELIValue() {
        return iSOCOUNTRYCODELIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LI.value")
    public void setISOCOUNTRYCODELIValue(String iSOCOUNTRYCODELIValue) {
        this.iSOCOUNTRYCODELIValue = iSOCOUNTRYCODELIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LI.description")
    public String getISOCOUNTRYCODELIDescription() {
        return iSOCOUNTRYCODELIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LI.description")
    public void setISOCOUNTRYCODELIDescription(String iSOCOUNTRYCODELIDescription) {
        this.iSOCOUNTRYCODELIDescription = iSOCOUNTRYCODELIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LI.isEditable")
    public String getISOCOUNTRYCODELIIsEditable() {
        return iSOCOUNTRYCODELIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LI.isEditable")
    public void setISOCOUNTRYCODELIIsEditable(String iSOCOUNTRYCODELIIsEditable) {
        this.iSOCOUNTRYCODELIIsEditable = iSOCOUNTRYCODELIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MR.value")
    public String getISOCOUNTRYCODEMRValue() {
        return iSOCOUNTRYCODEMRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MR.value")
    public void setISOCOUNTRYCODEMRValue(String iSOCOUNTRYCODEMRValue) {
        this.iSOCOUNTRYCODEMRValue = iSOCOUNTRYCODEMRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MR.description")
    public String getISOCOUNTRYCODEMRDescription() {
        return iSOCOUNTRYCODEMRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MR.description")
    public void setISOCOUNTRYCODEMRDescription(String iSOCOUNTRYCODEMRDescription) {
        this.iSOCOUNTRYCODEMRDescription = iSOCOUNTRYCODEMRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MR.isEditable")
    public String getISOCOUNTRYCODEMRIsEditable() {
        return iSOCOUNTRYCODEMRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MR.isEditable")
    public void setISOCOUNTRYCODEMRIsEditable(String iSOCOUNTRYCODEMRIsEditable) {
        this.iSOCOUNTRYCODEMRIsEditable = iSOCOUNTRYCODEMRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PM.value")
    public String getISOCOUNTRYCODEPMValue() {
        return iSOCOUNTRYCODEPMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PM.value")
    public void setISOCOUNTRYCODEPMValue(String iSOCOUNTRYCODEPMValue) {
        this.iSOCOUNTRYCODEPMValue = iSOCOUNTRYCODEPMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PM.description")
    public String getISOCOUNTRYCODEPMDescription() {
        return iSOCOUNTRYCODEPMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PM.description")
    public void setISOCOUNTRYCODEPMDescription(String iSOCOUNTRYCODEPMDescription) {
        this.iSOCOUNTRYCODEPMDescription = iSOCOUNTRYCODEPMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PM.isEditable")
    public String getISOCOUNTRYCODEPMIsEditable() {
        return iSOCOUNTRYCODEPMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PM.isEditable")
    public void setISOCOUNTRYCODEPMIsEditable(String iSOCOUNTRYCODEPMIsEditable) {
        this.iSOCOUNTRYCODEPMIsEditable = iSOCOUNTRYCODEPMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SC.value")
    public String getISOCOUNTRYCODESCValue() {
        return iSOCOUNTRYCODESCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SC.value")
    public void setISOCOUNTRYCODESCValue(String iSOCOUNTRYCODESCValue) {
        this.iSOCOUNTRYCODESCValue = iSOCOUNTRYCODESCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SC.description")
    public String getISOCOUNTRYCODESCDescription() {
        return iSOCOUNTRYCODESCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SC.description")
    public void setISOCOUNTRYCODESCDescription(String iSOCOUNTRYCODESCDescription) {
        this.iSOCOUNTRYCODESCDescription = iSOCOUNTRYCODESCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SC.isEditable")
    public String getISOCOUNTRYCODESCIsEditable() {
        return iSOCOUNTRYCODESCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SC.isEditable")
    public void setISOCOUNTRYCODESCIsEditable(String iSOCOUNTRYCODESCIsEditable) {
        this.iSOCOUNTRYCODESCIsEditable = iSOCOUNTRYCODESCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SO.value")
    public String getISOCOUNTRYCODESOValue() {
        return iSOCOUNTRYCODESOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SO.value")
    public void setISOCOUNTRYCODESOValue(String iSOCOUNTRYCODESOValue) {
        this.iSOCOUNTRYCODESOValue = iSOCOUNTRYCODESOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SO.description")
    public String getISOCOUNTRYCODESODescription() {
        return iSOCOUNTRYCODESODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SO.description")
    public void setISOCOUNTRYCODESODescription(String iSOCOUNTRYCODESODescription) {
        this.iSOCOUNTRYCODESODescription = iSOCOUNTRYCODESODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SO.isEditable")
    public String getISOCOUNTRYCODESOIsEditable() {
        return iSOCOUNTRYCODESOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SO.isEditable")
    public void setISOCOUNTRYCODESOIsEditable(String iSOCOUNTRYCODESOIsEditable) {
        this.iSOCOUNTRYCODESOIsEditable = iSOCOUNTRYCODESOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TM.value")
    public String getISOCOUNTRYCODETMValue() {
        return iSOCOUNTRYCODETMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TM.value")
    public void setISOCOUNTRYCODETMValue(String iSOCOUNTRYCODETMValue) {
        this.iSOCOUNTRYCODETMValue = iSOCOUNTRYCODETMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TM.description")
    public String getISOCOUNTRYCODETMDescription() {
        return iSOCOUNTRYCODETMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TM.description")
    public void setISOCOUNTRYCODETMDescription(String iSOCOUNTRYCODETMDescription) {
        this.iSOCOUNTRYCODETMDescription = iSOCOUNTRYCODETMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TM.isEditable")
    public String getISOCOUNTRYCODETMIsEditable() {
        return iSOCOUNTRYCODETMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TM.isEditable")
    public void setISOCOUNTRYCODETMIsEditable(String iSOCOUNTRYCODETMIsEditable) {
        this.iSOCOUNTRYCODETMIsEditable = iSOCOUNTRYCODETMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VN.value")
    public String getISOCOUNTRYCODEVNValue() {
        return iSOCOUNTRYCODEVNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VN.value")
    public void setISOCOUNTRYCODEVNValue(String iSOCOUNTRYCODEVNValue) {
        this.iSOCOUNTRYCODEVNValue = iSOCOUNTRYCODEVNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VN.description")
    public String getISOCOUNTRYCODEVNDescription() {
        return iSOCOUNTRYCODEVNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VN.description")
    public void setISOCOUNTRYCODEVNDescription(String iSOCOUNTRYCODEVNDescription) {
        this.iSOCOUNTRYCODEVNDescription = iSOCOUNTRYCODEVNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VN.isEditable")
    public String getISOCOUNTRYCODEVNIsEditable() {
        return iSOCOUNTRYCODEVNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VN.isEditable")
    public void setISOCOUNTRYCODEVNIsEditable(String iSOCOUNTRYCODEVNIsEditable) {
        this.iSOCOUNTRYCODEVNIsEditable = iSOCOUNTRYCODEVNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GQ.value")
    public String getISOCOUNTRYCODEGQValue() {
        return iSOCOUNTRYCODEGQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GQ.value")
    public void setISOCOUNTRYCODEGQValue(String iSOCOUNTRYCODEGQValue) {
        this.iSOCOUNTRYCODEGQValue = iSOCOUNTRYCODEGQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GQ.description")
    public String getISOCOUNTRYCODEGQDescription() {
        return iSOCOUNTRYCODEGQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GQ.description")
    public void setISOCOUNTRYCODEGQDescription(String iSOCOUNTRYCODEGQDescription) {
        this.iSOCOUNTRYCODEGQDescription = iSOCOUNTRYCODEGQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GQ.isEditable")
    public String getISOCOUNTRYCODEGQIsEditable() {
        return iSOCOUNTRYCODEGQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GQ.isEditable")
    public void setISOCOUNTRYCODEGQIsEditable(String iSOCOUNTRYCODEGQIsEditable) {
        this.iSOCOUNTRYCODEGQIsEditable = iSOCOUNTRYCODEGQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KH.value")
    public String getISOCOUNTRYCODEKHValue() {
        return iSOCOUNTRYCODEKHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KH.value")
    public void setISOCOUNTRYCODEKHValue(String iSOCOUNTRYCODEKHValue) {
        this.iSOCOUNTRYCODEKHValue = iSOCOUNTRYCODEKHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KH.description")
    public String getISOCOUNTRYCODEKHDescription() {
        return iSOCOUNTRYCODEKHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KH.description")
    public void setISOCOUNTRYCODEKHDescription(String iSOCOUNTRYCODEKHDescription) {
        this.iSOCOUNTRYCODEKHDescription = iSOCOUNTRYCODEKHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KH.isEditable")
    public String getISOCOUNTRYCODEKHIsEditable() {
        return iSOCOUNTRYCODEKHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KH.isEditable")
    public void setISOCOUNTRYCODEKHIsEditable(String iSOCOUNTRYCODEKHIsEditable) {
        this.iSOCOUNTRYCODEKHIsEditable = iSOCOUNTRYCODEKHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LA.value")
    public String getISOCOUNTRYCODELAValue() {
        return iSOCOUNTRYCODELAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LA.value")
    public void setISOCOUNTRYCODELAValue(String iSOCOUNTRYCODELAValue) {
        this.iSOCOUNTRYCODELAValue = iSOCOUNTRYCODELAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LA.description")
    public String getISOCOUNTRYCODELADescription() {
        return iSOCOUNTRYCODELADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LA.description")
    public void setISOCOUNTRYCODELADescription(String iSOCOUNTRYCODELADescription) {
        this.iSOCOUNTRYCODELADescription = iSOCOUNTRYCODELADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LA.isEditable")
    public String getISOCOUNTRYCODELAIsEditable() {
        return iSOCOUNTRYCODELAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LA.isEditable")
    public void setISOCOUNTRYCODELAIsEditable(String iSOCOUNTRYCODELAIsEditable) {
        this.iSOCOUNTRYCODELAIsEditable = iSOCOUNTRYCODELAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LK.value")
    public String getISOCOUNTRYCODELKValue() {
        return iSOCOUNTRYCODELKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LK.value")
    public void setISOCOUNTRYCODELKValue(String iSOCOUNTRYCODELKValue) {
        this.iSOCOUNTRYCODELKValue = iSOCOUNTRYCODELKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LK.description")
    public String getISOCOUNTRYCODELKDescription() {
        return iSOCOUNTRYCODELKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LK.description")
    public void setISOCOUNTRYCODELKDescription(String iSOCOUNTRYCODELKDescription) {
        this.iSOCOUNTRYCODELKDescription = iSOCOUNTRYCODELKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LK.isEditable")
    public String getISOCOUNTRYCODELKIsEditable() {
        return iSOCOUNTRYCODELKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LK.isEditable")
    public void setISOCOUNTRYCODELKIsEditable(String iSOCOUNTRYCODELKIsEditable) {
        this.iSOCOUNTRYCODELKIsEditable = iSOCOUNTRYCODELKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LT.value")
    public String getISOCOUNTRYCODELTValue() {
        return iSOCOUNTRYCODELTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LT.value")
    public void setISOCOUNTRYCODELTValue(String iSOCOUNTRYCODELTValue) {
        this.iSOCOUNTRYCODELTValue = iSOCOUNTRYCODELTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LT.description")
    public String getISOCOUNTRYCODELTDescription() {
        return iSOCOUNTRYCODELTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LT.description")
    public void setISOCOUNTRYCODELTDescription(String iSOCOUNTRYCODELTDescription) {
        this.iSOCOUNTRYCODELTDescription = iSOCOUNTRYCODELTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LT.isEditable")
    public String getISOCOUNTRYCODELTIsEditable() {
        return iSOCOUNTRYCODELTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LT.isEditable")
    public void setISOCOUNTRYCODELTIsEditable(String iSOCOUNTRYCODELTIsEditable) {
        this.iSOCOUNTRYCODELTIsEditable = iSOCOUNTRYCODELTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LY.value")
    public String getISOCOUNTRYCODELYValue() {
        return iSOCOUNTRYCODELYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LY.value")
    public void setISOCOUNTRYCODELYValue(String iSOCOUNTRYCODELYValue) {
        this.iSOCOUNTRYCODELYValue = iSOCOUNTRYCODELYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LY.description")
    public String getISOCOUNTRYCODELYDescription() {
        return iSOCOUNTRYCODELYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LY.description")
    public void setISOCOUNTRYCODELYDescription(String iSOCOUNTRYCODELYDescription) {
        this.iSOCOUNTRYCODELYDescription = iSOCOUNTRYCODELYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LY.isEditable")
    public String getISOCOUNTRYCODELYIsEditable() {
        return iSOCOUNTRYCODELYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LY.isEditable")
    public void setISOCOUNTRYCODELYIsEditable(String iSOCOUNTRYCODELYIsEditable) {
        this.iSOCOUNTRYCODELYIsEditable = iSOCOUNTRYCODELYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MC.value")
    public String getISOCOUNTRYCODEMCValue() {
        return iSOCOUNTRYCODEMCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MC.value")
    public void setISOCOUNTRYCODEMCValue(String iSOCOUNTRYCODEMCValue) {
        this.iSOCOUNTRYCODEMCValue = iSOCOUNTRYCODEMCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MC.description")
    public String getISOCOUNTRYCODEMCDescription() {
        return iSOCOUNTRYCODEMCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MC.description")
    public void setISOCOUNTRYCODEMCDescription(String iSOCOUNTRYCODEMCDescription) {
        this.iSOCOUNTRYCODEMCDescription = iSOCOUNTRYCODEMCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MC.isEditable")
    public String getISOCOUNTRYCODEMCIsEditable() {
        return iSOCOUNTRYCODEMCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MC.isEditable")
    public void setISOCOUNTRYCODEMCIsEditable(String iSOCOUNTRYCODEMCIsEditable) {
        this.iSOCOUNTRYCODEMCIsEditable = iSOCOUNTRYCODEMCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MH.value")
    public String getISOCOUNTRYCODEMHValue() {
        return iSOCOUNTRYCODEMHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MH.value")
    public void setISOCOUNTRYCODEMHValue(String iSOCOUNTRYCODEMHValue) {
        this.iSOCOUNTRYCODEMHValue = iSOCOUNTRYCODEMHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MH.description")
    public String getISOCOUNTRYCODEMHDescription() {
        return iSOCOUNTRYCODEMHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MH.description")
    public void setISOCOUNTRYCODEMHDescription(String iSOCOUNTRYCODEMHDescription) {
        this.iSOCOUNTRYCODEMHDescription = iSOCOUNTRYCODEMHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MH.isEditable")
    public String getISOCOUNTRYCODEMHIsEditable() {
        return iSOCOUNTRYCODEMHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MH.isEditable")
    public void setISOCOUNTRYCODEMHIsEditable(String iSOCOUNTRYCODEMHIsEditable) {
        this.iSOCOUNTRYCODEMHIsEditable = iSOCOUNTRYCODEMHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MM.value")
    public String getISOCOUNTRYCODEMMValue() {
        return iSOCOUNTRYCODEMMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MM.value")
    public void setISOCOUNTRYCODEMMValue(String iSOCOUNTRYCODEMMValue) {
        this.iSOCOUNTRYCODEMMValue = iSOCOUNTRYCODEMMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MM.description")
    public String getISOCOUNTRYCODEMMDescription() {
        return iSOCOUNTRYCODEMMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MM.description")
    public void setISOCOUNTRYCODEMMDescription(String iSOCOUNTRYCODEMMDescription) {
        this.iSOCOUNTRYCODEMMDescription = iSOCOUNTRYCODEMMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MM.isEditable")
    public String getISOCOUNTRYCODEMMIsEditable() {
        return iSOCOUNTRYCODEMMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MM.isEditable")
    public void setISOCOUNTRYCODEMMIsEditable(String iSOCOUNTRYCODEMMIsEditable) {
        this.iSOCOUNTRYCODEMMIsEditable = iSOCOUNTRYCODEMMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MP.value")
    public String getISOCOUNTRYCODEMPValue() {
        return iSOCOUNTRYCODEMPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MP.value")
    public void setISOCOUNTRYCODEMPValue(String iSOCOUNTRYCODEMPValue) {
        this.iSOCOUNTRYCODEMPValue = iSOCOUNTRYCODEMPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MP.description")
    public String getISOCOUNTRYCODEMPDescription() {
        return iSOCOUNTRYCODEMPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MP.description")
    public void setISOCOUNTRYCODEMPDescription(String iSOCOUNTRYCODEMPDescription) {
        this.iSOCOUNTRYCODEMPDescription = iSOCOUNTRYCODEMPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MP.isEditable")
    public String getISOCOUNTRYCODEMPIsEditable() {
        return iSOCOUNTRYCODEMPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MP.isEditable")
    public void setISOCOUNTRYCODEMPIsEditable(String iSOCOUNTRYCODEMPIsEditable) {
        this.iSOCOUNTRYCODEMPIsEditable = iSOCOUNTRYCODEMPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MS.value")
    public String getISOCOUNTRYCODEMSValue() {
        return iSOCOUNTRYCODEMSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MS.value")
    public void setISOCOUNTRYCODEMSValue(String iSOCOUNTRYCODEMSValue) {
        this.iSOCOUNTRYCODEMSValue = iSOCOUNTRYCODEMSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MS.description")
    public String getISOCOUNTRYCODEMSDescription() {
        return iSOCOUNTRYCODEMSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MS.description")
    public void setISOCOUNTRYCODEMSDescription(String iSOCOUNTRYCODEMSDescription) {
        this.iSOCOUNTRYCODEMSDescription = iSOCOUNTRYCODEMSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MS.isEditable")
    public String getISOCOUNTRYCODEMSIsEditable() {
        return iSOCOUNTRYCODEMSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MS.isEditable")
    public void setISOCOUNTRYCODEMSIsEditable(String iSOCOUNTRYCODEMSIsEditable) {
        this.iSOCOUNTRYCODEMSIsEditable = iSOCOUNTRYCODEMSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MV.value")
    public String getISOCOUNTRYCODEMVValue() {
        return iSOCOUNTRYCODEMVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MV.value")
    public void setISOCOUNTRYCODEMVValue(String iSOCOUNTRYCODEMVValue) {
        this.iSOCOUNTRYCODEMVValue = iSOCOUNTRYCODEMVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MV.description")
    public String getISOCOUNTRYCODEMVDescription() {
        return iSOCOUNTRYCODEMVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MV.description")
    public void setISOCOUNTRYCODEMVDescription(String iSOCOUNTRYCODEMVDescription) {
        this.iSOCOUNTRYCODEMVDescription = iSOCOUNTRYCODEMVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MV.isEditable")
    public String getISOCOUNTRYCODEMVIsEditable() {
        return iSOCOUNTRYCODEMVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MV.isEditable")
    public void setISOCOUNTRYCODEMVIsEditable(String iSOCOUNTRYCODEMVIsEditable) {
        this.iSOCOUNTRYCODEMVIsEditable = iSOCOUNTRYCODEMVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NU.value")
    public String getISOCOUNTRYCODENUValue() {
        return iSOCOUNTRYCODENUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NU.value")
    public void setISOCOUNTRYCODENUValue(String iSOCOUNTRYCODENUValue) {
        this.iSOCOUNTRYCODENUValue = iSOCOUNTRYCODENUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NU.description")
    public String getISOCOUNTRYCODENUDescription() {
        return iSOCOUNTRYCODENUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NU.description")
    public void setISOCOUNTRYCODENUDescription(String iSOCOUNTRYCODENUDescription) {
        this.iSOCOUNTRYCODENUDescription = iSOCOUNTRYCODENUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NU.isEditable")
    public String getISOCOUNTRYCODENUIsEditable() {
        return iSOCOUNTRYCODENUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NU.isEditable")
    public void setISOCOUNTRYCODENUIsEditable(String iSOCOUNTRYCODENUIsEditable) {
        this.iSOCOUNTRYCODENUIsEditable = iSOCOUNTRYCODENUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ST.value")
    public String getISOCOUNTRYCODESTValue() {
        return iSOCOUNTRYCODESTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ST.value")
    public void setISOCOUNTRYCODESTValue(String iSOCOUNTRYCODESTValue) {
        this.iSOCOUNTRYCODESTValue = iSOCOUNTRYCODESTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ST.description")
    public String getISOCOUNTRYCODESTDescription() {
        return iSOCOUNTRYCODESTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ST.description")
    public void setISOCOUNTRYCODESTDescription(String iSOCOUNTRYCODESTDescription) {
        this.iSOCOUNTRYCODESTDescription = iSOCOUNTRYCODESTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ST.isEditable")
    public String getISOCOUNTRYCODESTIsEditable() {
        return iSOCOUNTRYCODESTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ST.isEditable")
    public void setISOCOUNTRYCODESTIsEditable(String iSOCOUNTRYCODESTIsEditable) {
        this.iSOCOUNTRYCODESTIsEditable = iSOCOUNTRYCODESTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TC.value")
    public String getISOCOUNTRYCODETCValue() {
        return iSOCOUNTRYCODETCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TC.value")
    public void setISOCOUNTRYCODETCValue(String iSOCOUNTRYCODETCValue) {
        this.iSOCOUNTRYCODETCValue = iSOCOUNTRYCODETCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TC.description")
    public String getISOCOUNTRYCODETCDescription() {
        return iSOCOUNTRYCODETCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TC.description")
    public void setISOCOUNTRYCODETCDescription(String iSOCOUNTRYCODETCDescription) {
        this.iSOCOUNTRYCODETCDescription = iSOCOUNTRYCODETCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TC.isEditable")
    public String getISOCOUNTRYCODETCIsEditable() {
        return iSOCOUNTRYCODETCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TC.isEditable")
    public void setISOCOUNTRYCODETCIsEditable(String iSOCOUNTRYCODETCIsEditable) {
        this.iSOCOUNTRYCODETCIsEditable = iSOCOUNTRYCODETCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TG.value")
    public String getISOCOUNTRYCODETGValue() {
        return iSOCOUNTRYCODETGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TG.value")
    public void setISOCOUNTRYCODETGValue(String iSOCOUNTRYCODETGValue) {
        this.iSOCOUNTRYCODETGValue = iSOCOUNTRYCODETGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TG.description")
    public String getISOCOUNTRYCODETGDescription() {
        return iSOCOUNTRYCODETGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TG.description")
    public void setISOCOUNTRYCODETGDescription(String iSOCOUNTRYCODETGDescription) {
        this.iSOCOUNTRYCODETGDescription = iSOCOUNTRYCODETGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TG.isEditable")
    public String getISOCOUNTRYCODETGIsEditable() {
        return iSOCOUNTRYCODETGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TG.isEditable")
    public void setISOCOUNTRYCODETGIsEditable(String iSOCOUNTRYCODETGIsEditable) {
        this.iSOCOUNTRYCODETGIsEditable = iSOCOUNTRYCODETGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TK.value")
    public String getISOCOUNTRYCODETKValue() {
        return iSOCOUNTRYCODETKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TK.value")
    public void setISOCOUNTRYCODETKValue(String iSOCOUNTRYCODETKValue) {
        this.iSOCOUNTRYCODETKValue = iSOCOUNTRYCODETKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TK.description")
    public String getISOCOUNTRYCODETKDescription() {
        return iSOCOUNTRYCODETKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TK.description")
    public void setISOCOUNTRYCODETKDescription(String iSOCOUNTRYCODETKDescription) {
        this.iSOCOUNTRYCODETKDescription = iSOCOUNTRYCODETKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TK.isEditable")
    public String getISOCOUNTRYCODETKIsEditable() {
        return iSOCOUNTRYCODETKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TK.isEditable")
    public void setISOCOUNTRYCODETKIsEditable(String iSOCOUNTRYCODETKIsEditable) {
        this.iSOCOUNTRYCODETKIsEditable = iSOCOUNTRYCODETKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TO.value")
    public String getISOCOUNTRYCODETOValue() {
        return iSOCOUNTRYCODETOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TO.value")
    public void setISOCOUNTRYCODETOValue(String iSOCOUNTRYCODETOValue) {
        this.iSOCOUNTRYCODETOValue = iSOCOUNTRYCODETOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TO.description")
    public String getISOCOUNTRYCODETODescription() {
        return iSOCOUNTRYCODETODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TO.description")
    public void setISOCOUNTRYCODETODescription(String iSOCOUNTRYCODETODescription) {
        this.iSOCOUNTRYCODETODescription = iSOCOUNTRYCODETODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TO.isEditable")
    public String getISOCOUNTRYCODETOIsEditable() {
        return iSOCOUNTRYCODETOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TO.isEditable")
    public void setISOCOUNTRYCODETOIsEditable(String iSOCOUNTRYCODETOIsEditable) {
        this.iSOCOUNTRYCODETOIsEditable = iSOCOUNTRYCODETOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TT.value")
    public String getISOCOUNTRYCODETTValue() {
        return iSOCOUNTRYCODETTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TT.value")
    public void setISOCOUNTRYCODETTValue(String iSOCOUNTRYCODETTValue) {
        this.iSOCOUNTRYCODETTValue = iSOCOUNTRYCODETTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TT.description")
    public String getISOCOUNTRYCODETTDescription() {
        return iSOCOUNTRYCODETTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TT.description")
    public void setISOCOUNTRYCODETTDescription(String iSOCOUNTRYCODETTDescription) {
        this.iSOCOUNTRYCODETTDescription = iSOCOUNTRYCODETTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TT.isEditable")
    public String getISOCOUNTRYCODETTIsEditable() {
        return iSOCOUNTRYCODETTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TT.isEditable")
    public void setISOCOUNTRYCODETTIsEditable(String iSOCOUNTRYCODETTIsEditable) {
        this.iSOCOUNTRYCODETTIsEditable = iSOCOUNTRYCODETTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UA.value")
    public String getISOCOUNTRYCODEUAValue() {
        return iSOCOUNTRYCODEUAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UA.value")
    public void setISOCOUNTRYCODEUAValue(String iSOCOUNTRYCODEUAValue) {
        this.iSOCOUNTRYCODEUAValue = iSOCOUNTRYCODEUAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UA.description")
    public String getISOCOUNTRYCODEUADescription() {
        return iSOCOUNTRYCODEUADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UA.description")
    public void setISOCOUNTRYCODEUADescription(String iSOCOUNTRYCODEUADescription) {
        this.iSOCOUNTRYCODEUADescription = iSOCOUNTRYCODEUADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UA.isEditable")
    public String getISOCOUNTRYCODEUAIsEditable() {
        return iSOCOUNTRYCODEUAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UA.isEditable")
    public void setISOCOUNTRYCODEUAIsEditable(String iSOCOUNTRYCODEUAIsEditable) {
        this.iSOCOUNTRYCODEUAIsEditable = iSOCOUNTRYCODEUAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UM.value")
    public String getISOCOUNTRYCODEUMValue() {
        return iSOCOUNTRYCODEUMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UM.value")
    public void setISOCOUNTRYCODEUMValue(String iSOCOUNTRYCODEUMValue) {
        this.iSOCOUNTRYCODEUMValue = iSOCOUNTRYCODEUMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UM.description")
    public String getISOCOUNTRYCODEUMDescription() {
        return iSOCOUNTRYCODEUMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UM.description")
    public void setISOCOUNTRYCODEUMDescription(String iSOCOUNTRYCODEUMDescription) {
        this.iSOCOUNTRYCODEUMDescription = iSOCOUNTRYCODEUMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UM.isEditable")
    public String getISOCOUNTRYCODEUMIsEditable() {
        return iSOCOUNTRYCODEUMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UM.isEditable")
    public void setISOCOUNTRYCODEUMIsEditable(String iSOCOUNTRYCODEUMIsEditable) {
        this.iSOCOUNTRYCODEUMIsEditable = iSOCOUNTRYCODEUMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VA.value")
    public String getISOCOUNTRYCODEVAValue() {
        return iSOCOUNTRYCODEVAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VA.value")
    public void setISOCOUNTRYCODEVAValue(String iSOCOUNTRYCODEVAValue) {
        this.iSOCOUNTRYCODEVAValue = iSOCOUNTRYCODEVAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VA.description")
    public String getISOCOUNTRYCODEVADescription() {
        return iSOCOUNTRYCODEVADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VA.description")
    public void setISOCOUNTRYCODEVADescription(String iSOCOUNTRYCODEVADescription) {
        this.iSOCOUNTRYCODEVADescription = iSOCOUNTRYCODEVADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VA.isEditable")
    public String getISOCOUNTRYCODEVAIsEditable() {
        return iSOCOUNTRYCODEVAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VA.isEditable")
    public void setISOCOUNTRYCODEVAIsEditable(String iSOCOUNTRYCODEVAIsEditable) {
        this.iSOCOUNTRYCODEVAIsEditable = iSOCOUNTRYCODEVAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VI.value")
    public String getISOCOUNTRYCODEVIValue() {
        return iSOCOUNTRYCODEVIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VI.value")
    public void setISOCOUNTRYCODEVIValue(String iSOCOUNTRYCODEVIValue) {
        this.iSOCOUNTRYCODEVIValue = iSOCOUNTRYCODEVIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VI.description")
    public String getISOCOUNTRYCODEVIDescription() {
        return iSOCOUNTRYCODEVIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VI.description")
    public void setISOCOUNTRYCODEVIDescription(String iSOCOUNTRYCODEVIDescription) {
        this.iSOCOUNTRYCODEVIDescription = iSOCOUNTRYCODEVIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VI.isEditable")
    public String getISOCOUNTRYCODEVIIsEditable() {
        return iSOCOUNTRYCODEVIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VI.isEditable")
    public void setISOCOUNTRYCODEVIIsEditable(String iSOCOUNTRYCODEVIIsEditable) {
        this.iSOCOUNTRYCODEVIIsEditable = iSOCOUNTRYCODEVIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.WF.value")
    public String getISOCOUNTRYCODEWFValue() {
        return iSOCOUNTRYCODEWFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.WF.value")
    public void setISOCOUNTRYCODEWFValue(String iSOCOUNTRYCODEWFValue) {
        this.iSOCOUNTRYCODEWFValue = iSOCOUNTRYCODEWFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.WF.description")
    public String getISOCOUNTRYCODEWFDescription() {
        return iSOCOUNTRYCODEWFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.WF.description")
    public void setISOCOUNTRYCODEWFDescription(String iSOCOUNTRYCODEWFDescription) {
        this.iSOCOUNTRYCODEWFDescription = iSOCOUNTRYCODEWFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.WF.isEditable")
    public String getISOCOUNTRYCODEWFIsEditable() {
        return iSOCOUNTRYCODEWFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.WF.isEditable")
    public void setISOCOUNTRYCODEWFIsEditable(String iSOCOUNTRYCODEWFIsEditable) {
        this.iSOCOUNTRYCODEWFIsEditable = iSOCOUNTRYCODEWFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZA.value")
    public String getISOCOUNTRYCODEZAValue() {
        return iSOCOUNTRYCODEZAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZA.value")
    public void setISOCOUNTRYCODEZAValue(String iSOCOUNTRYCODEZAValue) {
        this.iSOCOUNTRYCODEZAValue = iSOCOUNTRYCODEZAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZA.description")
    public String getISOCOUNTRYCODEZADescription() {
        return iSOCOUNTRYCODEZADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZA.description")
    public void setISOCOUNTRYCODEZADescription(String iSOCOUNTRYCODEZADescription) {
        this.iSOCOUNTRYCODEZADescription = iSOCOUNTRYCODEZADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZA.isEditable")
    public String getISOCOUNTRYCODEZAIsEditable() {
        return iSOCOUNTRYCODEZAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZA.isEditable")
    public void setISOCOUNTRYCODEZAIsEditable(String iSOCOUNTRYCODEZAIsEditable) {
        this.iSOCOUNTRYCODEZAIsEditable = iSOCOUNTRYCODEZAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AX.value")
    public String getISOCOUNTRYCODEAXValue() {
        return iSOCOUNTRYCODEAXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AX.value")
    public void setISOCOUNTRYCODEAXValue(String iSOCOUNTRYCODEAXValue) {
        this.iSOCOUNTRYCODEAXValue = iSOCOUNTRYCODEAXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AX.description")
    public String getISOCOUNTRYCODEAXDescription() {
        return iSOCOUNTRYCODEAXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AX.description")
    public void setISOCOUNTRYCODEAXDescription(String iSOCOUNTRYCODEAXDescription) {
        this.iSOCOUNTRYCODEAXDescription = iSOCOUNTRYCODEAXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AX.isEditable")
    public String getISOCOUNTRYCODEAXIsEditable() {
        return iSOCOUNTRYCODEAXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AX.isEditable")
    public void setISOCOUNTRYCODEAXIsEditable(String iSOCOUNTRYCODEAXIsEditable) {
        this.iSOCOUNTRYCODEAXIsEditable = iSOCOUNTRYCODEAXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MF.value")
    public String getISOCOUNTRYCODEMFValue() {
        return iSOCOUNTRYCODEMFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MF.value")
    public void setISOCOUNTRYCODEMFValue(String iSOCOUNTRYCODEMFValue) {
        this.iSOCOUNTRYCODEMFValue = iSOCOUNTRYCODEMFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MF.description")
    public String getISOCOUNTRYCODEMFDescription() {
        return iSOCOUNTRYCODEMFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MF.description")
    public void setISOCOUNTRYCODEMFDescription(String iSOCOUNTRYCODEMFDescription) {
        this.iSOCOUNTRYCODEMFDescription = iSOCOUNTRYCODEMFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MF.isEditable")
    public String getISOCOUNTRYCODEMFIsEditable() {
        return iSOCOUNTRYCODEMFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MF.isEditable")
    public void setISOCOUNTRYCODEMFIsEditable(String iSOCOUNTRYCODEMFIsEditable) {
        this.iSOCOUNTRYCODEMFIsEditable = iSOCOUNTRYCODEMFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CW.value")
    public String getISOCOUNTRYCODECWValue() {
        return iSOCOUNTRYCODECWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CW.value")
    public void setISOCOUNTRYCODECWValue(String iSOCOUNTRYCODECWValue) {
        this.iSOCOUNTRYCODECWValue = iSOCOUNTRYCODECWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CW.description")
    public String getISOCOUNTRYCODECWDescription() {
        return iSOCOUNTRYCODECWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CW.description")
    public void setISOCOUNTRYCODECWDescription(String iSOCOUNTRYCODECWDescription) {
        this.iSOCOUNTRYCODECWDescription = iSOCOUNTRYCODECWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CW.isEditable")
    public String getISOCOUNTRYCODECWIsEditable() {
        return iSOCOUNTRYCODECWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CW.isEditable")
    public void setISOCOUNTRYCODECWIsEditable(String iSOCOUNTRYCODECWIsEditable) {
        this.iSOCOUNTRYCODECWIsEditable = iSOCOUNTRYCODECWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BL.value")
    public String getISOCOUNTRYCODEBLValue() {
        return iSOCOUNTRYCODEBLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BL.value")
    public void setISOCOUNTRYCODEBLValue(String iSOCOUNTRYCODEBLValue) {
        this.iSOCOUNTRYCODEBLValue = iSOCOUNTRYCODEBLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BL.description")
    public String getISOCOUNTRYCODEBLDescription() {
        return iSOCOUNTRYCODEBLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BL.description")
    public void setISOCOUNTRYCODEBLDescription(String iSOCOUNTRYCODEBLDescription) {
        this.iSOCOUNTRYCODEBLDescription = iSOCOUNTRYCODEBLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BL.isEditable")
    public String getISOCOUNTRYCODEBLIsEditable() {
        return iSOCOUNTRYCODEBLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BL.isEditable")
    public void setISOCOUNTRYCODEBLIsEditable(String iSOCOUNTRYCODEBLIsEditable) {
        this.iSOCOUNTRYCODEBLIsEditable = iSOCOUNTRYCODEBLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SX.value")
    public String getISOCOUNTRYCODESXValue() {
        return iSOCOUNTRYCODESXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SX.value")
    public void setISOCOUNTRYCODESXValue(String iSOCOUNTRYCODESXValue) {
        this.iSOCOUNTRYCODESXValue = iSOCOUNTRYCODESXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SX.description")
    public String getISOCOUNTRYCODESXDescription() {
        return iSOCOUNTRYCODESXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SX.description")
    public void setISOCOUNTRYCODESXDescription(String iSOCOUNTRYCODESXDescription) {
        this.iSOCOUNTRYCODESXDescription = iSOCOUNTRYCODESXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SX.isEditable")
    public String getISOCOUNTRYCODESXIsEditable() {
        return iSOCOUNTRYCODESXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SX.isEditable")
    public void setISOCOUNTRYCODESXIsEditable(String iSOCOUNTRYCODESXIsEditable) {
        this.iSOCOUNTRYCODESXIsEditable = iSOCOUNTRYCODESXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TL.value")
    public String getISOCOUNTRYCODETLValue() {
        return iSOCOUNTRYCODETLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TL.value")
    public void setISOCOUNTRYCODETLValue(String iSOCOUNTRYCODETLValue) {
        this.iSOCOUNTRYCODETLValue = iSOCOUNTRYCODETLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TL.description")
    public String getISOCOUNTRYCODETLDescription() {
        return iSOCOUNTRYCODETLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TL.description")
    public void setISOCOUNTRYCODETLDescription(String iSOCOUNTRYCODETLDescription) {
        this.iSOCOUNTRYCODETLDescription = iSOCOUNTRYCODETLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TL.isEditable")
    public String getISOCOUNTRYCODETLIsEditable() {
        return iSOCOUNTRYCODETLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TL.isEditable")
    public void setISOCOUNTRYCODETLIsEditable(String iSOCOUNTRYCODETLIsEditable) {
        this.iSOCOUNTRYCODETLIsEditable = iSOCOUNTRYCODETLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SS.value")
    public String getISOCOUNTRYCODESSValue() {
        return iSOCOUNTRYCODESSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SS.value")
    public void setISOCOUNTRYCODESSValue(String iSOCOUNTRYCODESSValue) {
        this.iSOCOUNTRYCODESSValue = iSOCOUNTRYCODESSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SS.description")
    public String getISOCOUNTRYCODESSDescription() {
        return iSOCOUNTRYCODESSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SS.description")
    public void setISOCOUNTRYCODESSDescription(String iSOCOUNTRYCODESSDescription) {
        this.iSOCOUNTRYCODESSDescription = iSOCOUNTRYCODESSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SS.isEditable")
    public String getISOCOUNTRYCODESSIsEditable() {
        return iSOCOUNTRYCODESSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SS.isEditable")
    public void setISOCOUNTRYCODESSIsEditable(String iSOCOUNTRYCODESSIsEditable) {
        this.iSOCOUNTRYCODESSIsEditable = iSOCOUNTRYCODESSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RS.value")
    public String getISOCOUNTRYCODERSValue() {
        return iSOCOUNTRYCODERSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RS.value")
    public void setISOCOUNTRYCODERSValue(String iSOCOUNTRYCODERSValue) {
        this.iSOCOUNTRYCODERSValue = iSOCOUNTRYCODERSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RS.description")
    public String getISOCOUNTRYCODERSDescription() {
        return iSOCOUNTRYCODERSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RS.description")
    public void setISOCOUNTRYCODERSDescription(String iSOCOUNTRYCODERSDescription) {
        this.iSOCOUNTRYCODERSDescription = iSOCOUNTRYCODERSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RS.isEditable")
    public String getISOCOUNTRYCODERSIsEditable() {
        return iSOCOUNTRYCODERSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RS.isEditable")
    public void setISOCOUNTRYCODERSIsEditable(String iSOCOUNTRYCODERSIsEditable) {
        this.iSOCOUNTRYCODERSIsEditable = iSOCOUNTRYCODERSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AD.value")
    public String getISOCOUNTRYCODEADValue() {
        return iSOCOUNTRYCODEADValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AD.value")
    public void setISOCOUNTRYCODEADValue(String iSOCOUNTRYCODEADValue) {
        this.iSOCOUNTRYCODEADValue = iSOCOUNTRYCODEADValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AD.description")
    public String getISOCOUNTRYCODEADDescription() {
        return iSOCOUNTRYCODEADDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AD.description")
    public void setISOCOUNTRYCODEADDescription(String iSOCOUNTRYCODEADDescription) {
        this.iSOCOUNTRYCODEADDescription = iSOCOUNTRYCODEADDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AD.isEditable")
    public String getISOCOUNTRYCODEADIsEditable() {
        return iSOCOUNTRYCODEADIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AD.isEditable")
    public void setISOCOUNTRYCODEADIsEditable(String iSOCOUNTRYCODEADIsEditable) {
        this.iSOCOUNTRYCODEADIsEditable = iSOCOUNTRYCODEADIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AE.value")
    public String getISOCOUNTRYCODEAEValue() {
        return iSOCOUNTRYCODEAEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AE.value")
    public void setISOCOUNTRYCODEAEValue(String iSOCOUNTRYCODEAEValue) {
        this.iSOCOUNTRYCODEAEValue = iSOCOUNTRYCODEAEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AE.description")
    public String getISOCOUNTRYCODEAEDescription() {
        return iSOCOUNTRYCODEAEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AE.description")
    public void setISOCOUNTRYCODEAEDescription(String iSOCOUNTRYCODEAEDescription) {
        this.iSOCOUNTRYCODEAEDescription = iSOCOUNTRYCODEAEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AE.isEditable")
    public String getISOCOUNTRYCODEAEIsEditable() {
        return iSOCOUNTRYCODEAEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AE.isEditable")
    public void setISOCOUNTRYCODEAEIsEditable(String iSOCOUNTRYCODEAEIsEditable) {
        this.iSOCOUNTRYCODEAEIsEditable = iSOCOUNTRYCODEAEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AF.value")
    public String getISOCOUNTRYCODEAFValue() {
        return iSOCOUNTRYCODEAFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AF.value")
    public void setISOCOUNTRYCODEAFValue(String iSOCOUNTRYCODEAFValue) {
        this.iSOCOUNTRYCODEAFValue = iSOCOUNTRYCODEAFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AF.description")
    public String getISOCOUNTRYCODEAFDescription() {
        return iSOCOUNTRYCODEAFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AF.description")
    public void setISOCOUNTRYCODEAFDescription(String iSOCOUNTRYCODEAFDescription) {
        this.iSOCOUNTRYCODEAFDescription = iSOCOUNTRYCODEAFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AF.isEditable")
    public String getISOCOUNTRYCODEAFIsEditable() {
        return iSOCOUNTRYCODEAFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AF.isEditable")
    public void setISOCOUNTRYCODEAFIsEditable(String iSOCOUNTRYCODEAFIsEditable) {
        this.iSOCOUNTRYCODEAFIsEditable = iSOCOUNTRYCODEAFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AG.value")
    public String getISOCOUNTRYCODEAGValue() {
        return iSOCOUNTRYCODEAGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AG.value")
    public void setISOCOUNTRYCODEAGValue(String iSOCOUNTRYCODEAGValue) {
        this.iSOCOUNTRYCODEAGValue = iSOCOUNTRYCODEAGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AG.description")
    public String getISOCOUNTRYCODEAGDescription() {
        return iSOCOUNTRYCODEAGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AG.description")
    public void setISOCOUNTRYCODEAGDescription(String iSOCOUNTRYCODEAGDescription) {
        this.iSOCOUNTRYCODEAGDescription = iSOCOUNTRYCODEAGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AG.isEditable")
    public String getISOCOUNTRYCODEAGIsEditable() {
        return iSOCOUNTRYCODEAGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AG.isEditable")
    public void setISOCOUNTRYCODEAGIsEditable(String iSOCOUNTRYCODEAGIsEditable) {
        this.iSOCOUNTRYCODEAGIsEditable = iSOCOUNTRYCODEAGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AI.value")
    public String getISOCOUNTRYCODEAIValue() {
        return iSOCOUNTRYCODEAIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AI.value")
    public void setISOCOUNTRYCODEAIValue(String iSOCOUNTRYCODEAIValue) {
        this.iSOCOUNTRYCODEAIValue = iSOCOUNTRYCODEAIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AI.description")
    public String getISOCOUNTRYCODEAIDescription() {
        return iSOCOUNTRYCODEAIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AI.description")
    public void setISOCOUNTRYCODEAIDescription(String iSOCOUNTRYCODEAIDescription) {
        this.iSOCOUNTRYCODEAIDescription = iSOCOUNTRYCODEAIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AI.isEditable")
    public String getISOCOUNTRYCODEAIIsEditable() {
        return iSOCOUNTRYCODEAIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AI.isEditable")
    public void setISOCOUNTRYCODEAIIsEditable(String iSOCOUNTRYCODEAIIsEditable) {
        this.iSOCOUNTRYCODEAIIsEditable = iSOCOUNTRYCODEAIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AL.value")
    public String getISOCOUNTRYCODEALValue() {
        return iSOCOUNTRYCODEALValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AL.value")
    public void setISOCOUNTRYCODEALValue(String iSOCOUNTRYCODEALValue) {
        this.iSOCOUNTRYCODEALValue = iSOCOUNTRYCODEALValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AL.description")
    public String getISOCOUNTRYCODEALDescription() {
        return iSOCOUNTRYCODEALDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AL.description")
    public void setISOCOUNTRYCODEALDescription(String iSOCOUNTRYCODEALDescription) {
        this.iSOCOUNTRYCODEALDescription = iSOCOUNTRYCODEALDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AL.isEditable")
    public String getISOCOUNTRYCODEALIsEditable() {
        return iSOCOUNTRYCODEALIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AL.isEditable")
    public void setISOCOUNTRYCODEALIsEditable(String iSOCOUNTRYCODEALIsEditable) {
        this.iSOCOUNTRYCODEALIsEditable = iSOCOUNTRYCODEALIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AM.value")
    public String getISOCOUNTRYCODEAMValue() {
        return iSOCOUNTRYCODEAMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AM.value")
    public void setISOCOUNTRYCODEAMValue(String iSOCOUNTRYCODEAMValue) {
        this.iSOCOUNTRYCODEAMValue = iSOCOUNTRYCODEAMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AM.description")
    public String getISOCOUNTRYCODEAMDescription() {
        return iSOCOUNTRYCODEAMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AM.description")
    public void setISOCOUNTRYCODEAMDescription(String iSOCOUNTRYCODEAMDescription) {
        this.iSOCOUNTRYCODEAMDescription = iSOCOUNTRYCODEAMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AM.isEditable")
    public String getISOCOUNTRYCODEAMIsEditable() {
        return iSOCOUNTRYCODEAMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AM.isEditable")
    public void setISOCOUNTRYCODEAMIsEditable(String iSOCOUNTRYCODEAMIsEditable) {
        this.iSOCOUNTRYCODEAMIsEditable = iSOCOUNTRYCODEAMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AO.value")
    public String getISOCOUNTRYCODEAOValue() {
        return iSOCOUNTRYCODEAOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AO.value")
    public void setISOCOUNTRYCODEAOValue(String iSOCOUNTRYCODEAOValue) {
        this.iSOCOUNTRYCODEAOValue = iSOCOUNTRYCODEAOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AO.description")
    public String getISOCOUNTRYCODEAODescription() {
        return iSOCOUNTRYCODEAODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AO.description")
    public void setISOCOUNTRYCODEAODescription(String iSOCOUNTRYCODEAODescription) {
        this.iSOCOUNTRYCODEAODescription = iSOCOUNTRYCODEAODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AO.isEditable")
    public String getISOCOUNTRYCODEAOIsEditable() {
        return iSOCOUNTRYCODEAOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AO.isEditable")
    public void setISOCOUNTRYCODEAOIsEditable(String iSOCOUNTRYCODEAOIsEditable) {
        this.iSOCOUNTRYCODEAOIsEditable = iSOCOUNTRYCODEAOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AQ.value")
    public String getISOCOUNTRYCODEAQValue() {
        return iSOCOUNTRYCODEAQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AQ.value")
    public void setISOCOUNTRYCODEAQValue(String iSOCOUNTRYCODEAQValue) {
        this.iSOCOUNTRYCODEAQValue = iSOCOUNTRYCODEAQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AQ.description")
    public String getISOCOUNTRYCODEAQDescription() {
        return iSOCOUNTRYCODEAQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AQ.description")
    public void setISOCOUNTRYCODEAQDescription(String iSOCOUNTRYCODEAQDescription) {
        this.iSOCOUNTRYCODEAQDescription = iSOCOUNTRYCODEAQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AQ.isEditable")
    public String getISOCOUNTRYCODEAQIsEditable() {
        return iSOCOUNTRYCODEAQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AQ.isEditable")
    public void setISOCOUNTRYCODEAQIsEditable(String iSOCOUNTRYCODEAQIsEditable) {
        this.iSOCOUNTRYCODEAQIsEditable = iSOCOUNTRYCODEAQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AR.value")
    public String getISOCOUNTRYCODEARValue() {
        return iSOCOUNTRYCODEARValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AR.value")
    public void setISOCOUNTRYCODEARValue(String iSOCOUNTRYCODEARValue) {
        this.iSOCOUNTRYCODEARValue = iSOCOUNTRYCODEARValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AR.description")
    public String getISOCOUNTRYCODEARDescription() {
        return iSOCOUNTRYCODEARDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AR.description")
    public void setISOCOUNTRYCODEARDescription(String iSOCOUNTRYCODEARDescription) {
        this.iSOCOUNTRYCODEARDescription = iSOCOUNTRYCODEARDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AR.isEditable")
    public String getISOCOUNTRYCODEARIsEditable() {
        return iSOCOUNTRYCODEARIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AR.isEditable")
    public void setISOCOUNTRYCODEARIsEditable(String iSOCOUNTRYCODEARIsEditable) {
        this.iSOCOUNTRYCODEARIsEditable = iSOCOUNTRYCODEARIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AS.value")
    public String getISOCOUNTRYCODEASValue() {
        return iSOCOUNTRYCODEASValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AS.value")
    public void setISOCOUNTRYCODEASValue(String iSOCOUNTRYCODEASValue) {
        this.iSOCOUNTRYCODEASValue = iSOCOUNTRYCODEASValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AS.description")
    public String getISOCOUNTRYCODEASDescription() {
        return iSOCOUNTRYCODEASDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AS.description")
    public void setISOCOUNTRYCODEASDescription(String iSOCOUNTRYCODEASDescription) {
        this.iSOCOUNTRYCODEASDescription = iSOCOUNTRYCODEASDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AS.isEditable")
    public String getISOCOUNTRYCODEASIsEditable() {
        return iSOCOUNTRYCODEASIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AS.isEditable")
    public void setISOCOUNTRYCODEASIsEditable(String iSOCOUNTRYCODEASIsEditable) {
        this.iSOCOUNTRYCODEASIsEditable = iSOCOUNTRYCODEASIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AT.value")
    public String getISOCOUNTRYCODEATValue() {
        return iSOCOUNTRYCODEATValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AT.value")
    public void setISOCOUNTRYCODEATValue(String iSOCOUNTRYCODEATValue) {
        this.iSOCOUNTRYCODEATValue = iSOCOUNTRYCODEATValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AT.description")
    public String getISOCOUNTRYCODEATDescription() {
        return iSOCOUNTRYCODEATDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AT.description")
    public void setISOCOUNTRYCODEATDescription(String iSOCOUNTRYCODEATDescription) {
        this.iSOCOUNTRYCODEATDescription = iSOCOUNTRYCODEATDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AT.isEditable")
    public String getISOCOUNTRYCODEATIsEditable() {
        return iSOCOUNTRYCODEATIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AT.isEditable")
    public void setISOCOUNTRYCODEATIsEditable(String iSOCOUNTRYCODEATIsEditable) {
        this.iSOCOUNTRYCODEATIsEditable = iSOCOUNTRYCODEATIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AZ.value")
    public String getISOCOUNTRYCODEAZValue() {
        return iSOCOUNTRYCODEAZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AZ.value")
    public void setISOCOUNTRYCODEAZValue(String iSOCOUNTRYCODEAZValue) {
        this.iSOCOUNTRYCODEAZValue = iSOCOUNTRYCODEAZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.AZ.description")
    public String getISOCOUNTRYCODEAZDescription() {
        return iSOCOUNTRYCODEAZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AZ.description")
    public void setISOCOUNTRYCODEAZDescription(String iSOCOUNTRYCODEAZDescription) {
        this.iSOCOUNTRYCODEAZDescription = iSOCOUNTRYCODEAZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.AZ.isEditable")
    public String getISOCOUNTRYCODEAZIsEditable() {
        return iSOCOUNTRYCODEAZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.AZ.isEditable")
    public void setISOCOUNTRYCODEAZIsEditable(String iSOCOUNTRYCODEAZIsEditable) {
        this.iSOCOUNTRYCODEAZIsEditable = iSOCOUNTRYCODEAZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BA.value")
    public String getISOCOUNTRYCODEBAValue() {
        return iSOCOUNTRYCODEBAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BA.value")
    public void setISOCOUNTRYCODEBAValue(String iSOCOUNTRYCODEBAValue) {
        this.iSOCOUNTRYCODEBAValue = iSOCOUNTRYCODEBAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BA.description")
    public String getISOCOUNTRYCODEBADescription() {
        return iSOCOUNTRYCODEBADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BA.description")
    public void setISOCOUNTRYCODEBADescription(String iSOCOUNTRYCODEBADescription) {
        this.iSOCOUNTRYCODEBADescription = iSOCOUNTRYCODEBADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BA.isEditable")
    public String getISOCOUNTRYCODEBAIsEditable() {
        return iSOCOUNTRYCODEBAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BA.isEditable")
    public void setISOCOUNTRYCODEBAIsEditable(String iSOCOUNTRYCODEBAIsEditable) {
        this.iSOCOUNTRYCODEBAIsEditable = iSOCOUNTRYCODEBAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BB.value")
    public String getISOCOUNTRYCODEBBValue() {
        return iSOCOUNTRYCODEBBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BB.value")
    public void setISOCOUNTRYCODEBBValue(String iSOCOUNTRYCODEBBValue) {
        this.iSOCOUNTRYCODEBBValue = iSOCOUNTRYCODEBBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BB.description")
    public String getISOCOUNTRYCODEBBDescription() {
        return iSOCOUNTRYCODEBBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BB.description")
    public void setISOCOUNTRYCODEBBDescription(String iSOCOUNTRYCODEBBDescription) {
        this.iSOCOUNTRYCODEBBDescription = iSOCOUNTRYCODEBBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BB.isEditable")
    public String getISOCOUNTRYCODEBBIsEditable() {
        return iSOCOUNTRYCODEBBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BB.isEditable")
    public void setISOCOUNTRYCODEBBIsEditable(String iSOCOUNTRYCODEBBIsEditable) {
        this.iSOCOUNTRYCODEBBIsEditable = iSOCOUNTRYCODEBBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BD.value")
    public String getISOCOUNTRYCODEBDValue() {
        return iSOCOUNTRYCODEBDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BD.value")
    public void setISOCOUNTRYCODEBDValue(String iSOCOUNTRYCODEBDValue) {
        this.iSOCOUNTRYCODEBDValue = iSOCOUNTRYCODEBDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BD.description")
    public String getISOCOUNTRYCODEBDDescription() {
        return iSOCOUNTRYCODEBDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BD.description")
    public void setISOCOUNTRYCODEBDDescription(String iSOCOUNTRYCODEBDDescription) {
        this.iSOCOUNTRYCODEBDDescription = iSOCOUNTRYCODEBDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BD.isEditable")
    public String getISOCOUNTRYCODEBDIsEditable() {
        return iSOCOUNTRYCODEBDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BD.isEditable")
    public void setISOCOUNTRYCODEBDIsEditable(String iSOCOUNTRYCODEBDIsEditable) {
        this.iSOCOUNTRYCODEBDIsEditable = iSOCOUNTRYCODEBDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BE.value")
    public String getISOCOUNTRYCODEBEValue() {
        return iSOCOUNTRYCODEBEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BE.value")
    public void setISOCOUNTRYCODEBEValue(String iSOCOUNTRYCODEBEValue) {
        this.iSOCOUNTRYCODEBEValue = iSOCOUNTRYCODEBEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BE.description")
    public String getISOCOUNTRYCODEBEDescription() {
        return iSOCOUNTRYCODEBEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BE.description")
    public void setISOCOUNTRYCODEBEDescription(String iSOCOUNTRYCODEBEDescription) {
        this.iSOCOUNTRYCODEBEDescription = iSOCOUNTRYCODEBEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BE.isEditable")
    public String getISOCOUNTRYCODEBEIsEditable() {
        return iSOCOUNTRYCODEBEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BE.isEditable")
    public void setISOCOUNTRYCODEBEIsEditable(String iSOCOUNTRYCODEBEIsEditable) {
        this.iSOCOUNTRYCODEBEIsEditable = iSOCOUNTRYCODEBEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BF.value")
    public String getISOCOUNTRYCODEBFValue() {
        return iSOCOUNTRYCODEBFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BF.value")
    public void setISOCOUNTRYCODEBFValue(String iSOCOUNTRYCODEBFValue) {
        this.iSOCOUNTRYCODEBFValue = iSOCOUNTRYCODEBFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BF.description")
    public String getISOCOUNTRYCODEBFDescription() {
        return iSOCOUNTRYCODEBFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BF.description")
    public void setISOCOUNTRYCODEBFDescription(String iSOCOUNTRYCODEBFDescription) {
        this.iSOCOUNTRYCODEBFDescription = iSOCOUNTRYCODEBFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BF.isEditable")
    public String getISOCOUNTRYCODEBFIsEditable() {
        return iSOCOUNTRYCODEBFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BF.isEditable")
    public void setISOCOUNTRYCODEBFIsEditable(String iSOCOUNTRYCODEBFIsEditable) {
        this.iSOCOUNTRYCODEBFIsEditable = iSOCOUNTRYCODEBFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BG.value")
    public String getISOCOUNTRYCODEBGValue() {
        return iSOCOUNTRYCODEBGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BG.value")
    public void setISOCOUNTRYCODEBGValue(String iSOCOUNTRYCODEBGValue) {
        this.iSOCOUNTRYCODEBGValue = iSOCOUNTRYCODEBGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BG.description")
    public String getISOCOUNTRYCODEBGDescription() {
        return iSOCOUNTRYCODEBGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BG.description")
    public void setISOCOUNTRYCODEBGDescription(String iSOCOUNTRYCODEBGDescription) {
        this.iSOCOUNTRYCODEBGDescription = iSOCOUNTRYCODEBGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BG.isEditable")
    public String getISOCOUNTRYCODEBGIsEditable() {
        return iSOCOUNTRYCODEBGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BG.isEditable")
    public void setISOCOUNTRYCODEBGIsEditable(String iSOCOUNTRYCODEBGIsEditable) {
        this.iSOCOUNTRYCODEBGIsEditable = iSOCOUNTRYCODEBGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BI.value")
    public String getISOCOUNTRYCODEBIValue() {
        return iSOCOUNTRYCODEBIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BI.value")
    public void setISOCOUNTRYCODEBIValue(String iSOCOUNTRYCODEBIValue) {
        this.iSOCOUNTRYCODEBIValue = iSOCOUNTRYCODEBIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BI.description")
    public String getISOCOUNTRYCODEBIDescription() {
        return iSOCOUNTRYCODEBIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BI.description")
    public void setISOCOUNTRYCODEBIDescription(String iSOCOUNTRYCODEBIDescription) {
        this.iSOCOUNTRYCODEBIDescription = iSOCOUNTRYCODEBIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BI.isEditable")
    public String getISOCOUNTRYCODEBIIsEditable() {
        return iSOCOUNTRYCODEBIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BI.isEditable")
    public void setISOCOUNTRYCODEBIIsEditable(String iSOCOUNTRYCODEBIIsEditable) {
        this.iSOCOUNTRYCODEBIIsEditable = iSOCOUNTRYCODEBIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BJ.value")
    public String getISOCOUNTRYCODEBJValue() {
        return iSOCOUNTRYCODEBJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BJ.value")
    public void setISOCOUNTRYCODEBJValue(String iSOCOUNTRYCODEBJValue) {
        this.iSOCOUNTRYCODEBJValue = iSOCOUNTRYCODEBJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BJ.description")
    public String getISOCOUNTRYCODEBJDescription() {
        return iSOCOUNTRYCODEBJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BJ.description")
    public void setISOCOUNTRYCODEBJDescription(String iSOCOUNTRYCODEBJDescription) {
        this.iSOCOUNTRYCODEBJDescription = iSOCOUNTRYCODEBJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BJ.isEditable")
    public String getISOCOUNTRYCODEBJIsEditable() {
        return iSOCOUNTRYCODEBJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BJ.isEditable")
    public void setISOCOUNTRYCODEBJIsEditable(String iSOCOUNTRYCODEBJIsEditable) {
        this.iSOCOUNTRYCODEBJIsEditable = iSOCOUNTRYCODEBJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BN.value")
    public String getISOCOUNTRYCODEBNValue() {
        return iSOCOUNTRYCODEBNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BN.value")
    public void setISOCOUNTRYCODEBNValue(String iSOCOUNTRYCODEBNValue) {
        this.iSOCOUNTRYCODEBNValue = iSOCOUNTRYCODEBNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BN.description")
    public String getISOCOUNTRYCODEBNDescription() {
        return iSOCOUNTRYCODEBNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BN.description")
    public void setISOCOUNTRYCODEBNDescription(String iSOCOUNTRYCODEBNDescription) {
        this.iSOCOUNTRYCODEBNDescription = iSOCOUNTRYCODEBNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BN.isEditable")
    public String getISOCOUNTRYCODEBNIsEditable() {
        return iSOCOUNTRYCODEBNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BN.isEditable")
    public void setISOCOUNTRYCODEBNIsEditable(String iSOCOUNTRYCODEBNIsEditable) {
        this.iSOCOUNTRYCODEBNIsEditable = iSOCOUNTRYCODEBNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BO.value")
    public String getISOCOUNTRYCODEBOValue() {
        return iSOCOUNTRYCODEBOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BO.value")
    public void setISOCOUNTRYCODEBOValue(String iSOCOUNTRYCODEBOValue) {
        this.iSOCOUNTRYCODEBOValue = iSOCOUNTRYCODEBOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BO.description")
    public String getISOCOUNTRYCODEBODescription() {
        return iSOCOUNTRYCODEBODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BO.description")
    public void setISOCOUNTRYCODEBODescription(String iSOCOUNTRYCODEBODescription) {
        this.iSOCOUNTRYCODEBODescription = iSOCOUNTRYCODEBODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BO.isEditable")
    public String getISOCOUNTRYCODEBOIsEditable() {
        return iSOCOUNTRYCODEBOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BO.isEditable")
    public void setISOCOUNTRYCODEBOIsEditable(String iSOCOUNTRYCODEBOIsEditable) {
        this.iSOCOUNTRYCODEBOIsEditable = iSOCOUNTRYCODEBOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BR.value")
    public String getISOCOUNTRYCODEBRValue() {
        return iSOCOUNTRYCODEBRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BR.value")
    public void setISOCOUNTRYCODEBRValue(String iSOCOUNTRYCODEBRValue) {
        this.iSOCOUNTRYCODEBRValue = iSOCOUNTRYCODEBRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BR.description")
    public String getISOCOUNTRYCODEBRDescription() {
        return iSOCOUNTRYCODEBRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BR.description")
    public void setISOCOUNTRYCODEBRDescription(String iSOCOUNTRYCODEBRDescription) {
        this.iSOCOUNTRYCODEBRDescription = iSOCOUNTRYCODEBRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BR.isEditable")
    public String getISOCOUNTRYCODEBRIsEditable() {
        return iSOCOUNTRYCODEBRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BR.isEditable")
    public void setISOCOUNTRYCODEBRIsEditable(String iSOCOUNTRYCODEBRIsEditable) {
        this.iSOCOUNTRYCODEBRIsEditable = iSOCOUNTRYCODEBRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BS.value")
    public String getISOCOUNTRYCODEBSValue() {
        return iSOCOUNTRYCODEBSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BS.value")
    public void setISOCOUNTRYCODEBSValue(String iSOCOUNTRYCODEBSValue) {
        this.iSOCOUNTRYCODEBSValue = iSOCOUNTRYCODEBSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BS.description")
    public String getISOCOUNTRYCODEBSDescription() {
        return iSOCOUNTRYCODEBSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BS.description")
    public void setISOCOUNTRYCODEBSDescription(String iSOCOUNTRYCODEBSDescription) {
        this.iSOCOUNTRYCODEBSDescription = iSOCOUNTRYCODEBSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BS.isEditable")
    public String getISOCOUNTRYCODEBSIsEditable() {
        return iSOCOUNTRYCODEBSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BS.isEditable")
    public void setISOCOUNTRYCODEBSIsEditable(String iSOCOUNTRYCODEBSIsEditable) {
        this.iSOCOUNTRYCODEBSIsEditable = iSOCOUNTRYCODEBSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BT.value")
    public String getISOCOUNTRYCODEBTValue() {
        return iSOCOUNTRYCODEBTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BT.value")
    public void setISOCOUNTRYCODEBTValue(String iSOCOUNTRYCODEBTValue) {
        this.iSOCOUNTRYCODEBTValue = iSOCOUNTRYCODEBTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BT.description")
    public String getISOCOUNTRYCODEBTDescription() {
        return iSOCOUNTRYCODEBTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BT.description")
    public void setISOCOUNTRYCODEBTDescription(String iSOCOUNTRYCODEBTDescription) {
        this.iSOCOUNTRYCODEBTDescription = iSOCOUNTRYCODEBTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BT.isEditable")
    public String getISOCOUNTRYCODEBTIsEditable() {
        return iSOCOUNTRYCODEBTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BT.isEditable")
    public void setISOCOUNTRYCODEBTIsEditable(String iSOCOUNTRYCODEBTIsEditable) {
        this.iSOCOUNTRYCODEBTIsEditable = iSOCOUNTRYCODEBTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BW.value")
    public String getISOCOUNTRYCODEBWValue() {
        return iSOCOUNTRYCODEBWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BW.value")
    public void setISOCOUNTRYCODEBWValue(String iSOCOUNTRYCODEBWValue) {
        this.iSOCOUNTRYCODEBWValue = iSOCOUNTRYCODEBWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BW.description")
    public String getISOCOUNTRYCODEBWDescription() {
        return iSOCOUNTRYCODEBWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BW.description")
    public void setISOCOUNTRYCODEBWDescription(String iSOCOUNTRYCODEBWDescription) {
        this.iSOCOUNTRYCODEBWDescription = iSOCOUNTRYCODEBWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BW.isEditable")
    public String getISOCOUNTRYCODEBWIsEditable() {
        return iSOCOUNTRYCODEBWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BW.isEditable")
    public void setISOCOUNTRYCODEBWIsEditable(String iSOCOUNTRYCODEBWIsEditable) {
        this.iSOCOUNTRYCODEBWIsEditable = iSOCOUNTRYCODEBWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BY.value")
    public String getISOCOUNTRYCODEBYValue() {
        return iSOCOUNTRYCODEBYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BY.value")
    public void setISOCOUNTRYCODEBYValue(String iSOCOUNTRYCODEBYValue) {
        this.iSOCOUNTRYCODEBYValue = iSOCOUNTRYCODEBYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BY.description")
    public String getISOCOUNTRYCODEBYDescription() {
        return iSOCOUNTRYCODEBYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BY.description")
    public void setISOCOUNTRYCODEBYDescription(String iSOCOUNTRYCODEBYDescription) {
        this.iSOCOUNTRYCODEBYDescription = iSOCOUNTRYCODEBYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BY.isEditable")
    public String getISOCOUNTRYCODEBYIsEditable() {
        return iSOCOUNTRYCODEBYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BY.isEditable")
    public void setISOCOUNTRYCODEBYIsEditable(String iSOCOUNTRYCODEBYIsEditable) {
        this.iSOCOUNTRYCODEBYIsEditable = iSOCOUNTRYCODEBYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BZ.value")
    public String getISOCOUNTRYCODEBZValue() {
        return iSOCOUNTRYCODEBZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BZ.value")
    public void setISOCOUNTRYCODEBZValue(String iSOCOUNTRYCODEBZValue) {
        this.iSOCOUNTRYCODEBZValue = iSOCOUNTRYCODEBZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.BZ.description")
    public String getISOCOUNTRYCODEBZDescription() {
        return iSOCOUNTRYCODEBZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BZ.description")
    public void setISOCOUNTRYCODEBZDescription(String iSOCOUNTRYCODEBZDescription) {
        this.iSOCOUNTRYCODEBZDescription = iSOCOUNTRYCODEBZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.BZ.isEditable")
    public String getISOCOUNTRYCODEBZIsEditable() {
        return iSOCOUNTRYCODEBZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.BZ.isEditable")
    public void setISOCOUNTRYCODEBZIsEditable(String iSOCOUNTRYCODEBZIsEditable) {
        this.iSOCOUNTRYCODEBZIsEditable = iSOCOUNTRYCODEBZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CC.value")
    public String getISOCOUNTRYCODECCValue() {
        return iSOCOUNTRYCODECCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CC.value")
    public void setISOCOUNTRYCODECCValue(String iSOCOUNTRYCODECCValue) {
        this.iSOCOUNTRYCODECCValue = iSOCOUNTRYCODECCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CC.description")
    public String getISOCOUNTRYCODECCDescription() {
        return iSOCOUNTRYCODECCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CC.description")
    public void setISOCOUNTRYCODECCDescription(String iSOCOUNTRYCODECCDescription) {
        this.iSOCOUNTRYCODECCDescription = iSOCOUNTRYCODECCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CC.isEditable")
    public String getISOCOUNTRYCODECCIsEditable() {
        return iSOCOUNTRYCODECCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CC.isEditable")
    public void setISOCOUNTRYCODECCIsEditable(String iSOCOUNTRYCODECCIsEditable) {
        this.iSOCOUNTRYCODECCIsEditable = iSOCOUNTRYCODECCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CD.value")
    public String getISOCOUNTRYCODECDValue() {
        return iSOCOUNTRYCODECDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CD.value")
    public void setISOCOUNTRYCODECDValue(String iSOCOUNTRYCODECDValue) {
        this.iSOCOUNTRYCODECDValue = iSOCOUNTRYCODECDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CD.description")
    public String getISOCOUNTRYCODECDDescription() {
        return iSOCOUNTRYCODECDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CD.description")
    public void setISOCOUNTRYCODECDDescription(String iSOCOUNTRYCODECDDescription) {
        this.iSOCOUNTRYCODECDDescription = iSOCOUNTRYCODECDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CD.isEditable")
    public String getISOCOUNTRYCODECDIsEditable() {
        return iSOCOUNTRYCODECDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CD.isEditable")
    public void setISOCOUNTRYCODECDIsEditable(String iSOCOUNTRYCODECDIsEditable) {
        this.iSOCOUNTRYCODECDIsEditable = iSOCOUNTRYCODECDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CF.value")
    public String getISOCOUNTRYCODECFValue() {
        return iSOCOUNTRYCODECFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CF.value")
    public void setISOCOUNTRYCODECFValue(String iSOCOUNTRYCODECFValue) {
        this.iSOCOUNTRYCODECFValue = iSOCOUNTRYCODECFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CF.description")
    public String getISOCOUNTRYCODECFDescription() {
        return iSOCOUNTRYCODECFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CF.description")
    public void setISOCOUNTRYCODECFDescription(String iSOCOUNTRYCODECFDescription) {
        this.iSOCOUNTRYCODECFDescription = iSOCOUNTRYCODECFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CF.isEditable")
    public String getISOCOUNTRYCODECFIsEditable() {
        return iSOCOUNTRYCODECFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CF.isEditable")
    public void setISOCOUNTRYCODECFIsEditable(String iSOCOUNTRYCODECFIsEditable) {
        this.iSOCOUNTRYCODECFIsEditable = iSOCOUNTRYCODECFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CG.value")
    public String getISOCOUNTRYCODECGValue() {
        return iSOCOUNTRYCODECGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CG.value")
    public void setISOCOUNTRYCODECGValue(String iSOCOUNTRYCODECGValue) {
        this.iSOCOUNTRYCODECGValue = iSOCOUNTRYCODECGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CG.description")
    public String getISOCOUNTRYCODECGDescription() {
        return iSOCOUNTRYCODECGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CG.description")
    public void setISOCOUNTRYCODECGDescription(String iSOCOUNTRYCODECGDescription) {
        this.iSOCOUNTRYCODECGDescription = iSOCOUNTRYCODECGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CG.isEditable")
    public String getISOCOUNTRYCODECGIsEditable() {
        return iSOCOUNTRYCODECGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CG.isEditable")
    public void setISOCOUNTRYCODECGIsEditable(String iSOCOUNTRYCODECGIsEditable) {
        this.iSOCOUNTRYCODECGIsEditable = iSOCOUNTRYCODECGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CI.value")
    public String getISOCOUNTRYCODECIValue() {
        return iSOCOUNTRYCODECIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CI.value")
    public void setISOCOUNTRYCODECIValue(String iSOCOUNTRYCODECIValue) {
        this.iSOCOUNTRYCODECIValue = iSOCOUNTRYCODECIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CI.description")
    public String getISOCOUNTRYCODECIDescription() {
        return iSOCOUNTRYCODECIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CI.description")
    public void setISOCOUNTRYCODECIDescription(String iSOCOUNTRYCODECIDescription) {
        this.iSOCOUNTRYCODECIDescription = iSOCOUNTRYCODECIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CI.isEditable")
    public String getISOCOUNTRYCODECIIsEditable() {
        return iSOCOUNTRYCODECIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CI.isEditable")
    public void setISOCOUNTRYCODECIIsEditable(String iSOCOUNTRYCODECIIsEditable) {
        this.iSOCOUNTRYCODECIIsEditable = iSOCOUNTRYCODECIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CK.value")
    public String getISOCOUNTRYCODECKValue() {
        return iSOCOUNTRYCODECKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CK.value")
    public void setISOCOUNTRYCODECKValue(String iSOCOUNTRYCODECKValue) {
        this.iSOCOUNTRYCODECKValue = iSOCOUNTRYCODECKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CK.description")
    public String getISOCOUNTRYCODECKDescription() {
        return iSOCOUNTRYCODECKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CK.description")
    public void setISOCOUNTRYCODECKDescription(String iSOCOUNTRYCODECKDescription) {
        this.iSOCOUNTRYCODECKDescription = iSOCOUNTRYCODECKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CK.isEditable")
    public String getISOCOUNTRYCODECKIsEditable() {
        return iSOCOUNTRYCODECKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CK.isEditable")
    public void setISOCOUNTRYCODECKIsEditable(String iSOCOUNTRYCODECKIsEditable) {
        this.iSOCOUNTRYCODECKIsEditable = iSOCOUNTRYCODECKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CL.value")
    public String getISOCOUNTRYCODECLValue() {
        return iSOCOUNTRYCODECLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CL.value")
    public void setISOCOUNTRYCODECLValue(String iSOCOUNTRYCODECLValue) {
        this.iSOCOUNTRYCODECLValue = iSOCOUNTRYCODECLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CL.description")
    public String getISOCOUNTRYCODECLDescription() {
        return iSOCOUNTRYCODECLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CL.description")
    public void setISOCOUNTRYCODECLDescription(String iSOCOUNTRYCODECLDescription) {
        this.iSOCOUNTRYCODECLDescription = iSOCOUNTRYCODECLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CL.isEditable")
    public String getISOCOUNTRYCODECLIsEditable() {
        return iSOCOUNTRYCODECLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CL.isEditable")
    public void setISOCOUNTRYCODECLIsEditable(String iSOCOUNTRYCODECLIsEditable) {
        this.iSOCOUNTRYCODECLIsEditable = iSOCOUNTRYCODECLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CM.value")
    public String getISOCOUNTRYCODECMValue() {
        return iSOCOUNTRYCODECMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CM.value")
    public void setISOCOUNTRYCODECMValue(String iSOCOUNTRYCODECMValue) {
        this.iSOCOUNTRYCODECMValue = iSOCOUNTRYCODECMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CM.description")
    public String getISOCOUNTRYCODECMDescription() {
        return iSOCOUNTRYCODECMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CM.description")
    public void setISOCOUNTRYCODECMDescription(String iSOCOUNTRYCODECMDescription) {
        this.iSOCOUNTRYCODECMDescription = iSOCOUNTRYCODECMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CM.isEditable")
    public String getISOCOUNTRYCODECMIsEditable() {
        return iSOCOUNTRYCODECMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CM.isEditable")
    public void setISOCOUNTRYCODECMIsEditable(String iSOCOUNTRYCODECMIsEditable) {
        this.iSOCOUNTRYCODECMIsEditable = iSOCOUNTRYCODECMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CN.value")
    public String getISOCOUNTRYCODECNValue() {
        return iSOCOUNTRYCODECNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CN.value")
    public void setISOCOUNTRYCODECNValue(String iSOCOUNTRYCODECNValue) {
        this.iSOCOUNTRYCODECNValue = iSOCOUNTRYCODECNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CN.description")
    public String getISOCOUNTRYCODECNDescription() {
        return iSOCOUNTRYCODECNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CN.description")
    public void setISOCOUNTRYCODECNDescription(String iSOCOUNTRYCODECNDescription) {
        this.iSOCOUNTRYCODECNDescription = iSOCOUNTRYCODECNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CN.isEditable")
    public String getISOCOUNTRYCODECNIsEditable() {
        return iSOCOUNTRYCODECNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CN.isEditable")
    public void setISOCOUNTRYCODECNIsEditable(String iSOCOUNTRYCODECNIsEditable) {
        this.iSOCOUNTRYCODECNIsEditable = iSOCOUNTRYCODECNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CR.value")
    public String getISOCOUNTRYCODECRValue() {
        return iSOCOUNTRYCODECRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CR.value")
    public void setISOCOUNTRYCODECRValue(String iSOCOUNTRYCODECRValue) {
        this.iSOCOUNTRYCODECRValue = iSOCOUNTRYCODECRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CR.description")
    public String getISOCOUNTRYCODECRDescription() {
        return iSOCOUNTRYCODECRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CR.description")
    public void setISOCOUNTRYCODECRDescription(String iSOCOUNTRYCODECRDescription) {
        this.iSOCOUNTRYCODECRDescription = iSOCOUNTRYCODECRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CR.isEditable")
    public String getISOCOUNTRYCODECRIsEditable() {
        return iSOCOUNTRYCODECRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CR.isEditable")
    public void setISOCOUNTRYCODECRIsEditable(String iSOCOUNTRYCODECRIsEditable) {
        this.iSOCOUNTRYCODECRIsEditable = iSOCOUNTRYCODECRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CU.value")
    public String getISOCOUNTRYCODECUValue() {
        return iSOCOUNTRYCODECUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CU.value")
    public void setISOCOUNTRYCODECUValue(String iSOCOUNTRYCODECUValue) {
        this.iSOCOUNTRYCODECUValue = iSOCOUNTRYCODECUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CU.description")
    public String getISOCOUNTRYCODECUDescription() {
        return iSOCOUNTRYCODECUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CU.description")
    public void setISOCOUNTRYCODECUDescription(String iSOCOUNTRYCODECUDescription) {
        this.iSOCOUNTRYCODECUDescription = iSOCOUNTRYCODECUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CU.isEditable")
    public String getISOCOUNTRYCODECUIsEditable() {
        return iSOCOUNTRYCODECUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CU.isEditable")
    public void setISOCOUNTRYCODECUIsEditable(String iSOCOUNTRYCODECUIsEditable) {
        this.iSOCOUNTRYCODECUIsEditable = iSOCOUNTRYCODECUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CV.value")
    public String getISOCOUNTRYCODECVValue() {
        return iSOCOUNTRYCODECVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CV.value")
    public void setISOCOUNTRYCODECVValue(String iSOCOUNTRYCODECVValue) {
        this.iSOCOUNTRYCODECVValue = iSOCOUNTRYCODECVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CV.description")
    public String getISOCOUNTRYCODECVDescription() {
        return iSOCOUNTRYCODECVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CV.description")
    public void setISOCOUNTRYCODECVDescription(String iSOCOUNTRYCODECVDescription) {
        this.iSOCOUNTRYCODECVDescription = iSOCOUNTRYCODECVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CV.isEditable")
    public String getISOCOUNTRYCODECVIsEditable() {
        return iSOCOUNTRYCODECVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CV.isEditable")
    public void setISOCOUNTRYCODECVIsEditable(String iSOCOUNTRYCODECVIsEditable) {
        this.iSOCOUNTRYCODECVIsEditable = iSOCOUNTRYCODECVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CZ.value")
    public String getISOCOUNTRYCODECZValue() {
        return iSOCOUNTRYCODECZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CZ.value")
    public void setISOCOUNTRYCODECZValue(String iSOCOUNTRYCODECZValue) {
        this.iSOCOUNTRYCODECZValue = iSOCOUNTRYCODECZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CZ.description")
    public String getISOCOUNTRYCODECZDescription() {
        return iSOCOUNTRYCODECZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CZ.description")
    public void setISOCOUNTRYCODECZDescription(String iSOCOUNTRYCODECZDescription) {
        this.iSOCOUNTRYCODECZDescription = iSOCOUNTRYCODECZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CZ.isEditable")
    public String getISOCOUNTRYCODECZIsEditable() {
        return iSOCOUNTRYCODECZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CZ.isEditable")
    public void setISOCOUNTRYCODECZIsEditable(String iSOCOUNTRYCODECZIsEditable) {
        this.iSOCOUNTRYCODECZIsEditable = iSOCOUNTRYCODECZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DE.value")
    public String getISOCOUNTRYCODEDEValue() {
        return iSOCOUNTRYCODEDEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DE.value")
    public void setISOCOUNTRYCODEDEValue(String iSOCOUNTRYCODEDEValue) {
        this.iSOCOUNTRYCODEDEValue = iSOCOUNTRYCODEDEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DE.description")
    public String getISOCOUNTRYCODEDEDescription() {
        return iSOCOUNTRYCODEDEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DE.description")
    public void setISOCOUNTRYCODEDEDescription(String iSOCOUNTRYCODEDEDescription) {
        this.iSOCOUNTRYCODEDEDescription = iSOCOUNTRYCODEDEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DE.isEditable")
    public String getISOCOUNTRYCODEDEIsEditable() {
        return iSOCOUNTRYCODEDEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DE.isEditable")
    public void setISOCOUNTRYCODEDEIsEditable(String iSOCOUNTRYCODEDEIsEditable) {
        this.iSOCOUNTRYCODEDEIsEditable = iSOCOUNTRYCODEDEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DK.value")
    public String getISOCOUNTRYCODEDKValue() {
        return iSOCOUNTRYCODEDKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DK.value")
    public void setISOCOUNTRYCODEDKValue(String iSOCOUNTRYCODEDKValue) {
        this.iSOCOUNTRYCODEDKValue = iSOCOUNTRYCODEDKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DK.description")
    public String getISOCOUNTRYCODEDKDescription() {
        return iSOCOUNTRYCODEDKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DK.description")
    public void setISOCOUNTRYCODEDKDescription(String iSOCOUNTRYCODEDKDescription) {
        this.iSOCOUNTRYCODEDKDescription = iSOCOUNTRYCODEDKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DK.isEditable")
    public String getISOCOUNTRYCODEDKIsEditable() {
        return iSOCOUNTRYCODEDKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DK.isEditable")
    public void setISOCOUNTRYCODEDKIsEditable(String iSOCOUNTRYCODEDKIsEditable) {
        this.iSOCOUNTRYCODEDKIsEditable = iSOCOUNTRYCODEDKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DM.value")
    public String getISOCOUNTRYCODEDMValue() {
        return iSOCOUNTRYCODEDMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DM.value")
    public void setISOCOUNTRYCODEDMValue(String iSOCOUNTRYCODEDMValue) {
        this.iSOCOUNTRYCODEDMValue = iSOCOUNTRYCODEDMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DM.description")
    public String getISOCOUNTRYCODEDMDescription() {
        return iSOCOUNTRYCODEDMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DM.description")
    public void setISOCOUNTRYCODEDMDescription(String iSOCOUNTRYCODEDMDescription) {
        this.iSOCOUNTRYCODEDMDescription = iSOCOUNTRYCODEDMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DM.isEditable")
    public String getISOCOUNTRYCODEDMIsEditable() {
        return iSOCOUNTRYCODEDMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DM.isEditable")
    public void setISOCOUNTRYCODEDMIsEditable(String iSOCOUNTRYCODEDMIsEditable) {
        this.iSOCOUNTRYCODEDMIsEditable = iSOCOUNTRYCODEDMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DZ.value")
    public String getISOCOUNTRYCODEDZValue() {
        return iSOCOUNTRYCODEDZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DZ.value")
    public void setISOCOUNTRYCODEDZValue(String iSOCOUNTRYCODEDZValue) {
        this.iSOCOUNTRYCODEDZValue = iSOCOUNTRYCODEDZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DZ.description")
    public String getISOCOUNTRYCODEDZDescription() {
        return iSOCOUNTRYCODEDZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DZ.description")
    public void setISOCOUNTRYCODEDZDescription(String iSOCOUNTRYCODEDZDescription) {
        this.iSOCOUNTRYCODEDZDescription = iSOCOUNTRYCODEDZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DZ.isEditable")
    public String getISOCOUNTRYCODEDZIsEditable() {
        return iSOCOUNTRYCODEDZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DZ.isEditable")
    public void setISOCOUNTRYCODEDZIsEditable(String iSOCOUNTRYCODEDZIsEditable) {
        this.iSOCOUNTRYCODEDZIsEditable = iSOCOUNTRYCODEDZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EC.value")
    public String getISOCOUNTRYCODEECValue() {
        return iSOCOUNTRYCODEECValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EC.value")
    public void setISOCOUNTRYCODEECValue(String iSOCOUNTRYCODEECValue) {
        this.iSOCOUNTRYCODEECValue = iSOCOUNTRYCODEECValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EC.description")
    public String getISOCOUNTRYCODEECDescription() {
        return iSOCOUNTRYCODEECDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EC.description")
    public void setISOCOUNTRYCODEECDescription(String iSOCOUNTRYCODEECDescription) {
        this.iSOCOUNTRYCODEECDescription = iSOCOUNTRYCODEECDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EC.isEditable")
    public String getISOCOUNTRYCODEECIsEditable() {
        return iSOCOUNTRYCODEECIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EC.isEditable")
    public void setISOCOUNTRYCODEECIsEditable(String iSOCOUNTRYCODEECIsEditable) {
        this.iSOCOUNTRYCODEECIsEditable = iSOCOUNTRYCODEECIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ES.value")
    public String getISOCOUNTRYCODEESValue() {
        return iSOCOUNTRYCODEESValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ES.value")
    public void setISOCOUNTRYCODEESValue(String iSOCOUNTRYCODEESValue) {
        this.iSOCOUNTRYCODEESValue = iSOCOUNTRYCODEESValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ES.description")
    public String getISOCOUNTRYCODEESDescription() {
        return iSOCOUNTRYCODEESDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ES.description")
    public void setISOCOUNTRYCODEESDescription(String iSOCOUNTRYCODEESDescription) {
        this.iSOCOUNTRYCODEESDescription = iSOCOUNTRYCODEESDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ES.isEditable")
    public String getISOCOUNTRYCODEESIsEditable() {
        return iSOCOUNTRYCODEESIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ES.isEditable")
    public void setISOCOUNTRYCODEESIsEditable(String iSOCOUNTRYCODEESIsEditable) {
        this.iSOCOUNTRYCODEESIsEditable = iSOCOUNTRYCODEESIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ET.value")
    public String getISOCOUNTRYCODEETValue() {
        return iSOCOUNTRYCODEETValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ET.value")
    public void setISOCOUNTRYCODEETValue(String iSOCOUNTRYCODEETValue) {
        this.iSOCOUNTRYCODEETValue = iSOCOUNTRYCODEETValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ET.description")
    public String getISOCOUNTRYCODEETDescription() {
        return iSOCOUNTRYCODEETDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ET.description")
    public void setISOCOUNTRYCODEETDescription(String iSOCOUNTRYCODEETDescription) {
        this.iSOCOUNTRYCODEETDescription = iSOCOUNTRYCODEETDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ET.isEditable")
    public String getISOCOUNTRYCODEETIsEditable() {
        return iSOCOUNTRYCODEETIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ET.isEditable")
    public void setISOCOUNTRYCODEETIsEditable(String iSOCOUNTRYCODEETIsEditable) {
        this.iSOCOUNTRYCODEETIsEditable = iSOCOUNTRYCODEETIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FJ.value")
    public String getISOCOUNTRYCODEFJValue() {
        return iSOCOUNTRYCODEFJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FJ.value")
    public void setISOCOUNTRYCODEFJValue(String iSOCOUNTRYCODEFJValue) {
        this.iSOCOUNTRYCODEFJValue = iSOCOUNTRYCODEFJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FJ.description")
    public String getISOCOUNTRYCODEFJDescription() {
        return iSOCOUNTRYCODEFJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FJ.description")
    public void setISOCOUNTRYCODEFJDescription(String iSOCOUNTRYCODEFJDescription) {
        this.iSOCOUNTRYCODEFJDescription = iSOCOUNTRYCODEFJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FJ.isEditable")
    public String getISOCOUNTRYCODEFJIsEditable() {
        return iSOCOUNTRYCODEFJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FJ.isEditable")
    public void setISOCOUNTRYCODEFJIsEditable(String iSOCOUNTRYCODEFJIsEditable) {
        this.iSOCOUNTRYCODEFJIsEditable = iSOCOUNTRYCODEFJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FK.value")
    public String getISOCOUNTRYCODEFKValue() {
        return iSOCOUNTRYCODEFKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FK.value")
    public void setISOCOUNTRYCODEFKValue(String iSOCOUNTRYCODEFKValue) {
        this.iSOCOUNTRYCODEFKValue = iSOCOUNTRYCODEFKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FK.description")
    public String getISOCOUNTRYCODEFKDescription() {
        return iSOCOUNTRYCODEFKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FK.description")
    public void setISOCOUNTRYCODEFKDescription(String iSOCOUNTRYCODEFKDescription) {
        this.iSOCOUNTRYCODEFKDescription = iSOCOUNTRYCODEFKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FK.isEditable")
    public String getISOCOUNTRYCODEFKIsEditable() {
        return iSOCOUNTRYCODEFKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FK.isEditable")
    public void setISOCOUNTRYCODEFKIsEditable(String iSOCOUNTRYCODEFKIsEditable) {
        this.iSOCOUNTRYCODEFKIsEditable = iSOCOUNTRYCODEFKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FO.value")
    public String getISOCOUNTRYCODEFOValue() {
        return iSOCOUNTRYCODEFOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FO.value")
    public void setISOCOUNTRYCODEFOValue(String iSOCOUNTRYCODEFOValue) {
        this.iSOCOUNTRYCODEFOValue = iSOCOUNTRYCODEFOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FO.description")
    public String getISOCOUNTRYCODEFODescription() {
        return iSOCOUNTRYCODEFODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FO.description")
    public void setISOCOUNTRYCODEFODescription(String iSOCOUNTRYCODEFODescription) {
        this.iSOCOUNTRYCODEFODescription = iSOCOUNTRYCODEFODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FO.isEditable")
    public String getISOCOUNTRYCODEFOIsEditable() {
        return iSOCOUNTRYCODEFOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FO.isEditable")
    public void setISOCOUNTRYCODEFOIsEditable(String iSOCOUNTRYCODEFOIsEditable) {
        this.iSOCOUNTRYCODEFOIsEditable = iSOCOUNTRYCODEFOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FR.value")
    public String getISOCOUNTRYCODEFRValue() {
        return iSOCOUNTRYCODEFRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FR.value")
    public void setISOCOUNTRYCODEFRValue(String iSOCOUNTRYCODEFRValue) {
        this.iSOCOUNTRYCODEFRValue = iSOCOUNTRYCODEFRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FR.description")
    public String getISOCOUNTRYCODEFRDescription() {
        return iSOCOUNTRYCODEFRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FR.description")
    public void setISOCOUNTRYCODEFRDescription(String iSOCOUNTRYCODEFRDescription) {
        this.iSOCOUNTRYCODEFRDescription = iSOCOUNTRYCODEFRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FR.isEditable")
    public String getISOCOUNTRYCODEFRIsEditable() {
        return iSOCOUNTRYCODEFRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FR.isEditable")
    public void setISOCOUNTRYCODEFRIsEditable(String iSOCOUNTRYCODEFRIsEditable) {
        this.iSOCOUNTRYCODEFRIsEditable = iSOCOUNTRYCODEFRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GA.value")
    public String getISOCOUNTRYCODEGAValue() {
        return iSOCOUNTRYCODEGAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GA.value")
    public void setISOCOUNTRYCODEGAValue(String iSOCOUNTRYCODEGAValue) {
        this.iSOCOUNTRYCODEGAValue = iSOCOUNTRYCODEGAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GA.description")
    public String getISOCOUNTRYCODEGADescription() {
        return iSOCOUNTRYCODEGADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GA.description")
    public void setISOCOUNTRYCODEGADescription(String iSOCOUNTRYCODEGADescription) {
        this.iSOCOUNTRYCODEGADescription = iSOCOUNTRYCODEGADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GA.isEditable")
    public String getISOCOUNTRYCODEGAIsEditable() {
        return iSOCOUNTRYCODEGAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GA.isEditable")
    public void setISOCOUNTRYCODEGAIsEditable(String iSOCOUNTRYCODEGAIsEditable) {
        this.iSOCOUNTRYCODEGAIsEditable = iSOCOUNTRYCODEGAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GD.value")
    public String getISOCOUNTRYCODEGDValue() {
        return iSOCOUNTRYCODEGDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GD.value")
    public void setISOCOUNTRYCODEGDValue(String iSOCOUNTRYCODEGDValue) {
        this.iSOCOUNTRYCODEGDValue = iSOCOUNTRYCODEGDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GD.description")
    public String getISOCOUNTRYCODEGDDescription() {
        return iSOCOUNTRYCODEGDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GD.description")
    public void setISOCOUNTRYCODEGDDescription(String iSOCOUNTRYCODEGDDescription) {
        this.iSOCOUNTRYCODEGDDescription = iSOCOUNTRYCODEGDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GD.isEditable")
    public String getISOCOUNTRYCODEGDIsEditable() {
        return iSOCOUNTRYCODEGDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GD.isEditable")
    public void setISOCOUNTRYCODEGDIsEditable(String iSOCOUNTRYCODEGDIsEditable) {
        this.iSOCOUNTRYCODEGDIsEditable = iSOCOUNTRYCODEGDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GH.value")
    public String getISOCOUNTRYCODEGHValue() {
        return iSOCOUNTRYCODEGHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GH.value")
    public void setISOCOUNTRYCODEGHValue(String iSOCOUNTRYCODEGHValue) {
        this.iSOCOUNTRYCODEGHValue = iSOCOUNTRYCODEGHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GH.description")
    public String getISOCOUNTRYCODEGHDescription() {
        return iSOCOUNTRYCODEGHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GH.description")
    public void setISOCOUNTRYCODEGHDescription(String iSOCOUNTRYCODEGHDescription) {
        this.iSOCOUNTRYCODEGHDescription = iSOCOUNTRYCODEGHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GH.isEditable")
    public String getISOCOUNTRYCODEGHIsEditable() {
        return iSOCOUNTRYCODEGHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GH.isEditable")
    public void setISOCOUNTRYCODEGHIsEditable(String iSOCOUNTRYCODEGHIsEditable) {
        this.iSOCOUNTRYCODEGHIsEditable = iSOCOUNTRYCODEGHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GL.value")
    public String getISOCOUNTRYCODEGLValue() {
        return iSOCOUNTRYCODEGLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GL.value")
    public void setISOCOUNTRYCODEGLValue(String iSOCOUNTRYCODEGLValue) {
        this.iSOCOUNTRYCODEGLValue = iSOCOUNTRYCODEGLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GL.description")
    public String getISOCOUNTRYCODEGLDescription() {
        return iSOCOUNTRYCODEGLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GL.description")
    public void setISOCOUNTRYCODEGLDescription(String iSOCOUNTRYCODEGLDescription) {
        this.iSOCOUNTRYCODEGLDescription = iSOCOUNTRYCODEGLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GL.isEditable")
    public String getISOCOUNTRYCODEGLIsEditable() {
        return iSOCOUNTRYCODEGLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GL.isEditable")
    public void setISOCOUNTRYCODEGLIsEditable(String iSOCOUNTRYCODEGLIsEditable) {
        this.iSOCOUNTRYCODEGLIsEditable = iSOCOUNTRYCODEGLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GM.value")
    public String getISOCOUNTRYCODEGMValue() {
        return iSOCOUNTRYCODEGMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GM.value")
    public void setISOCOUNTRYCODEGMValue(String iSOCOUNTRYCODEGMValue) {
        this.iSOCOUNTRYCODEGMValue = iSOCOUNTRYCODEGMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GM.description")
    public String getISOCOUNTRYCODEGMDescription() {
        return iSOCOUNTRYCODEGMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GM.description")
    public void setISOCOUNTRYCODEGMDescription(String iSOCOUNTRYCODEGMDescription) {
        this.iSOCOUNTRYCODEGMDescription = iSOCOUNTRYCODEGMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GM.isEditable")
    public String getISOCOUNTRYCODEGMIsEditable() {
        return iSOCOUNTRYCODEGMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GM.isEditable")
    public void setISOCOUNTRYCODEGMIsEditable(String iSOCOUNTRYCODEGMIsEditable) {
        this.iSOCOUNTRYCODEGMIsEditable = iSOCOUNTRYCODEGMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GP.value")
    public String getISOCOUNTRYCODEGPValue() {
        return iSOCOUNTRYCODEGPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GP.value")
    public void setISOCOUNTRYCODEGPValue(String iSOCOUNTRYCODEGPValue) {
        this.iSOCOUNTRYCODEGPValue = iSOCOUNTRYCODEGPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GP.description")
    public String getISOCOUNTRYCODEGPDescription() {
        return iSOCOUNTRYCODEGPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GP.description")
    public void setISOCOUNTRYCODEGPDescription(String iSOCOUNTRYCODEGPDescription) {
        this.iSOCOUNTRYCODEGPDescription = iSOCOUNTRYCODEGPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GP.isEditable")
    public String getISOCOUNTRYCODEGPIsEditable() {
        return iSOCOUNTRYCODEGPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GP.isEditable")
    public void setISOCOUNTRYCODEGPIsEditable(String iSOCOUNTRYCODEGPIsEditable) {
        this.iSOCOUNTRYCODEGPIsEditable = iSOCOUNTRYCODEGPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GR.value")
    public String getISOCOUNTRYCODEGRValue() {
        return iSOCOUNTRYCODEGRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GR.value")
    public void setISOCOUNTRYCODEGRValue(String iSOCOUNTRYCODEGRValue) {
        this.iSOCOUNTRYCODEGRValue = iSOCOUNTRYCODEGRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GR.description")
    public String getISOCOUNTRYCODEGRDescription() {
        return iSOCOUNTRYCODEGRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GR.description")
    public void setISOCOUNTRYCODEGRDescription(String iSOCOUNTRYCODEGRDescription) {
        this.iSOCOUNTRYCODEGRDescription = iSOCOUNTRYCODEGRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GR.isEditable")
    public String getISOCOUNTRYCODEGRIsEditable() {
        return iSOCOUNTRYCODEGRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GR.isEditable")
    public void setISOCOUNTRYCODEGRIsEditable(String iSOCOUNTRYCODEGRIsEditable) {
        this.iSOCOUNTRYCODEGRIsEditable = iSOCOUNTRYCODEGRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GS.value")
    public String getISOCOUNTRYCODEGSValue() {
        return iSOCOUNTRYCODEGSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GS.value")
    public void setISOCOUNTRYCODEGSValue(String iSOCOUNTRYCODEGSValue) {
        this.iSOCOUNTRYCODEGSValue = iSOCOUNTRYCODEGSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GS.description")
    public String getISOCOUNTRYCODEGSDescription() {
        return iSOCOUNTRYCODEGSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GS.description")
    public void setISOCOUNTRYCODEGSDescription(String iSOCOUNTRYCODEGSDescription) {
        this.iSOCOUNTRYCODEGSDescription = iSOCOUNTRYCODEGSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GS.isEditable")
    public String getISOCOUNTRYCODEGSIsEditable() {
        return iSOCOUNTRYCODEGSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GS.isEditable")
    public void setISOCOUNTRYCODEGSIsEditable(String iSOCOUNTRYCODEGSIsEditable) {
        this.iSOCOUNTRYCODEGSIsEditable = iSOCOUNTRYCODEGSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GT.value")
    public String getISOCOUNTRYCODEGTValue() {
        return iSOCOUNTRYCODEGTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GT.value")
    public void setISOCOUNTRYCODEGTValue(String iSOCOUNTRYCODEGTValue) {
        this.iSOCOUNTRYCODEGTValue = iSOCOUNTRYCODEGTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GT.description")
    public String getISOCOUNTRYCODEGTDescription() {
        return iSOCOUNTRYCODEGTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GT.description")
    public void setISOCOUNTRYCODEGTDescription(String iSOCOUNTRYCODEGTDescription) {
        this.iSOCOUNTRYCODEGTDescription = iSOCOUNTRYCODEGTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GT.isEditable")
    public String getISOCOUNTRYCODEGTIsEditable() {
        return iSOCOUNTRYCODEGTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GT.isEditable")
    public void setISOCOUNTRYCODEGTIsEditable(String iSOCOUNTRYCODEGTIsEditable) {
        this.iSOCOUNTRYCODEGTIsEditable = iSOCOUNTRYCODEGTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GW.value")
    public String getISOCOUNTRYCODEGWValue() {
        return iSOCOUNTRYCODEGWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GW.value")
    public void setISOCOUNTRYCODEGWValue(String iSOCOUNTRYCODEGWValue) {
        this.iSOCOUNTRYCODEGWValue = iSOCOUNTRYCODEGWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GW.description")
    public String getISOCOUNTRYCODEGWDescription() {
        return iSOCOUNTRYCODEGWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GW.description")
    public void setISOCOUNTRYCODEGWDescription(String iSOCOUNTRYCODEGWDescription) {
        this.iSOCOUNTRYCODEGWDescription = iSOCOUNTRYCODEGWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GW.isEditable")
    public String getISOCOUNTRYCODEGWIsEditable() {
        return iSOCOUNTRYCODEGWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GW.isEditable")
    public void setISOCOUNTRYCODEGWIsEditable(String iSOCOUNTRYCODEGWIsEditable) {
        this.iSOCOUNTRYCODEGWIsEditable = iSOCOUNTRYCODEGWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HM.value")
    public String getISOCOUNTRYCODEHMValue() {
        return iSOCOUNTRYCODEHMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HM.value")
    public void setISOCOUNTRYCODEHMValue(String iSOCOUNTRYCODEHMValue) {
        this.iSOCOUNTRYCODEHMValue = iSOCOUNTRYCODEHMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HM.description")
    public String getISOCOUNTRYCODEHMDescription() {
        return iSOCOUNTRYCODEHMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HM.description")
    public void setISOCOUNTRYCODEHMDescription(String iSOCOUNTRYCODEHMDescription) {
        this.iSOCOUNTRYCODEHMDescription = iSOCOUNTRYCODEHMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HM.isEditable")
    public String getISOCOUNTRYCODEHMIsEditable() {
        return iSOCOUNTRYCODEHMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HM.isEditable")
    public void setISOCOUNTRYCODEHMIsEditable(String iSOCOUNTRYCODEHMIsEditable) {
        this.iSOCOUNTRYCODEHMIsEditable = iSOCOUNTRYCODEHMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HT.value")
    public String getISOCOUNTRYCODEHTValue() {
        return iSOCOUNTRYCODEHTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HT.value")
    public void setISOCOUNTRYCODEHTValue(String iSOCOUNTRYCODEHTValue) {
        this.iSOCOUNTRYCODEHTValue = iSOCOUNTRYCODEHTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HT.description")
    public String getISOCOUNTRYCODEHTDescription() {
        return iSOCOUNTRYCODEHTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HT.description")
    public void setISOCOUNTRYCODEHTDescription(String iSOCOUNTRYCODEHTDescription) {
        this.iSOCOUNTRYCODEHTDescription = iSOCOUNTRYCODEHTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HT.isEditable")
    public String getISOCOUNTRYCODEHTIsEditable() {
        return iSOCOUNTRYCODEHTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HT.isEditable")
    public void setISOCOUNTRYCODEHTIsEditable(String iSOCOUNTRYCODEHTIsEditable) {
        this.iSOCOUNTRYCODEHTIsEditable = iSOCOUNTRYCODEHTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ID.value")
    public String getISOCOUNTRYCODEIDValue() {
        return iSOCOUNTRYCODEIDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ID.value")
    public void setISOCOUNTRYCODEIDValue(String iSOCOUNTRYCODEIDValue) {
        this.iSOCOUNTRYCODEIDValue = iSOCOUNTRYCODEIDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ID.description")
    public String getISOCOUNTRYCODEIDDescription() {
        return iSOCOUNTRYCODEIDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ID.description")
    public void setISOCOUNTRYCODEIDDescription(String iSOCOUNTRYCODEIDDescription) {
        this.iSOCOUNTRYCODEIDDescription = iSOCOUNTRYCODEIDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ID.isEditable")
    public String getISOCOUNTRYCODEIDIsEditable() {
        return iSOCOUNTRYCODEIDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ID.isEditable")
    public void setISOCOUNTRYCODEIDIsEditable(String iSOCOUNTRYCODEIDIsEditable) {
        this.iSOCOUNTRYCODEIDIsEditable = iSOCOUNTRYCODEIDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IL.value")
    public String getISOCOUNTRYCODEILValue() {
        return iSOCOUNTRYCODEILValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IL.value")
    public void setISOCOUNTRYCODEILValue(String iSOCOUNTRYCODEILValue) {
        this.iSOCOUNTRYCODEILValue = iSOCOUNTRYCODEILValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IL.description")
    public String getISOCOUNTRYCODEILDescription() {
        return iSOCOUNTRYCODEILDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IL.description")
    public void setISOCOUNTRYCODEILDescription(String iSOCOUNTRYCODEILDescription) {
        this.iSOCOUNTRYCODEILDescription = iSOCOUNTRYCODEILDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IL.isEditable")
    public String getISOCOUNTRYCODEILIsEditable() {
        return iSOCOUNTRYCODEILIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IL.isEditable")
    public void setISOCOUNTRYCODEILIsEditable(String iSOCOUNTRYCODEILIsEditable) {
        this.iSOCOUNTRYCODEILIsEditable = iSOCOUNTRYCODEILIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IM.value")
    public String getISOCOUNTRYCODEIMValue() {
        return iSOCOUNTRYCODEIMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IM.value")
    public void setISOCOUNTRYCODEIMValue(String iSOCOUNTRYCODEIMValue) {
        this.iSOCOUNTRYCODEIMValue = iSOCOUNTRYCODEIMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IM.description")
    public String getISOCOUNTRYCODEIMDescription() {
        return iSOCOUNTRYCODEIMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IM.description")
    public void setISOCOUNTRYCODEIMDescription(String iSOCOUNTRYCODEIMDescription) {
        this.iSOCOUNTRYCODEIMDescription = iSOCOUNTRYCODEIMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IM.isEditable")
    public String getISOCOUNTRYCODEIMIsEditable() {
        return iSOCOUNTRYCODEIMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IM.isEditable")
    public void setISOCOUNTRYCODEIMIsEditable(String iSOCOUNTRYCODEIMIsEditable) {
        this.iSOCOUNTRYCODEIMIsEditable = iSOCOUNTRYCODEIMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IO.value")
    public String getISOCOUNTRYCODEIOValue() {
        return iSOCOUNTRYCODEIOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IO.value")
    public void setISOCOUNTRYCODEIOValue(String iSOCOUNTRYCODEIOValue) {
        this.iSOCOUNTRYCODEIOValue = iSOCOUNTRYCODEIOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IO.description")
    public String getISOCOUNTRYCODEIODescription() {
        return iSOCOUNTRYCODEIODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IO.description")
    public void setISOCOUNTRYCODEIODescription(String iSOCOUNTRYCODEIODescription) {
        this.iSOCOUNTRYCODEIODescription = iSOCOUNTRYCODEIODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IO.isEditable")
    public String getISOCOUNTRYCODEIOIsEditable() {
        return iSOCOUNTRYCODEIOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IO.isEditable")
    public void setISOCOUNTRYCODEIOIsEditable(String iSOCOUNTRYCODEIOIsEditable) {
        this.iSOCOUNTRYCODEIOIsEditable = iSOCOUNTRYCODEIOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IQ.value")
    public String getISOCOUNTRYCODEIQValue() {
        return iSOCOUNTRYCODEIQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IQ.value")
    public void setISOCOUNTRYCODEIQValue(String iSOCOUNTRYCODEIQValue) {
        this.iSOCOUNTRYCODEIQValue = iSOCOUNTRYCODEIQValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IQ.description")
    public String getISOCOUNTRYCODEIQDescription() {
        return iSOCOUNTRYCODEIQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IQ.description")
    public void setISOCOUNTRYCODEIQDescription(String iSOCOUNTRYCODEIQDescription) {
        this.iSOCOUNTRYCODEIQDescription = iSOCOUNTRYCODEIQDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IQ.isEditable")
    public String getISOCOUNTRYCODEIQIsEditable() {
        return iSOCOUNTRYCODEIQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IQ.isEditable")
    public void setISOCOUNTRYCODEIQIsEditable(String iSOCOUNTRYCODEIQIsEditable) {
        this.iSOCOUNTRYCODEIQIsEditable = iSOCOUNTRYCODEIQIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IT.value")
    public String getISOCOUNTRYCODEITValue() {
        return iSOCOUNTRYCODEITValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IT.value")
    public void setISOCOUNTRYCODEITValue(String iSOCOUNTRYCODEITValue) {
        this.iSOCOUNTRYCODEITValue = iSOCOUNTRYCODEITValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IT.description")
    public String getISOCOUNTRYCODEITDescription() {
        return iSOCOUNTRYCODEITDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IT.description")
    public void setISOCOUNTRYCODEITDescription(String iSOCOUNTRYCODEITDescription) {
        this.iSOCOUNTRYCODEITDescription = iSOCOUNTRYCODEITDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IT.isEditable")
    public String getISOCOUNTRYCODEITIsEditable() {
        return iSOCOUNTRYCODEITIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IT.isEditable")
    public void setISOCOUNTRYCODEITIsEditable(String iSOCOUNTRYCODEITIsEditable) {
        this.iSOCOUNTRYCODEITIsEditable = iSOCOUNTRYCODEITIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JM.value")
    public String getISOCOUNTRYCODEJMValue() {
        return iSOCOUNTRYCODEJMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JM.value")
    public void setISOCOUNTRYCODEJMValue(String iSOCOUNTRYCODEJMValue) {
        this.iSOCOUNTRYCODEJMValue = iSOCOUNTRYCODEJMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JM.description")
    public String getISOCOUNTRYCODEJMDescription() {
        return iSOCOUNTRYCODEJMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JM.description")
    public void setISOCOUNTRYCODEJMDescription(String iSOCOUNTRYCODEJMDescription) {
        this.iSOCOUNTRYCODEJMDescription = iSOCOUNTRYCODEJMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JM.isEditable")
    public String getISOCOUNTRYCODEJMIsEditable() {
        return iSOCOUNTRYCODEJMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JM.isEditable")
    public void setISOCOUNTRYCODEJMIsEditable(String iSOCOUNTRYCODEJMIsEditable) {
        this.iSOCOUNTRYCODEJMIsEditable = iSOCOUNTRYCODEJMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JO.value")
    public String getISOCOUNTRYCODEJOValue() {
        return iSOCOUNTRYCODEJOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JO.value")
    public void setISOCOUNTRYCODEJOValue(String iSOCOUNTRYCODEJOValue) {
        this.iSOCOUNTRYCODEJOValue = iSOCOUNTRYCODEJOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JO.description")
    public String getISOCOUNTRYCODEJODescription() {
        return iSOCOUNTRYCODEJODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JO.description")
    public void setISOCOUNTRYCODEJODescription(String iSOCOUNTRYCODEJODescription) {
        this.iSOCOUNTRYCODEJODescription = iSOCOUNTRYCODEJODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JO.isEditable")
    public String getISOCOUNTRYCODEJOIsEditable() {
        return iSOCOUNTRYCODEJOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JO.isEditable")
    public void setISOCOUNTRYCODEJOIsEditable(String iSOCOUNTRYCODEJOIsEditable) {
        this.iSOCOUNTRYCODEJOIsEditable = iSOCOUNTRYCODEJOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KG.value")
    public String getISOCOUNTRYCODEKGValue() {
        return iSOCOUNTRYCODEKGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KG.value")
    public void setISOCOUNTRYCODEKGValue(String iSOCOUNTRYCODEKGValue) {
        this.iSOCOUNTRYCODEKGValue = iSOCOUNTRYCODEKGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KG.description")
    public String getISOCOUNTRYCODEKGDescription() {
        return iSOCOUNTRYCODEKGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KG.description")
    public void setISOCOUNTRYCODEKGDescription(String iSOCOUNTRYCODEKGDescription) {
        this.iSOCOUNTRYCODEKGDescription = iSOCOUNTRYCODEKGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KG.isEditable")
    public String getISOCOUNTRYCODEKGIsEditable() {
        return iSOCOUNTRYCODEKGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KG.isEditable")
    public void setISOCOUNTRYCODEKGIsEditable(String iSOCOUNTRYCODEKGIsEditable) {
        this.iSOCOUNTRYCODEKGIsEditable = iSOCOUNTRYCODEKGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KI.value")
    public String getISOCOUNTRYCODEKIValue() {
        return iSOCOUNTRYCODEKIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KI.value")
    public void setISOCOUNTRYCODEKIValue(String iSOCOUNTRYCODEKIValue) {
        this.iSOCOUNTRYCODEKIValue = iSOCOUNTRYCODEKIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KI.description")
    public String getISOCOUNTRYCODEKIDescription() {
        return iSOCOUNTRYCODEKIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KI.description")
    public void setISOCOUNTRYCODEKIDescription(String iSOCOUNTRYCODEKIDescription) {
        this.iSOCOUNTRYCODEKIDescription = iSOCOUNTRYCODEKIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KI.isEditable")
    public String getISOCOUNTRYCODEKIIsEditable() {
        return iSOCOUNTRYCODEKIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KI.isEditable")
    public void setISOCOUNTRYCODEKIIsEditable(String iSOCOUNTRYCODEKIIsEditable) {
        this.iSOCOUNTRYCODEKIIsEditable = iSOCOUNTRYCODEKIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KN.value")
    public String getISOCOUNTRYCODEKNValue() {
        return iSOCOUNTRYCODEKNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KN.value")
    public void setISOCOUNTRYCODEKNValue(String iSOCOUNTRYCODEKNValue) {
        this.iSOCOUNTRYCODEKNValue = iSOCOUNTRYCODEKNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KN.description")
    public String getISOCOUNTRYCODEKNDescription() {
        return iSOCOUNTRYCODEKNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KN.description")
    public void setISOCOUNTRYCODEKNDescription(String iSOCOUNTRYCODEKNDescription) {
        this.iSOCOUNTRYCODEKNDescription = iSOCOUNTRYCODEKNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KN.isEditable")
    public String getISOCOUNTRYCODEKNIsEditable() {
        return iSOCOUNTRYCODEKNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KN.isEditable")
    public void setISOCOUNTRYCODEKNIsEditable(String iSOCOUNTRYCODEKNIsEditable) {
        this.iSOCOUNTRYCODEKNIsEditable = iSOCOUNTRYCODEKNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KP.value")
    public String getISOCOUNTRYCODEKPValue() {
        return iSOCOUNTRYCODEKPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KP.value")
    public void setISOCOUNTRYCODEKPValue(String iSOCOUNTRYCODEKPValue) {
        this.iSOCOUNTRYCODEKPValue = iSOCOUNTRYCODEKPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KP.description")
    public String getISOCOUNTRYCODEKPDescription() {
        return iSOCOUNTRYCODEKPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KP.description")
    public void setISOCOUNTRYCODEKPDescription(String iSOCOUNTRYCODEKPDescription) {
        this.iSOCOUNTRYCODEKPDescription = iSOCOUNTRYCODEKPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KP.isEditable")
    public String getISOCOUNTRYCODEKPIsEditable() {
        return iSOCOUNTRYCODEKPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KP.isEditable")
    public void setISOCOUNTRYCODEKPIsEditable(String iSOCOUNTRYCODEKPIsEditable) {
        this.iSOCOUNTRYCODEKPIsEditable = iSOCOUNTRYCODEKPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KY.value")
    public String getISOCOUNTRYCODEKYValue() {
        return iSOCOUNTRYCODEKYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KY.value")
    public void setISOCOUNTRYCODEKYValue(String iSOCOUNTRYCODEKYValue) {
        this.iSOCOUNTRYCODEKYValue = iSOCOUNTRYCODEKYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KY.description")
    public String getISOCOUNTRYCODEKYDescription() {
        return iSOCOUNTRYCODEKYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KY.description")
    public void setISOCOUNTRYCODEKYDescription(String iSOCOUNTRYCODEKYDescription) {
        this.iSOCOUNTRYCODEKYDescription = iSOCOUNTRYCODEKYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KY.isEditable")
    public String getISOCOUNTRYCODEKYIsEditable() {
        return iSOCOUNTRYCODEKYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KY.isEditable")
    public void setISOCOUNTRYCODEKYIsEditable(String iSOCOUNTRYCODEKYIsEditable) {
        this.iSOCOUNTRYCODEKYIsEditable = iSOCOUNTRYCODEKYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KZ.value")
    public String getISOCOUNTRYCODEKZValue() {
        return iSOCOUNTRYCODEKZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KZ.value")
    public void setISOCOUNTRYCODEKZValue(String iSOCOUNTRYCODEKZValue) {
        this.iSOCOUNTRYCODEKZValue = iSOCOUNTRYCODEKZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KZ.description")
    public String getISOCOUNTRYCODEKZDescription() {
        return iSOCOUNTRYCODEKZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KZ.description")
    public void setISOCOUNTRYCODEKZDescription(String iSOCOUNTRYCODEKZDescription) {
        this.iSOCOUNTRYCODEKZDescription = iSOCOUNTRYCODEKZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KZ.isEditable")
    public String getISOCOUNTRYCODEKZIsEditable() {
        return iSOCOUNTRYCODEKZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KZ.isEditable")
    public void setISOCOUNTRYCODEKZIsEditable(String iSOCOUNTRYCODEKZIsEditable) {
        this.iSOCOUNTRYCODEKZIsEditable = iSOCOUNTRYCODEKZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LB.value")
    public String getISOCOUNTRYCODELBValue() {
        return iSOCOUNTRYCODELBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LB.value")
    public void setISOCOUNTRYCODELBValue(String iSOCOUNTRYCODELBValue) {
        this.iSOCOUNTRYCODELBValue = iSOCOUNTRYCODELBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LB.description")
    public String getISOCOUNTRYCODELBDescription() {
        return iSOCOUNTRYCODELBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LB.description")
    public void setISOCOUNTRYCODELBDescription(String iSOCOUNTRYCODELBDescription) {
        this.iSOCOUNTRYCODELBDescription = iSOCOUNTRYCODELBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LB.isEditable")
    public String getISOCOUNTRYCODELBIsEditable() {
        return iSOCOUNTRYCODELBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LB.isEditable")
    public void setISOCOUNTRYCODELBIsEditable(String iSOCOUNTRYCODELBIsEditable) {
        this.iSOCOUNTRYCODELBIsEditable = iSOCOUNTRYCODELBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LC.value")
    public String getISOCOUNTRYCODELCValue() {
        return iSOCOUNTRYCODELCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LC.value")
    public void setISOCOUNTRYCODELCValue(String iSOCOUNTRYCODELCValue) {
        this.iSOCOUNTRYCODELCValue = iSOCOUNTRYCODELCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LC.description")
    public String getISOCOUNTRYCODELCDescription() {
        return iSOCOUNTRYCODELCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LC.description")
    public void setISOCOUNTRYCODELCDescription(String iSOCOUNTRYCODELCDescription) {
        this.iSOCOUNTRYCODELCDescription = iSOCOUNTRYCODELCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LC.isEditable")
    public String getISOCOUNTRYCODELCIsEditable() {
        return iSOCOUNTRYCODELCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LC.isEditable")
    public void setISOCOUNTRYCODELCIsEditable(String iSOCOUNTRYCODELCIsEditable) {
        this.iSOCOUNTRYCODELCIsEditable = iSOCOUNTRYCODELCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LR.value")
    public String getISOCOUNTRYCODELRValue() {
        return iSOCOUNTRYCODELRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LR.value")
    public void setISOCOUNTRYCODELRValue(String iSOCOUNTRYCODELRValue) {
        this.iSOCOUNTRYCODELRValue = iSOCOUNTRYCODELRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LR.description")
    public String getISOCOUNTRYCODELRDescription() {
        return iSOCOUNTRYCODELRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LR.description")
    public void setISOCOUNTRYCODELRDescription(String iSOCOUNTRYCODELRDescription) {
        this.iSOCOUNTRYCODELRDescription = iSOCOUNTRYCODELRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LR.isEditable")
    public String getISOCOUNTRYCODELRIsEditable() {
        return iSOCOUNTRYCODELRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LR.isEditable")
    public void setISOCOUNTRYCODELRIsEditable(String iSOCOUNTRYCODELRIsEditable) {
        this.iSOCOUNTRYCODELRIsEditable = iSOCOUNTRYCODELRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LS.value")
    public String getISOCOUNTRYCODELSValue() {
        return iSOCOUNTRYCODELSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LS.value")
    public void setISOCOUNTRYCODELSValue(String iSOCOUNTRYCODELSValue) {
        this.iSOCOUNTRYCODELSValue = iSOCOUNTRYCODELSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LS.description")
    public String getISOCOUNTRYCODELSDescription() {
        return iSOCOUNTRYCODELSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LS.description")
    public void setISOCOUNTRYCODELSDescription(String iSOCOUNTRYCODELSDescription) {
        this.iSOCOUNTRYCODELSDescription = iSOCOUNTRYCODELSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LS.isEditable")
    public String getISOCOUNTRYCODELSIsEditable() {
        return iSOCOUNTRYCODELSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LS.isEditable")
    public void setISOCOUNTRYCODELSIsEditable(String iSOCOUNTRYCODELSIsEditable) {
        this.iSOCOUNTRYCODELSIsEditable = iSOCOUNTRYCODELSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LV.value")
    public String getISOCOUNTRYCODELVValue() {
        return iSOCOUNTRYCODELVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LV.value")
    public void setISOCOUNTRYCODELVValue(String iSOCOUNTRYCODELVValue) {
        this.iSOCOUNTRYCODELVValue = iSOCOUNTRYCODELVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.LV.description")
    public String getISOCOUNTRYCODELVDescription() {
        return iSOCOUNTRYCODELVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LV.description")
    public void setISOCOUNTRYCODELVDescription(String iSOCOUNTRYCODELVDescription) {
        this.iSOCOUNTRYCODELVDescription = iSOCOUNTRYCODELVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.LV.isEditable")
    public String getISOCOUNTRYCODELVIsEditable() {
        return iSOCOUNTRYCODELVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.LV.isEditable")
    public void setISOCOUNTRYCODELVIsEditable(String iSOCOUNTRYCODELVIsEditable) {
        this.iSOCOUNTRYCODELVIsEditable = iSOCOUNTRYCODELVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MA.value")
    public String getISOCOUNTRYCODEMAValue() {
        return iSOCOUNTRYCODEMAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MA.value")
    public void setISOCOUNTRYCODEMAValue(String iSOCOUNTRYCODEMAValue) {
        this.iSOCOUNTRYCODEMAValue = iSOCOUNTRYCODEMAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MA.description")
    public String getISOCOUNTRYCODEMADescription() {
        return iSOCOUNTRYCODEMADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MA.description")
    public void setISOCOUNTRYCODEMADescription(String iSOCOUNTRYCODEMADescription) {
        this.iSOCOUNTRYCODEMADescription = iSOCOUNTRYCODEMADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MA.isEditable")
    public String getISOCOUNTRYCODEMAIsEditable() {
        return iSOCOUNTRYCODEMAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MA.isEditable")
    public void setISOCOUNTRYCODEMAIsEditable(String iSOCOUNTRYCODEMAIsEditable) {
        this.iSOCOUNTRYCODEMAIsEditable = iSOCOUNTRYCODEMAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MD.value")
    public String getISOCOUNTRYCODEMDValue() {
        return iSOCOUNTRYCODEMDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MD.value")
    public void setISOCOUNTRYCODEMDValue(String iSOCOUNTRYCODEMDValue) {
        this.iSOCOUNTRYCODEMDValue = iSOCOUNTRYCODEMDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MD.description")
    public String getISOCOUNTRYCODEMDDescription() {
        return iSOCOUNTRYCODEMDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MD.description")
    public void setISOCOUNTRYCODEMDDescription(String iSOCOUNTRYCODEMDDescription) {
        this.iSOCOUNTRYCODEMDDescription = iSOCOUNTRYCODEMDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MD.isEditable")
    public String getISOCOUNTRYCODEMDIsEditable() {
        return iSOCOUNTRYCODEMDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MD.isEditable")
    public void setISOCOUNTRYCODEMDIsEditable(String iSOCOUNTRYCODEMDIsEditable) {
        this.iSOCOUNTRYCODEMDIsEditable = iSOCOUNTRYCODEMDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MG.value")
    public String getISOCOUNTRYCODEMGValue() {
        return iSOCOUNTRYCODEMGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MG.value")
    public void setISOCOUNTRYCODEMGValue(String iSOCOUNTRYCODEMGValue) {
        this.iSOCOUNTRYCODEMGValue = iSOCOUNTRYCODEMGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MG.description")
    public String getISOCOUNTRYCODEMGDescription() {
        return iSOCOUNTRYCODEMGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MG.description")
    public void setISOCOUNTRYCODEMGDescription(String iSOCOUNTRYCODEMGDescription) {
        this.iSOCOUNTRYCODEMGDescription = iSOCOUNTRYCODEMGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MG.isEditable")
    public String getISOCOUNTRYCODEMGIsEditable() {
        return iSOCOUNTRYCODEMGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MG.isEditable")
    public void setISOCOUNTRYCODEMGIsEditable(String iSOCOUNTRYCODEMGIsEditable) {
        this.iSOCOUNTRYCODEMGIsEditable = iSOCOUNTRYCODEMGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MK.value")
    public String getISOCOUNTRYCODEMKValue() {
        return iSOCOUNTRYCODEMKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MK.value")
    public void setISOCOUNTRYCODEMKValue(String iSOCOUNTRYCODEMKValue) {
        this.iSOCOUNTRYCODEMKValue = iSOCOUNTRYCODEMKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MK.description")
    public String getISOCOUNTRYCODEMKDescription() {
        return iSOCOUNTRYCODEMKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MK.description")
    public void setISOCOUNTRYCODEMKDescription(String iSOCOUNTRYCODEMKDescription) {
        this.iSOCOUNTRYCODEMKDescription = iSOCOUNTRYCODEMKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MK.isEditable")
    public String getISOCOUNTRYCODEMKIsEditable() {
        return iSOCOUNTRYCODEMKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MK.isEditable")
    public void setISOCOUNTRYCODEMKIsEditable(String iSOCOUNTRYCODEMKIsEditable) {
        this.iSOCOUNTRYCODEMKIsEditable = iSOCOUNTRYCODEMKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ML.value")
    public String getISOCOUNTRYCODEMLValue() {
        return iSOCOUNTRYCODEMLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ML.value")
    public void setISOCOUNTRYCODEMLValue(String iSOCOUNTRYCODEMLValue) {
        this.iSOCOUNTRYCODEMLValue = iSOCOUNTRYCODEMLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ML.description")
    public String getISOCOUNTRYCODEMLDescription() {
        return iSOCOUNTRYCODEMLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ML.description")
    public void setISOCOUNTRYCODEMLDescription(String iSOCOUNTRYCODEMLDescription) {
        this.iSOCOUNTRYCODEMLDescription = iSOCOUNTRYCODEMLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ML.isEditable")
    public String getISOCOUNTRYCODEMLIsEditable() {
        return iSOCOUNTRYCODEMLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ML.isEditable")
    public void setISOCOUNTRYCODEMLIsEditable(String iSOCOUNTRYCODEMLIsEditable) {
        this.iSOCOUNTRYCODEMLIsEditable = iSOCOUNTRYCODEMLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MN.value")
    public String getISOCOUNTRYCODEMNValue() {
        return iSOCOUNTRYCODEMNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MN.value")
    public void setISOCOUNTRYCODEMNValue(String iSOCOUNTRYCODEMNValue) {
        this.iSOCOUNTRYCODEMNValue = iSOCOUNTRYCODEMNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MN.description")
    public String getISOCOUNTRYCODEMNDescription() {
        return iSOCOUNTRYCODEMNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MN.description")
    public void setISOCOUNTRYCODEMNDescription(String iSOCOUNTRYCODEMNDescription) {
        this.iSOCOUNTRYCODEMNDescription = iSOCOUNTRYCODEMNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MN.isEditable")
    public String getISOCOUNTRYCODEMNIsEditable() {
        return iSOCOUNTRYCODEMNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MN.isEditable")
    public void setISOCOUNTRYCODEMNIsEditable(String iSOCOUNTRYCODEMNIsEditable) {
        this.iSOCOUNTRYCODEMNIsEditable = iSOCOUNTRYCODEMNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MO.value")
    public String getISOCOUNTRYCODEMOValue() {
        return iSOCOUNTRYCODEMOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MO.value")
    public void setISOCOUNTRYCODEMOValue(String iSOCOUNTRYCODEMOValue) {
        this.iSOCOUNTRYCODEMOValue = iSOCOUNTRYCODEMOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MO.description")
    public String getISOCOUNTRYCODEMODescription() {
        return iSOCOUNTRYCODEMODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MO.description")
    public void setISOCOUNTRYCODEMODescription(String iSOCOUNTRYCODEMODescription) {
        this.iSOCOUNTRYCODEMODescription = iSOCOUNTRYCODEMODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MO.isEditable")
    public String getISOCOUNTRYCODEMOIsEditable() {
        return iSOCOUNTRYCODEMOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MO.isEditable")
    public void setISOCOUNTRYCODEMOIsEditable(String iSOCOUNTRYCODEMOIsEditable) {
        this.iSOCOUNTRYCODEMOIsEditable = iSOCOUNTRYCODEMOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MT.value")
    public String getISOCOUNTRYCODEMTValue() {
        return iSOCOUNTRYCODEMTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MT.value")
    public void setISOCOUNTRYCODEMTValue(String iSOCOUNTRYCODEMTValue) {
        this.iSOCOUNTRYCODEMTValue = iSOCOUNTRYCODEMTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MT.description")
    public String getISOCOUNTRYCODEMTDescription() {
        return iSOCOUNTRYCODEMTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MT.description")
    public void setISOCOUNTRYCODEMTDescription(String iSOCOUNTRYCODEMTDescription) {
        this.iSOCOUNTRYCODEMTDescription = iSOCOUNTRYCODEMTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MT.isEditable")
    public String getISOCOUNTRYCODEMTIsEditable() {
        return iSOCOUNTRYCODEMTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MT.isEditable")
    public void setISOCOUNTRYCODEMTIsEditable(String iSOCOUNTRYCODEMTIsEditable) {
        this.iSOCOUNTRYCODEMTIsEditable = iSOCOUNTRYCODEMTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MU.value")
    public String getISOCOUNTRYCODEMUValue() {
        return iSOCOUNTRYCODEMUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MU.value")
    public void setISOCOUNTRYCODEMUValue(String iSOCOUNTRYCODEMUValue) {
        this.iSOCOUNTRYCODEMUValue = iSOCOUNTRYCODEMUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MU.description")
    public String getISOCOUNTRYCODEMUDescription() {
        return iSOCOUNTRYCODEMUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MU.description")
    public void setISOCOUNTRYCODEMUDescription(String iSOCOUNTRYCODEMUDescription) {
        this.iSOCOUNTRYCODEMUDescription = iSOCOUNTRYCODEMUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MU.isEditable")
    public String getISOCOUNTRYCODEMUIsEditable() {
        return iSOCOUNTRYCODEMUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MU.isEditable")
    public void setISOCOUNTRYCODEMUIsEditable(String iSOCOUNTRYCODEMUIsEditable) {
        this.iSOCOUNTRYCODEMUIsEditable = iSOCOUNTRYCODEMUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MW.value")
    public String getISOCOUNTRYCODEMWValue() {
        return iSOCOUNTRYCODEMWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MW.value")
    public void setISOCOUNTRYCODEMWValue(String iSOCOUNTRYCODEMWValue) {
        this.iSOCOUNTRYCODEMWValue = iSOCOUNTRYCODEMWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MW.description")
    public String getISOCOUNTRYCODEMWDescription() {
        return iSOCOUNTRYCODEMWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MW.description")
    public void setISOCOUNTRYCODEMWDescription(String iSOCOUNTRYCODEMWDescription) {
        this.iSOCOUNTRYCODEMWDescription = iSOCOUNTRYCODEMWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MW.isEditable")
    public String getISOCOUNTRYCODEMWIsEditable() {
        return iSOCOUNTRYCODEMWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MW.isEditable")
    public void setISOCOUNTRYCODEMWIsEditable(String iSOCOUNTRYCODEMWIsEditable) {
        this.iSOCOUNTRYCODEMWIsEditable = iSOCOUNTRYCODEMWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MX.value")
    public String getISOCOUNTRYCODEMXValue() {
        return iSOCOUNTRYCODEMXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MX.value")
    public void setISOCOUNTRYCODEMXValue(String iSOCOUNTRYCODEMXValue) {
        this.iSOCOUNTRYCODEMXValue = iSOCOUNTRYCODEMXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MX.description")
    public String getISOCOUNTRYCODEMXDescription() {
        return iSOCOUNTRYCODEMXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MX.description")
    public void setISOCOUNTRYCODEMXDescription(String iSOCOUNTRYCODEMXDescription) {
        this.iSOCOUNTRYCODEMXDescription = iSOCOUNTRYCODEMXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MX.isEditable")
    public String getISOCOUNTRYCODEMXIsEditable() {
        return iSOCOUNTRYCODEMXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MX.isEditable")
    public void setISOCOUNTRYCODEMXIsEditable(String iSOCOUNTRYCODEMXIsEditable) {
        this.iSOCOUNTRYCODEMXIsEditable = iSOCOUNTRYCODEMXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MY.value")
    public String getISOCOUNTRYCODEMYValue() {
        return iSOCOUNTRYCODEMYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MY.value")
    public void setISOCOUNTRYCODEMYValue(String iSOCOUNTRYCODEMYValue) {
        this.iSOCOUNTRYCODEMYValue = iSOCOUNTRYCODEMYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MY.description")
    public String getISOCOUNTRYCODEMYDescription() {
        return iSOCOUNTRYCODEMYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MY.description")
    public void setISOCOUNTRYCODEMYDescription(String iSOCOUNTRYCODEMYDescription) {
        this.iSOCOUNTRYCODEMYDescription = iSOCOUNTRYCODEMYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MY.isEditable")
    public String getISOCOUNTRYCODEMYIsEditable() {
        return iSOCOUNTRYCODEMYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MY.isEditable")
    public void setISOCOUNTRYCODEMYIsEditable(String iSOCOUNTRYCODEMYIsEditable) {
        this.iSOCOUNTRYCODEMYIsEditable = iSOCOUNTRYCODEMYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MZ.value")
    public String getISOCOUNTRYCODEMZValue() {
        return iSOCOUNTRYCODEMZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MZ.value")
    public void setISOCOUNTRYCODEMZValue(String iSOCOUNTRYCODEMZValue) {
        this.iSOCOUNTRYCODEMZValue = iSOCOUNTRYCODEMZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.MZ.description")
    public String getISOCOUNTRYCODEMZDescription() {
        return iSOCOUNTRYCODEMZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MZ.description")
    public void setISOCOUNTRYCODEMZDescription(String iSOCOUNTRYCODEMZDescription) {
        this.iSOCOUNTRYCODEMZDescription = iSOCOUNTRYCODEMZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.MZ.isEditable")
    public String getISOCOUNTRYCODEMZIsEditable() {
        return iSOCOUNTRYCODEMZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.MZ.isEditable")
    public void setISOCOUNTRYCODEMZIsEditable(String iSOCOUNTRYCODEMZIsEditable) {
        this.iSOCOUNTRYCODEMZIsEditable = iSOCOUNTRYCODEMZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NA.value")
    public String getISOCOUNTRYCODENAValue() {
        return iSOCOUNTRYCODENAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NA.value")
    public void setISOCOUNTRYCODENAValue(String iSOCOUNTRYCODENAValue) {
        this.iSOCOUNTRYCODENAValue = iSOCOUNTRYCODENAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NA.description")
    public String getISOCOUNTRYCODENADescription() {
        return iSOCOUNTRYCODENADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NA.description")
    public void setISOCOUNTRYCODENADescription(String iSOCOUNTRYCODENADescription) {
        this.iSOCOUNTRYCODENADescription = iSOCOUNTRYCODENADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NA.isEditable")
    public String getISOCOUNTRYCODENAIsEditable() {
        return iSOCOUNTRYCODENAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NA.isEditable")
    public void setISOCOUNTRYCODENAIsEditable(String iSOCOUNTRYCODENAIsEditable) {
        this.iSOCOUNTRYCODENAIsEditable = iSOCOUNTRYCODENAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NC.value")
    public String getISOCOUNTRYCODENCValue() {
        return iSOCOUNTRYCODENCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NC.value")
    public void setISOCOUNTRYCODENCValue(String iSOCOUNTRYCODENCValue) {
        this.iSOCOUNTRYCODENCValue = iSOCOUNTRYCODENCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NC.description")
    public String getISOCOUNTRYCODENCDescription() {
        return iSOCOUNTRYCODENCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NC.description")
    public void setISOCOUNTRYCODENCDescription(String iSOCOUNTRYCODENCDescription) {
        this.iSOCOUNTRYCODENCDescription = iSOCOUNTRYCODENCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NC.isEditable")
    public String getISOCOUNTRYCODENCIsEditable() {
        return iSOCOUNTRYCODENCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NC.isEditable")
    public void setISOCOUNTRYCODENCIsEditable(String iSOCOUNTRYCODENCIsEditable) {
        this.iSOCOUNTRYCODENCIsEditable = iSOCOUNTRYCODENCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NE.value")
    public String getISOCOUNTRYCODENEValue() {
        return iSOCOUNTRYCODENEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NE.value")
    public void setISOCOUNTRYCODENEValue(String iSOCOUNTRYCODENEValue) {
        this.iSOCOUNTRYCODENEValue = iSOCOUNTRYCODENEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NE.description")
    public String getISOCOUNTRYCODENEDescription() {
        return iSOCOUNTRYCODENEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NE.description")
    public void setISOCOUNTRYCODENEDescription(String iSOCOUNTRYCODENEDescription) {
        this.iSOCOUNTRYCODENEDescription = iSOCOUNTRYCODENEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NE.isEditable")
    public String getISOCOUNTRYCODENEIsEditable() {
        return iSOCOUNTRYCODENEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NE.isEditable")
    public void setISOCOUNTRYCODENEIsEditable(String iSOCOUNTRYCODENEIsEditable) {
        this.iSOCOUNTRYCODENEIsEditable = iSOCOUNTRYCODENEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NF.value")
    public String getISOCOUNTRYCODENFValue() {
        return iSOCOUNTRYCODENFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NF.value")
    public void setISOCOUNTRYCODENFValue(String iSOCOUNTRYCODENFValue) {
        this.iSOCOUNTRYCODENFValue = iSOCOUNTRYCODENFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NF.description")
    public String getISOCOUNTRYCODENFDescription() {
        return iSOCOUNTRYCODENFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NF.description")
    public void setISOCOUNTRYCODENFDescription(String iSOCOUNTRYCODENFDescription) {
        this.iSOCOUNTRYCODENFDescription = iSOCOUNTRYCODENFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NF.isEditable")
    public String getISOCOUNTRYCODENFIsEditable() {
        return iSOCOUNTRYCODENFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NF.isEditable")
    public void setISOCOUNTRYCODENFIsEditable(String iSOCOUNTRYCODENFIsEditable) {
        this.iSOCOUNTRYCODENFIsEditable = iSOCOUNTRYCODENFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NI.value")
    public String getISOCOUNTRYCODENIValue() {
        return iSOCOUNTRYCODENIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NI.value")
    public void setISOCOUNTRYCODENIValue(String iSOCOUNTRYCODENIValue) {
        this.iSOCOUNTRYCODENIValue = iSOCOUNTRYCODENIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NI.description")
    public String getISOCOUNTRYCODENIDescription() {
        return iSOCOUNTRYCODENIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NI.description")
    public void setISOCOUNTRYCODENIDescription(String iSOCOUNTRYCODENIDescription) {
        this.iSOCOUNTRYCODENIDescription = iSOCOUNTRYCODENIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NI.isEditable")
    public String getISOCOUNTRYCODENIIsEditable() {
        return iSOCOUNTRYCODENIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NI.isEditable")
    public void setISOCOUNTRYCODENIIsEditable(String iSOCOUNTRYCODENIIsEditable) {
        this.iSOCOUNTRYCODENIIsEditable = iSOCOUNTRYCODENIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NL.value")
    public String getISOCOUNTRYCODENLValue() {
        return iSOCOUNTRYCODENLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NL.value")
    public void setISOCOUNTRYCODENLValue(String iSOCOUNTRYCODENLValue) {
        this.iSOCOUNTRYCODENLValue = iSOCOUNTRYCODENLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NL.description")
    public String getISOCOUNTRYCODENLDescription() {
        return iSOCOUNTRYCODENLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NL.description")
    public void setISOCOUNTRYCODENLDescription(String iSOCOUNTRYCODENLDescription) {
        this.iSOCOUNTRYCODENLDescription = iSOCOUNTRYCODENLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NL.isEditable")
    public String getISOCOUNTRYCODENLIsEditable() {
        return iSOCOUNTRYCODENLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NL.isEditable")
    public void setISOCOUNTRYCODENLIsEditable(String iSOCOUNTRYCODENLIsEditable) {
        this.iSOCOUNTRYCODENLIsEditable = iSOCOUNTRYCODENLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NO.value")
    public String getISOCOUNTRYCODENOValue() {
        return iSOCOUNTRYCODENOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NO.value")
    public void setISOCOUNTRYCODENOValue(String iSOCOUNTRYCODENOValue) {
        this.iSOCOUNTRYCODENOValue = iSOCOUNTRYCODENOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NO.description")
    public String getISOCOUNTRYCODENODescription() {
        return iSOCOUNTRYCODENODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NO.description")
    public void setISOCOUNTRYCODENODescription(String iSOCOUNTRYCODENODescription) {
        this.iSOCOUNTRYCODENODescription = iSOCOUNTRYCODENODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NO.isEditable")
    public String getISOCOUNTRYCODENOIsEditable() {
        return iSOCOUNTRYCODENOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NO.isEditable")
    public void setISOCOUNTRYCODENOIsEditable(String iSOCOUNTRYCODENOIsEditable) {
        this.iSOCOUNTRYCODENOIsEditable = iSOCOUNTRYCODENOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NP.value")
    public String getISOCOUNTRYCODENPValue() {
        return iSOCOUNTRYCODENPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NP.value")
    public void setISOCOUNTRYCODENPValue(String iSOCOUNTRYCODENPValue) {
        this.iSOCOUNTRYCODENPValue = iSOCOUNTRYCODENPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NP.description")
    public String getISOCOUNTRYCODENPDescription() {
        return iSOCOUNTRYCODENPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NP.description")
    public void setISOCOUNTRYCODENPDescription(String iSOCOUNTRYCODENPDescription) {
        this.iSOCOUNTRYCODENPDescription = iSOCOUNTRYCODENPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NP.isEditable")
    public String getISOCOUNTRYCODENPIsEditable() {
        return iSOCOUNTRYCODENPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NP.isEditable")
    public void setISOCOUNTRYCODENPIsEditable(String iSOCOUNTRYCODENPIsEditable) {
        this.iSOCOUNTRYCODENPIsEditable = iSOCOUNTRYCODENPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NR.value")
    public String getISOCOUNTRYCODENRValue() {
        return iSOCOUNTRYCODENRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NR.value")
    public void setISOCOUNTRYCODENRValue(String iSOCOUNTRYCODENRValue) {
        this.iSOCOUNTRYCODENRValue = iSOCOUNTRYCODENRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NR.description")
    public String getISOCOUNTRYCODENRDescription() {
        return iSOCOUNTRYCODENRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NR.description")
    public void setISOCOUNTRYCODENRDescription(String iSOCOUNTRYCODENRDescription) {
        this.iSOCOUNTRYCODENRDescription = iSOCOUNTRYCODENRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NR.isEditable")
    public String getISOCOUNTRYCODENRIsEditable() {
        return iSOCOUNTRYCODENRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NR.isEditable")
    public void setISOCOUNTRYCODENRIsEditable(String iSOCOUNTRYCODENRIsEditable) {
        this.iSOCOUNTRYCODENRIsEditable = iSOCOUNTRYCODENRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NZ.value")
    public String getISOCOUNTRYCODENZValue() {
        return iSOCOUNTRYCODENZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NZ.value")
    public void setISOCOUNTRYCODENZValue(String iSOCOUNTRYCODENZValue) {
        this.iSOCOUNTRYCODENZValue = iSOCOUNTRYCODENZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.NZ.description")
    public String getISOCOUNTRYCODENZDescription() {
        return iSOCOUNTRYCODENZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NZ.description")
    public void setISOCOUNTRYCODENZDescription(String iSOCOUNTRYCODENZDescription) {
        this.iSOCOUNTRYCODENZDescription = iSOCOUNTRYCODENZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.NZ.isEditable")
    public String getISOCOUNTRYCODENZIsEditable() {
        return iSOCOUNTRYCODENZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.NZ.isEditable")
    public void setISOCOUNTRYCODENZIsEditable(String iSOCOUNTRYCODENZIsEditable) {
        this.iSOCOUNTRYCODENZIsEditable = iSOCOUNTRYCODENZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.OM.value")
    public String getISOCOUNTRYCODEOMValue() {
        return iSOCOUNTRYCODEOMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.OM.value")
    public void setISOCOUNTRYCODEOMValue(String iSOCOUNTRYCODEOMValue) {
        this.iSOCOUNTRYCODEOMValue = iSOCOUNTRYCODEOMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.OM.description")
    public String getISOCOUNTRYCODEOMDescription() {
        return iSOCOUNTRYCODEOMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.OM.description")
    public void setISOCOUNTRYCODEOMDescription(String iSOCOUNTRYCODEOMDescription) {
        this.iSOCOUNTRYCODEOMDescription = iSOCOUNTRYCODEOMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.OM.isEditable")
    public String getISOCOUNTRYCODEOMIsEditable() {
        return iSOCOUNTRYCODEOMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.OM.isEditable")
    public void setISOCOUNTRYCODEOMIsEditable(String iSOCOUNTRYCODEOMIsEditable) {
        this.iSOCOUNTRYCODEOMIsEditable = iSOCOUNTRYCODEOMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PA.value")
    public String getISOCOUNTRYCODEPAValue() {
        return iSOCOUNTRYCODEPAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PA.value")
    public void setISOCOUNTRYCODEPAValue(String iSOCOUNTRYCODEPAValue) {
        this.iSOCOUNTRYCODEPAValue = iSOCOUNTRYCODEPAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PA.description")
    public String getISOCOUNTRYCODEPADescription() {
        return iSOCOUNTRYCODEPADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PA.description")
    public void setISOCOUNTRYCODEPADescription(String iSOCOUNTRYCODEPADescription) {
        this.iSOCOUNTRYCODEPADescription = iSOCOUNTRYCODEPADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PA.isEditable")
    public String getISOCOUNTRYCODEPAIsEditable() {
        return iSOCOUNTRYCODEPAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PA.isEditable")
    public void setISOCOUNTRYCODEPAIsEditable(String iSOCOUNTRYCODEPAIsEditable) {
        this.iSOCOUNTRYCODEPAIsEditable = iSOCOUNTRYCODEPAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PF.value")
    public String getISOCOUNTRYCODEPFValue() {
        return iSOCOUNTRYCODEPFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PF.value")
    public void setISOCOUNTRYCODEPFValue(String iSOCOUNTRYCODEPFValue) {
        this.iSOCOUNTRYCODEPFValue = iSOCOUNTRYCODEPFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PF.description")
    public String getISOCOUNTRYCODEPFDescription() {
        return iSOCOUNTRYCODEPFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PF.description")
    public void setISOCOUNTRYCODEPFDescription(String iSOCOUNTRYCODEPFDescription) {
        this.iSOCOUNTRYCODEPFDescription = iSOCOUNTRYCODEPFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PF.isEditable")
    public String getISOCOUNTRYCODEPFIsEditable() {
        return iSOCOUNTRYCODEPFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PF.isEditable")
    public void setISOCOUNTRYCODEPFIsEditable(String iSOCOUNTRYCODEPFIsEditable) {
        this.iSOCOUNTRYCODEPFIsEditable = iSOCOUNTRYCODEPFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PG.value")
    public String getISOCOUNTRYCODEPGValue() {
        return iSOCOUNTRYCODEPGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PG.value")
    public void setISOCOUNTRYCODEPGValue(String iSOCOUNTRYCODEPGValue) {
        this.iSOCOUNTRYCODEPGValue = iSOCOUNTRYCODEPGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PG.description")
    public String getISOCOUNTRYCODEPGDescription() {
        return iSOCOUNTRYCODEPGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PG.description")
    public void setISOCOUNTRYCODEPGDescription(String iSOCOUNTRYCODEPGDescription) {
        this.iSOCOUNTRYCODEPGDescription = iSOCOUNTRYCODEPGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PG.isEditable")
    public String getISOCOUNTRYCODEPGIsEditable() {
        return iSOCOUNTRYCODEPGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PG.isEditable")
    public void setISOCOUNTRYCODEPGIsEditable(String iSOCOUNTRYCODEPGIsEditable) {
        this.iSOCOUNTRYCODEPGIsEditable = iSOCOUNTRYCODEPGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PH.value")
    public String getISOCOUNTRYCODEPHValue() {
        return iSOCOUNTRYCODEPHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PH.value")
    public void setISOCOUNTRYCODEPHValue(String iSOCOUNTRYCODEPHValue) {
        this.iSOCOUNTRYCODEPHValue = iSOCOUNTRYCODEPHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PH.description")
    public String getISOCOUNTRYCODEPHDescription() {
        return iSOCOUNTRYCODEPHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PH.description")
    public void setISOCOUNTRYCODEPHDescription(String iSOCOUNTRYCODEPHDescription) {
        this.iSOCOUNTRYCODEPHDescription = iSOCOUNTRYCODEPHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PH.isEditable")
    public String getISOCOUNTRYCODEPHIsEditable() {
        return iSOCOUNTRYCODEPHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PH.isEditable")
    public void setISOCOUNTRYCODEPHIsEditable(String iSOCOUNTRYCODEPHIsEditable) {
        this.iSOCOUNTRYCODEPHIsEditable = iSOCOUNTRYCODEPHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PK.value")
    public String getISOCOUNTRYCODEPKValue() {
        return iSOCOUNTRYCODEPKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PK.value")
    public void setISOCOUNTRYCODEPKValue(String iSOCOUNTRYCODEPKValue) {
        this.iSOCOUNTRYCODEPKValue = iSOCOUNTRYCODEPKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PK.description")
    public String getISOCOUNTRYCODEPKDescription() {
        return iSOCOUNTRYCODEPKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PK.description")
    public void setISOCOUNTRYCODEPKDescription(String iSOCOUNTRYCODEPKDescription) {
        this.iSOCOUNTRYCODEPKDescription = iSOCOUNTRYCODEPKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PK.isEditable")
    public String getISOCOUNTRYCODEPKIsEditable() {
        return iSOCOUNTRYCODEPKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PK.isEditable")
    public void setISOCOUNTRYCODEPKIsEditable(String iSOCOUNTRYCODEPKIsEditable) {
        this.iSOCOUNTRYCODEPKIsEditable = iSOCOUNTRYCODEPKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PL.value")
    public String getISOCOUNTRYCODEPLValue() {
        return iSOCOUNTRYCODEPLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PL.value")
    public void setISOCOUNTRYCODEPLValue(String iSOCOUNTRYCODEPLValue) {
        this.iSOCOUNTRYCODEPLValue = iSOCOUNTRYCODEPLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PL.description")
    public String getISOCOUNTRYCODEPLDescription() {
        return iSOCOUNTRYCODEPLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PL.description")
    public void setISOCOUNTRYCODEPLDescription(String iSOCOUNTRYCODEPLDescription) {
        this.iSOCOUNTRYCODEPLDescription = iSOCOUNTRYCODEPLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PL.isEditable")
    public String getISOCOUNTRYCODEPLIsEditable() {
        return iSOCOUNTRYCODEPLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PL.isEditable")
    public void setISOCOUNTRYCODEPLIsEditable(String iSOCOUNTRYCODEPLIsEditable) {
        this.iSOCOUNTRYCODEPLIsEditable = iSOCOUNTRYCODEPLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PN.value")
    public String getISOCOUNTRYCODEPNValue() {
        return iSOCOUNTRYCODEPNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PN.value")
    public void setISOCOUNTRYCODEPNValue(String iSOCOUNTRYCODEPNValue) {
        this.iSOCOUNTRYCODEPNValue = iSOCOUNTRYCODEPNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PN.description")
    public String getISOCOUNTRYCODEPNDescription() {
        return iSOCOUNTRYCODEPNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PN.description")
    public void setISOCOUNTRYCODEPNDescription(String iSOCOUNTRYCODEPNDescription) {
        this.iSOCOUNTRYCODEPNDescription = iSOCOUNTRYCODEPNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PN.isEditable")
    public String getISOCOUNTRYCODEPNIsEditable() {
        return iSOCOUNTRYCODEPNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PN.isEditable")
    public void setISOCOUNTRYCODEPNIsEditable(String iSOCOUNTRYCODEPNIsEditable) {
        this.iSOCOUNTRYCODEPNIsEditable = iSOCOUNTRYCODEPNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PS.value")
    public String getISOCOUNTRYCODEPSValue() {
        return iSOCOUNTRYCODEPSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PS.value")
    public void setISOCOUNTRYCODEPSValue(String iSOCOUNTRYCODEPSValue) {
        this.iSOCOUNTRYCODEPSValue = iSOCOUNTRYCODEPSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PS.description")
    public String getISOCOUNTRYCODEPSDescription() {
        return iSOCOUNTRYCODEPSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PS.description")
    public void setISOCOUNTRYCODEPSDescription(String iSOCOUNTRYCODEPSDescription) {
        this.iSOCOUNTRYCODEPSDescription = iSOCOUNTRYCODEPSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PS.isEditable")
    public String getISOCOUNTRYCODEPSIsEditable() {
        return iSOCOUNTRYCODEPSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PS.isEditable")
    public void setISOCOUNTRYCODEPSIsEditable(String iSOCOUNTRYCODEPSIsEditable) {
        this.iSOCOUNTRYCODEPSIsEditable = iSOCOUNTRYCODEPSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PT.value")
    public String getISOCOUNTRYCODEPTValue() {
        return iSOCOUNTRYCODEPTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PT.value")
    public void setISOCOUNTRYCODEPTValue(String iSOCOUNTRYCODEPTValue) {
        this.iSOCOUNTRYCODEPTValue = iSOCOUNTRYCODEPTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PT.description")
    public String getISOCOUNTRYCODEPTDescription() {
        return iSOCOUNTRYCODEPTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PT.description")
    public void setISOCOUNTRYCODEPTDescription(String iSOCOUNTRYCODEPTDescription) {
        this.iSOCOUNTRYCODEPTDescription = iSOCOUNTRYCODEPTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PT.isEditable")
    public String getISOCOUNTRYCODEPTIsEditable() {
        return iSOCOUNTRYCODEPTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PT.isEditable")
    public void setISOCOUNTRYCODEPTIsEditable(String iSOCOUNTRYCODEPTIsEditable) {
        this.iSOCOUNTRYCODEPTIsEditable = iSOCOUNTRYCODEPTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PW.value")
    public String getISOCOUNTRYCODEPWValue() {
        return iSOCOUNTRYCODEPWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PW.value")
    public void setISOCOUNTRYCODEPWValue(String iSOCOUNTRYCODEPWValue) {
        this.iSOCOUNTRYCODEPWValue = iSOCOUNTRYCODEPWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PW.description")
    public String getISOCOUNTRYCODEPWDescription() {
        return iSOCOUNTRYCODEPWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PW.description")
    public void setISOCOUNTRYCODEPWDescription(String iSOCOUNTRYCODEPWDescription) {
        this.iSOCOUNTRYCODEPWDescription = iSOCOUNTRYCODEPWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PW.isEditable")
    public String getISOCOUNTRYCODEPWIsEditable() {
        return iSOCOUNTRYCODEPWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PW.isEditable")
    public void setISOCOUNTRYCODEPWIsEditable(String iSOCOUNTRYCODEPWIsEditable) {
        this.iSOCOUNTRYCODEPWIsEditable = iSOCOUNTRYCODEPWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PY.value")
    public String getISOCOUNTRYCODEPYValue() {
        return iSOCOUNTRYCODEPYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PY.value")
    public void setISOCOUNTRYCODEPYValue(String iSOCOUNTRYCODEPYValue) {
        this.iSOCOUNTRYCODEPYValue = iSOCOUNTRYCODEPYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.PY.description")
    public String getISOCOUNTRYCODEPYDescription() {
        return iSOCOUNTRYCODEPYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PY.description")
    public void setISOCOUNTRYCODEPYDescription(String iSOCOUNTRYCODEPYDescription) {
        this.iSOCOUNTRYCODEPYDescription = iSOCOUNTRYCODEPYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.PY.isEditable")
    public String getISOCOUNTRYCODEPYIsEditable() {
        return iSOCOUNTRYCODEPYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.PY.isEditable")
    public void setISOCOUNTRYCODEPYIsEditable(String iSOCOUNTRYCODEPYIsEditable) {
        this.iSOCOUNTRYCODEPYIsEditable = iSOCOUNTRYCODEPYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.QA.value")
    public String getISOCOUNTRYCODEQAValue() {
        return iSOCOUNTRYCODEQAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.QA.value")
    public void setISOCOUNTRYCODEQAValue(String iSOCOUNTRYCODEQAValue) {
        this.iSOCOUNTRYCODEQAValue = iSOCOUNTRYCODEQAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.QA.description")
    public String getISOCOUNTRYCODEQADescription() {
        return iSOCOUNTRYCODEQADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.QA.description")
    public void setISOCOUNTRYCODEQADescription(String iSOCOUNTRYCODEQADescription) {
        this.iSOCOUNTRYCODEQADescription = iSOCOUNTRYCODEQADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.QA.isEditable")
    public String getISOCOUNTRYCODEQAIsEditable() {
        return iSOCOUNTRYCODEQAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.QA.isEditable")
    public void setISOCOUNTRYCODEQAIsEditable(String iSOCOUNTRYCODEQAIsEditable) {
        this.iSOCOUNTRYCODEQAIsEditable = iSOCOUNTRYCODEQAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RE.value")
    public String getISOCOUNTRYCODEREValue() {
        return iSOCOUNTRYCODEREValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RE.value")
    public void setISOCOUNTRYCODEREValue(String iSOCOUNTRYCODEREValue) {
        this.iSOCOUNTRYCODEREValue = iSOCOUNTRYCODEREValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RE.description")
    public String getISOCOUNTRYCODEREDescription() {
        return iSOCOUNTRYCODEREDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RE.description")
    public void setISOCOUNTRYCODEREDescription(String iSOCOUNTRYCODEREDescription) {
        this.iSOCOUNTRYCODEREDescription = iSOCOUNTRYCODEREDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RE.isEditable")
    public String getISOCOUNTRYCODEREIsEditable() {
        return iSOCOUNTRYCODEREIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RE.isEditable")
    public void setISOCOUNTRYCODEREIsEditable(String iSOCOUNTRYCODEREIsEditable) {
        this.iSOCOUNTRYCODEREIsEditable = iSOCOUNTRYCODEREIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RO.value")
    public String getISOCOUNTRYCODEROValue() {
        return iSOCOUNTRYCODEROValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RO.value")
    public void setISOCOUNTRYCODEROValue(String iSOCOUNTRYCODEROValue) {
        this.iSOCOUNTRYCODEROValue = iSOCOUNTRYCODEROValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RO.description")
    public String getISOCOUNTRYCODERODescription() {
        return iSOCOUNTRYCODERODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RO.description")
    public void setISOCOUNTRYCODERODescription(String iSOCOUNTRYCODERODescription) {
        this.iSOCOUNTRYCODERODescription = iSOCOUNTRYCODERODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RO.isEditable")
    public String getISOCOUNTRYCODEROIsEditable() {
        return iSOCOUNTRYCODEROIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RO.isEditable")
    public void setISOCOUNTRYCODEROIsEditable(String iSOCOUNTRYCODEROIsEditable) {
        this.iSOCOUNTRYCODEROIsEditable = iSOCOUNTRYCODEROIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RU.value")
    public String getISOCOUNTRYCODERUValue() {
        return iSOCOUNTRYCODERUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RU.value")
    public void setISOCOUNTRYCODERUValue(String iSOCOUNTRYCODERUValue) {
        this.iSOCOUNTRYCODERUValue = iSOCOUNTRYCODERUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.RU.description")
    public String getISOCOUNTRYCODERUDescription() {
        return iSOCOUNTRYCODERUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RU.description")
    public void setISOCOUNTRYCODERUDescription(String iSOCOUNTRYCODERUDescription) {
        this.iSOCOUNTRYCODERUDescription = iSOCOUNTRYCODERUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.RU.isEditable")
    public String getISOCOUNTRYCODERUIsEditable() {
        return iSOCOUNTRYCODERUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.RU.isEditable")
    public void setISOCOUNTRYCODERUIsEditable(String iSOCOUNTRYCODERUIsEditable) {
        this.iSOCOUNTRYCODERUIsEditable = iSOCOUNTRYCODERUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SA.value")
    public String getISOCOUNTRYCODESAValue() {
        return iSOCOUNTRYCODESAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SA.value")
    public void setISOCOUNTRYCODESAValue(String iSOCOUNTRYCODESAValue) {
        this.iSOCOUNTRYCODESAValue = iSOCOUNTRYCODESAValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SA.description")
    public String getISOCOUNTRYCODESADescription() {
        return iSOCOUNTRYCODESADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SA.description")
    public void setISOCOUNTRYCODESADescription(String iSOCOUNTRYCODESADescription) {
        this.iSOCOUNTRYCODESADescription = iSOCOUNTRYCODESADescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SA.isEditable")
    public String getISOCOUNTRYCODESAIsEditable() {
        return iSOCOUNTRYCODESAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SA.isEditable")
    public void setISOCOUNTRYCODESAIsEditable(String iSOCOUNTRYCODESAIsEditable) {
        this.iSOCOUNTRYCODESAIsEditable = iSOCOUNTRYCODESAIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SB.value")
    public String getISOCOUNTRYCODESBValue() {
        return iSOCOUNTRYCODESBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SB.value")
    public void setISOCOUNTRYCODESBValue(String iSOCOUNTRYCODESBValue) {
        this.iSOCOUNTRYCODESBValue = iSOCOUNTRYCODESBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SB.description")
    public String getISOCOUNTRYCODESBDescription() {
        return iSOCOUNTRYCODESBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SB.description")
    public void setISOCOUNTRYCODESBDescription(String iSOCOUNTRYCODESBDescription) {
        this.iSOCOUNTRYCODESBDescription = iSOCOUNTRYCODESBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SB.isEditable")
    public String getISOCOUNTRYCODESBIsEditable() {
        return iSOCOUNTRYCODESBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SB.isEditable")
    public void setISOCOUNTRYCODESBIsEditable(String iSOCOUNTRYCODESBIsEditable) {
        this.iSOCOUNTRYCODESBIsEditable = iSOCOUNTRYCODESBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SD.value")
    public String getISOCOUNTRYCODESDValue() {
        return iSOCOUNTRYCODESDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SD.value")
    public void setISOCOUNTRYCODESDValue(String iSOCOUNTRYCODESDValue) {
        this.iSOCOUNTRYCODESDValue = iSOCOUNTRYCODESDValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SD.description")
    public String getISOCOUNTRYCODESDDescription() {
        return iSOCOUNTRYCODESDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SD.description")
    public void setISOCOUNTRYCODESDDescription(String iSOCOUNTRYCODESDDescription) {
        this.iSOCOUNTRYCODESDDescription = iSOCOUNTRYCODESDDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SD.isEditable")
    public String getISOCOUNTRYCODESDIsEditable() {
        return iSOCOUNTRYCODESDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SD.isEditable")
    public void setISOCOUNTRYCODESDIsEditable(String iSOCOUNTRYCODESDIsEditable) {
        this.iSOCOUNTRYCODESDIsEditable = iSOCOUNTRYCODESDIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SE.value")
    public String getISOCOUNTRYCODESEValue() {
        return iSOCOUNTRYCODESEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SE.value")
    public void setISOCOUNTRYCODESEValue(String iSOCOUNTRYCODESEValue) {
        this.iSOCOUNTRYCODESEValue = iSOCOUNTRYCODESEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SE.description")
    public String getISOCOUNTRYCODESEDescription() {
        return iSOCOUNTRYCODESEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SE.description")
    public void setISOCOUNTRYCODESEDescription(String iSOCOUNTRYCODESEDescription) {
        this.iSOCOUNTRYCODESEDescription = iSOCOUNTRYCODESEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SE.isEditable")
    public String getISOCOUNTRYCODESEIsEditable() {
        return iSOCOUNTRYCODESEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SE.isEditable")
    public void setISOCOUNTRYCODESEIsEditable(String iSOCOUNTRYCODESEIsEditable) {
        this.iSOCOUNTRYCODESEIsEditable = iSOCOUNTRYCODESEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SG.value")
    public String getISOCOUNTRYCODESGValue() {
        return iSOCOUNTRYCODESGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SG.value")
    public void setISOCOUNTRYCODESGValue(String iSOCOUNTRYCODESGValue) {
        this.iSOCOUNTRYCODESGValue = iSOCOUNTRYCODESGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SG.description")
    public String getISOCOUNTRYCODESGDescription() {
        return iSOCOUNTRYCODESGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SG.description")
    public void setISOCOUNTRYCODESGDescription(String iSOCOUNTRYCODESGDescription) {
        this.iSOCOUNTRYCODESGDescription = iSOCOUNTRYCODESGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SG.isEditable")
    public String getISOCOUNTRYCODESGIsEditable() {
        return iSOCOUNTRYCODESGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SG.isEditable")
    public void setISOCOUNTRYCODESGIsEditable(String iSOCOUNTRYCODESGIsEditable) {
        this.iSOCOUNTRYCODESGIsEditable = iSOCOUNTRYCODESGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SH.value")
    public String getISOCOUNTRYCODESHValue() {
        return iSOCOUNTRYCODESHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SH.value")
    public void setISOCOUNTRYCODESHValue(String iSOCOUNTRYCODESHValue) {
        this.iSOCOUNTRYCODESHValue = iSOCOUNTRYCODESHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SH.description")
    public String getISOCOUNTRYCODESHDescription() {
        return iSOCOUNTRYCODESHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SH.description")
    public void setISOCOUNTRYCODESHDescription(String iSOCOUNTRYCODESHDescription) {
        this.iSOCOUNTRYCODESHDescription = iSOCOUNTRYCODESHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SH.isEditable")
    public String getISOCOUNTRYCODESHIsEditable() {
        return iSOCOUNTRYCODESHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SH.isEditable")
    public void setISOCOUNTRYCODESHIsEditable(String iSOCOUNTRYCODESHIsEditable) {
        this.iSOCOUNTRYCODESHIsEditable = iSOCOUNTRYCODESHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SI.value")
    public String getISOCOUNTRYCODESIValue() {
        return iSOCOUNTRYCODESIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SI.value")
    public void setISOCOUNTRYCODESIValue(String iSOCOUNTRYCODESIValue) {
        this.iSOCOUNTRYCODESIValue = iSOCOUNTRYCODESIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SI.description")
    public String getISOCOUNTRYCODESIDescription() {
        return iSOCOUNTRYCODESIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SI.description")
    public void setISOCOUNTRYCODESIDescription(String iSOCOUNTRYCODESIDescription) {
        this.iSOCOUNTRYCODESIDescription = iSOCOUNTRYCODESIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SI.isEditable")
    public String getISOCOUNTRYCODESIIsEditable() {
        return iSOCOUNTRYCODESIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SI.isEditable")
    public void setISOCOUNTRYCODESIIsEditable(String iSOCOUNTRYCODESIIsEditable) {
        this.iSOCOUNTRYCODESIIsEditable = iSOCOUNTRYCODESIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SK.value")
    public String getISOCOUNTRYCODESKValue() {
        return iSOCOUNTRYCODESKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SK.value")
    public void setISOCOUNTRYCODESKValue(String iSOCOUNTRYCODESKValue) {
        this.iSOCOUNTRYCODESKValue = iSOCOUNTRYCODESKValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SK.description")
    public String getISOCOUNTRYCODESKDescription() {
        return iSOCOUNTRYCODESKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SK.description")
    public void setISOCOUNTRYCODESKDescription(String iSOCOUNTRYCODESKDescription) {
        this.iSOCOUNTRYCODESKDescription = iSOCOUNTRYCODESKDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SK.isEditable")
    public String getISOCOUNTRYCODESKIsEditable() {
        return iSOCOUNTRYCODESKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SK.isEditable")
    public void setISOCOUNTRYCODESKIsEditable(String iSOCOUNTRYCODESKIsEditable) {
        this.iSOCOUNTRYCODESKIsEditable = iSOCOUNTRYCODESKIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SL.value")
    public String getISOCOUNTRYCODESLValue() {
        return iSOCOUNTRYCODESLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SL.value")
    public void setISOCOUNTRYCODESLValue(String iSOCOUNTRYCODESLValue) {
        this.iSOCOUNTRYCODESLValue = iSOCOUNTRYCODESLValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SL.description")
    public String getISOCOUNTRYCODESLDescription() {
        return iSOCOUNTRYCODESLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SL.description")
    public void setISOCOUNTRYCODESLDescription(String iSOCOUNTRYCODESLDescription) {
        this.iSOCOUNTRYCODESLDescription = iSOCOUNTRYCODESLDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SL.isEditable")
    public String getISOCOUNTRYCODESLIsEditable() {
        return iSOCOUNTRYCODESLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SL.isEditable")
    public void setISOCOUNTRYCODESLIsEditable(String iSOCOUNTRYCODESLIsEditable) {
        this.iSOCOUNTRYCODESLIsEditable = iSOCOUNTRYCODESLIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SM.value")
    public String getISOCOUNTRYCODESMValue() {
        return iSOCOUNTRYCODESMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SM.value")
    public void setISOCOUNTRYCODESMValue(String iSOCOUNTRYCODESMValue) {
        this.iSOCOUNTRYCODESMValue = iSOCOUNTRYCODESMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SM.description")
    public String getISOCOUNTRYCODESMDescription() {
        return iSOCOUNTRYCODESMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SM.description")
    public void setISOCOUNTRYCODESMDescription(String iSOCOUNTRYCODESMDescription) {
        this.iSOCOUNTRYCODESMDescription = iSOCOUNTRYCODESMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SM.isEditable")
    public String getISOCOUNTRYCODESMIsEditable() {
        return iSOCOUNTRYCODESMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SM.isEditable")
    public void setISOCOUNTRYCODESMIsEditable(String iSOCOUNTRYCODESMIsEditable) {
        this.iSOCOUNTRYCODESMIsEditable = iSOCOUNTRYCODESMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SN.value")
    public String getISOCOUNTRYCODESNValue() {
        return iSOCOUNTRYCODESNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SN.value")
    public void setISOCOUNTRYCODESNValue(String iSOCOUNTRYCODESNValue) {
        this.iSOCOUNTRYCODESNValue = iSOCOUNTRYCODESNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SN.description")
    public String getISOCOUNTRYCODESNDescription() {
        return iSOCOUNTRYCODESNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SN.description")
    public void setISOCOUNTRYCODESNDescription(String iSOCOUNTRYCODESNDescription) {
        this.iSOCOUNTRYCODESNDescription = iSOCOUNTRYCODESNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SN.isEditable")
    public String getISOCOUNTRYCODESNIsEditable() {
        return iSOCOUNTRYCODESNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SN.isEditable")
    public void setISOCOUNTRYCODESNIsEditable(String iSOCOUNTRYCODESNIsEditable) {
        this.iSOCOUNTRYCODESNIsEditable = iSOCOUNTRYCODESNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SR.value")
    public String getISOCOUNTRYCODESRValue() {
        return iSOCOUNTRYCODESRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SR.value")
    public void setISOCOUNTRYCODESRValue(String iSOCOUNTRYCODESRValue) {
        this.iSOCOUNTRYCODESRValue = iSOCOUNTRYCODESRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SR.description")
    public String getISOCOUNTRYCODESRDescription() {
        return iSOCOUNTRYCODESRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SR.description")
    public void setISOCOUNTRYCODESRDescription(String iSOCOUNTRYCODESRDescription) {
        this.iSOCOUNTRYCODESRDescription = iSOCOUNTRYCODESRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SR.isEditable")
    public String getISOCOUNTRYCODESRIsEditable() {
        return iSOCOUNTRYCODESRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SR.isEditable")
    public void setISOCOUNTRYCODESRIsEditable(String iSOCOUNTRYCODESRIsEditable) {
        this.iSOCOUNTRYCODESRIsEditable = iSOCOUNTRYCODESRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SV.value")
    public String getISOCOUNTRYCODESVValue() {
        return iSOCOUNTRYCODESVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SV.value")
    public void setISOCOUNTRYCODESVValue(String iSOCOUNTRYCODESVValue) {
        this.iSOCOUNTRYCODESVValue = iSOCOUNTRYCODESVValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SV.description")
    public String getISOCOUNTRYCODESVDescription() {
        return iSOCOUNTRYCODESVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SV.description")
    public void setISOCOUNTRYCODESVDescription(String iSOCOUNTRYCODESVDescription) {
        this.iSOCOUNTRYCODESVDescription = iSOCOUNTRYCODESVDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SV.isEditable")
    public String getISOCOUNTRYCODESVIsEditable() {
        return iSOCOUNTRYCODESVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SV.isEditable")
    public void setISOCOUNTRYCODESVIsEditable(String iSOCOUNTRYCODESVIsEditable) {
        this.iSOCOUNTRYCODESVIsEditable = iSOCOUNTRYCODESVIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SY.value")
    public String getISOCOUNTRYCODESYValue() {
        return iSOCOUNTRYCODESYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SY.value")
    public void setISOCOUNTRYCODESYValue(String iSOCOUNTRYCODESYValue) {
        this.iSOCOUNTRYCODESYValue = iSOCOUNTRYCODESYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SY.description")
    public String getISOCOUNTRYCODESYDescription() {
        return iSOCOUNTRYCODESYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SY.description")
    public void setISOCOUNTRYCODESYDescription(String iSOCOUNTRYCODESYDescription) {
        this.iSOCOUNTRYCODESYDescription = iSOCOUNTRYCODESYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SY.isEditable")
    public String getISOCOUNTRYCODESYIsEditable() {
        return iSOCOUNTRYCODESYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SY.isEditable")
    public void setISOCOUNTRYCODESYIsEditable(String iSOCOUNTRYCODESYIsEditable) {
        this.iSOCOUNTRYCODESYIsEditable = iSOCOUNTRYCODESYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SZ.value")
    public String getISOCOUNTRYCODESZValue() {
        return iSOCOUNTRYCODESZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SZ.value")
    public void setISOCOUNTRYCODESZValue(String iSOCOUNTRYCODESZValue) {
        this.iSOCOUNTRYCODESZValue = iSOCOUNTRYCODESZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.SZ.description")
    public String getISOCOUNTRYCODESZDescription() {
        return iSOCOUNTRYCODESZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SZ.description")
    public void setISOCOUNTRYCODESZDescription(String iSOCOUNTRYCODESZDescription) {
        this.iSOCOUNTRYCODESZDescription = iSOCOUNTRYCODESZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.SZ.isEditable")
    public String getISOCOUNTRYCODESZIsEditable() {
        return iSOCOUNTRYCODESZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.SZ.isEditable")
    public void setISOCOUNTRYCODESZIsEditable(String iSOCOUNTRYCODESZIsEditable) {
        this.iSOCOUNTRYCODESZIsEditable = iSOCOUNTRYCODESZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TF.value")
    public String getISOCOUNTRYCODETFValue() {
        return iSOCOUNTRYCODETFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TF.value")
    public void setISOCOUNTRYCODETFValue(String iSOCOUNTRYCODETFValue) {
        this.iSOCOUNTRYCODETFValue = iSOCOUNTRYCODETFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TF.description")
    public String getISOCOUNTRYCODETFDescription() {
        return iSOCOUNTRYCODETFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TF.description")
    public void setISOCOUNTRYCODETFDescription(String iSOCOUNTRYCODETFDescription) {
        this.iSOCOUNTRYCODETFDescription = iSOCOUNTRYCODETFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TF.isEditable")
    public String getISOCOUNTRYCODETFIsEditable() {
        return iSOCOUNTRYCODETFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TF.isEditable")
    public void setISOCOUNTRYCODETFIsEditable(String iSOCOUNTRYCODETFIsEditable) {
        this.iSOCOUNTRYCODETFIsEditable = iSOCOUNTRYCODETFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TH.value")
    public String getISOCOUNTRYCODETHValue() {
        return iSOCOUNTRYCODETHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TH.value")
    public void setISOCOUNTRYCODETHValue(String iSOCOUNTRYCODETHValue) {
        this.iSOCOUNTRYCODETHValue = iSOCOUNTRYCODETHValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TH.description")
    public String getISOCOUNTRYCODETHDescription() {
        return iSOCOUNTRYCODETHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TH.description")
    public void setISOCOUNTRYCODETHDescription(String iSOCOUNTRYCODETHDescription) {
        this.iSOCOUNTRYCODETHDescription = iSOCOUNTRYCODETHDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TH.isEditable")
    public String getISOCOUNTRYCODETHIsEditable() {
        return iSOCOUNTRYCODETHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TH.isEditable")
    public void setISOCOUNTRYCODETHIsEditable(String iSOCOUNTRYCODETHIsEditable) {
        this.iSOCOUNTRYCODETHIsEditable = iSOCOUNTRYCODETHIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TJ.value")
    public String getISOCOUNTRYCODETJValue() {
        return iSOCOUNTRYCODETJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TJ.value")
    public void setISOCOUNTRYCODETJValue(String iSOCOUNTRYCODETJValue) {
        this.iSOCOUNTRYCODETJValue = iSOCOUNTRYCODETJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TJ.description")
    public String getISOCOUNTRYCODETJDescription() {
        return iSOCOUNTRYCODETJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TJ.description")
    public void setISOCOUNTRYCODETJDescription(String iSOCOUNTRYCODETJDescription) {
        this.iSOCOUNTRYCODETJDescription = iSOCOUNTRYCODETJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TJ.isEditable")
    public String getISOCOUNTRYCODETJIsEditable() {
        return iSOCOUNTRYCODETJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TJ.isEditable")
    public void setISOCOUNTRYCODETJIsEditable(String iSOCOUNTRYCODETJIsEditable) {
        this.iSOCOUNTRYCODETJIsEditable = iSOCOUNTRYCODETJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TN.value")
    public String getISOCOUNTRYCODETNValue() {
        return iSOCOUNTRYCODETNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TN.value")
    public void setISOCOUNTRYCODETNValue(String iSOCOUNTRYCODETNValue) {
        this.iSOCOUNTRYCODETNValue = iSOCOUNTRYCODETNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TN.description")
    public String getISOCOUNTRYCODETNDescription() {
        return iSOCOUNTRYCODETNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TN.description")
    public void setISOCOUNTRYCODETNDescription(String iSOCOUNTRYCODETNDescription) {
        this.iSOCOUNTRYCODETNDescription = iSOCOUNTRYCODETNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TN.isEditable")
    public String getISOCOUNTRYCODETNIsEditable() {
        return iSOCOUNTRYCODETNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TN.isEditable")
    public void setISOCOUNTRYCODETNIsEditable(String iSOCOUNTRYCODETNIsEditable) {
        this.iSOCOUNTRYCODETNIsEditable = iSOCOUNTRYCODETNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TR.value")
    public String getISOCOUNTRYCODETRValue() {
        return iSOCOUNTRYCODETRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TR.value")
    public void setISOCOUNTRYCODETRValue(String iSOCOUNTRYCODETRValue) {
        this.iSOCOUNTRYCODETRValue = iSOCOUNTRYCODETRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TR.description")
    public String getISOCOUNTRYCODETRDescription() {
        return iSOCOUNTRYCODETRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TR.description")
    public void setISOCOUNTRYCODETRDescription(String iSOCOUNTRYCODETRDescription) {
        this.iSOCOUNTRYCODETRDescription = iSOCOUNTRYCODETRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TR.isEditable")
    public String getISOCOUNTRYCODETRIsEditable() {
        return iSOCOUNTRYCODETRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TR.isEditable")
    public void setISOCOUNTRYCODETRIsEditable(String iSOCOUNTRYCODETRIsEditable) {
        this.iSOCOUNTRYCODETRIsEditable = iSOCOUNTRYCODETRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TW.value")
    public String getISOCOUNTRYCODETWValue() {
        return iSOCOUNTRYCODETWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TW.value")
    public void setISOCOUNTRYCODETWValue(String iSOCOUNTRYCODETWValue) {
        this.iSOCOUNTRYCODETWValue = iSOCOUNTRYCODETWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TW.description")
    public String getISOCOUNTRYCODETWDescription() {
        return iSOCOUNTRYCODETWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TW.description")
    public void setISOCOUNTRYCODETWDescription(String iSOCOUNTRYCODETWDescription) {
        this.iSOCOUNTRYCODETWDescription = iSOCOUNTRYCODETWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TW.isEditable")
    public String getISOCOUNTRYCODETWIsEditable() {
        return iSOCOUNTRYCODETWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TW.isEditable")
    public void setISOCOUNTRYCODETWIsEditable(String iSOCOUNTRYCODETWIsEditable) {
        this.iSOCOUNTRYCODETWIsEditable = iSOCOUNTRYCODETWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TZ.value")
    public String getISOCOUNTRYCODETZValue() {
        return iSOCOUNTRYCODETZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TZ.value")
    public void setISOCOUNTRYCODETZValue(String iSOCOUNTRYCODETZValue) {
        this.iSOCOUNTRYCODETZValue = iSOCOUNTRYCODETZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.TZ.description")
    public String getISOCOUNTRYCODETZDescription() {
        return iSOCOUNTRYCODETZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TZ.description")
    public void setISOCOUNTRYCODETZDescription(String iSOCOUNTRYCODETZDescription) {
        this.iSOCOUNTRYCODETZDescription = iSOCOUNTRYCODETZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.TZ.isEditable")
    public String getISOCOUNTRYCODETZIsEditable() {
        return iSOCOUNTRYCODETZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.TZ.isEditable")
    public void setISOCOUNTRYCODETZIsEditable(String iSOCOUNTRYCODETZIsEditable) {
        this.iSOCOUNTRYCODETZIsEditable = iSOCOUNTRYCODETZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UG.value")
    public String getISOCOUNTRYCODEUGValue() {
        return iSOCOUNTRYCODEUGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UG.value")
    public void setISOCOUNTRYCODEUGValue(String iSOCOUNTRYCODEUGValue) {
        this.iSOCOUNTRYCODEUGValue = iSOCOUNTRYCODEUGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UG.description")
    public String getISOCOUNTRYCODEUGDescription() {
        return iSOCOUNTRYCODEUGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UG.description")
    public void setISOCOUNTRYCODEUGDescription(String iSOCOUNTRYCODEUGDescription) {
        this.iSOCOUNTRYCODEUGDescription = iSOCOUNTRYCODEUGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UG.isEditable")
    public String getISOCOUNTRYCODEUGIsEditable() {
        return iSOCOUNTRYCODEUGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UG.isEditable")
    public void setISOCOUNTRYCODEUGIsEditable(String iSOCOUNTRYCODEUGIsEditable) {
        this.iSOCOUNTRYCODEUGIsEditable = iSOCOUNTRYCODEUGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.US.value")
    public String getISOCOUNTRYCODEUSValue() {
        return iSOCOUNTRYCODEUSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.US.value")
    public void setISOCOUNTRYCODEUSValue(String iSOCOUNTRYCODEUSValue) {
        this.iSOCOUNTRYCODEUSValue = iSOCOUNTRYCODEUSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.US.description")
    public String getISOCOUNTRYCODEUSDescription() {
        return iSOCOUNTRYCODEUSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.US.description")
    public void setISOCOUNTRYCODEUSDescription(String iSOCOUNTRYCODEUSDescription) {
        this.iSOCOUNTRYCODEUSDescription = iSOCOUNTRYCODEUSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.US.isEditable")
    public String getISOCOUNTRYCODEUSIsEditable() {
        return iSOCOUNTRYCODEUSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.US.isEditable")
    public void setISOCOUNTRYCODEUSIsEditable(String iSOCOUNTRYCODEUSIsEditable) {
        this.iSOCOUNTRYCODEUSIsEditable = iSOCOUNTRYCODEUSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UY.value")
    public String getISOCOUNTRYCODEUYValue() {
        return iSOCOUNTRYCODEUYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UY.value")
    public void setISOCOUNTRYCODEUYValue(String iSOCOUNTRYCODEUYValue) {
        this.iSOCOUNTRYCODEUYValue = iSOCOUNTRYCODEUYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UY.description")
    public String getISOCOUNTRYCODEUYDescription() {
        return iSOCOUNTRYCODEUYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UY.description")
    public void setISOCOUNTRYCODEUYDescription(String iSOCOUNTRYCODEUYDescription) {
        this.iSOCOUNTRYCODEUYDescription = iSOCOUNTRYCODEUYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UY.isEditable")
    public String getISOCOUNTRYCODEUYIsEditable() {
        return iSOCOUNTRYCODEUYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UY.isEditable")
    public void setISOCOUNTRYCODEUYIsEditable(String iSOCOUNTRYCODEUYIsEditable) {
        this.iSOCOUNTRYCODEUYIsEditable = iSOCOUNTRYCODEUYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UZ.value")
    public String getISOCOUNTRYCODEUZValue() {
        return iSOCOUNTRYCODEUZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UZ.value")
    public void setISOCOUNTRYCODEUZValue(String iSOCOUNTRYCODEUZValue) {
        this.iSOCOUNTRYCODEUZValue = iSOCOUNTRYCODEUZValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.UZ.description")
    public String getISOCOUNTRYCODEUZDescription() {
        return iSOCOUNTRYCODEUZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UZ.description")
    public void setISOCOUNTRYCODEUZDescription(String iSOCOUNTRYCODEUZDescription) {
        this.iSOCOUNTRYCODEUZDescription = iSOCOUNTRYCODEUZDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.UZ.isEditable")
    public String getISOCOUNTRYCODEUZIsEditable() {
        return iSOCOUNTRYCODEUZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.UZ.isEditable")
    public void setISOCOUNTRYCODEUZIsEditable(String iSOCOUNTRYCODEUZIsEditable) {
        this.iSOCOUNTRYCODEUZIsEditable = iSOCOUNTRYCODEUZIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VC.value")
    public String getISOCOUNTRYCODEVCValue() {
        return iSOCOUNTRYCODEVCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VC.value")
    public void setISOCOUNTRYCODEVCValue(String iSOCOUNTRYCODEVCValue) {
        this.iSOCOUNTRYCODEVCValue = iSOCOUNTRYCODEVCValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VC.description")
    public String getISOCOUNTRYCODEVCDescription() {
        return iSOCOUNTRYCODEVCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VC.description")
    public void setISOCOUNTRYCODEVCDescription(String iSOCOUNTRYCODEVCDescription) {
        this.iSOCOUNTRYCODEVCDescription = iSOCOUNTRYCODEVCDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VC.isEditable")
    public String getISOCOUNTRYCODEVCIsEditable() {
        return iSOCOUNTRYCODEVCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VC.isEditable")
    public void setISOCOUNTRYCODEVCIsEditable(String iSOCOUNTRYCODEVCIsEditable) {
        this.iSOCOUNTRYCODEVCIsEditable = iSOCOUNTRYCODEVCIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VE.value")
    public String getISOCOUNTRYCODEVEValue() {
        return iSOCOUNTRYCODEVEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VE.value")
    public void setISOCOUNTRYCODEVEValue(String iSOCOUNTRYCODEVEValue) {
        this.iSOCOUNTRYCODEVEValue = iSOCOUNTRYCODEVEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VE.description")
    public String getISOCOUNTRYCODEVEDescription() {
        return iSOCOUNTRYCODEVEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VE.description")
    public void setISOCOUNTRYCODEVEDescription(String iSOCOUNTRYCODEVEDescription) {
        this.iSOCOUNTRYCODEVEDescription = iSOCOUNTRYCODEVEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VE.isEditable")
    public String getISOCOUNTRYCODEVEIsEditable() {
        return iSOCOUNTRYCODEVEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VE.isEditable")
    public void setISOCOUNTRYCODEVEIsEditable(String iSOCOUNTRYCODEVEIsEditable) {
        this.iSOCOUNTRYCODEVEIsEditable = iSOCOUNTRYCODEVEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VU.value")
    public String getISOCOUNTRYCODEVUValue() {
        return iSOCOUNTRYCODEVUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VU.value")
    public void setISOCOUNTRYCODEVUValue(String iSOCOUNTRYCODEVUValue) {
        this.iSOCOUNTRYCODEVUValue = iSOCOUNTRYCODEVUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.VU.description")
    public String getISOCOUNTRYCODEVUDescription() {
        return iSOCOUNTRYCODEVUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VU.description")
    public void setISOCOUNTRYCODEVUDescription(String iSOCOUNTRYCODEVUDescription) {
        this.iSOCOUNTRYCODEVUDescription = iSOCOUNTRYCODEVUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.VU.isEditable")
    public String getISOCOUNTRYCODEVUIsEditable() {
        return iSOCOUNTRYCODEVUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.VU.isEditable")
    public void setISOCOUNTRYCODEVUIsEditable(String iSOCOUNTRYCODEVUIsEditable) {
        this.iSOCOUNTRYCODEVUIsEditable = iSOCOUNTRYCODEVUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.WS.value")
    public String getISOCOUNTRYCODEWSValue() {
        return iSOCOUNTRYCODEWSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.WS.value")
    public void setISOCOUNTRYCODEWSValue(String iSOCOUNTRYCODEWSValue) {
        this.iSOCOUNTRYCODEWSValue = iSOCOUNTRYCODEWSValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.WS.description")
    public String getISOCOUNTRYCODEWSDescription() {
        return iSOCOUNTRYCODEWSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.WS.description")
    public void setISOCOUNTRYCODEWSDescription(String iSOCOUNTRYCODEWSDescription) {
        this.iSOCOUNTRYCODEWSDescription = iSOCOUNTRYCODEWSDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.WS.isEditable")
    public String getISOCOUNTRYCODEWSIsEditable() {
        return iSOCOUNTRYCODEWSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.WS.isEditable")
    public void setISOCOUNTRYCODEWSIsEditable(String iSOCOUNTRYCODEWSIsEditable) {
        this.iSOCOUNTRYCODEWSIsEditable = iSOCOUNTRYCODEWSIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.YE.value")
    public String getISOCOUNTRYCODEYEValue() {
        return iSOCOUNTRYCODEYEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.YE.value")
    public void setISOCOUNTRYCODEYEValue(String iSOCOUNTRYCODEYEValue) {
        this.iSOCOUNTRYCODEYEValue = iSOCOUNTRYCODEYEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.YE.description")
    public String getISOCOUNTRYCODEYEDescription() {
        return iSOCOUNTRYCODEYEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.YE.description")
    public void setISOCOUNTRYCODEYEDescription(String iSOCOUNTRYCODEYEDescription) {
        this.iSOCOUNTRYCODEYEDescription = iSOCOUNTRYCODEYEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.YE.isEditable")
    public String getISOCOUNTRYCODEYEIsEditable() {
        return iSOCOUNTRYCODEYEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.YE.isEditable")
    public void setISOCOUNTRYCODEYEIsEditable(String iSOCOUNTRYCODEYEIsEditable) {
        this.iSOCOUNTRYCODEYEIsEditable = iSOCOUNTRYCODEYEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.YT.value")
    public String getISOCOUNTRYCODEYTValue() {
        return iSOCOUNTRYCODEYTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.YT.value")
    public void setISOCOUNTRYCODEYTValue(String iSOCOUNTRYCODEYTValue) {
        this.iSOCOUNTRYCODEYTValue = iSOCOUNTRYCODEYTValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.YT.description")
    public String getISOCOUNTRYCODEYTDescription() {
        return iSOCOUNTRYCODEYTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.YT.description")
    public void setISOCOUNTRYCODEYTDescription(String iSOCOUNTRYCODEYTDescription) {
        this.iSOCOUNTRYCODEYTDescription = iSOCOUNTRYCODEYTDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.YT.isEditable")
    public String getISOCOUNTRYCODEYTIsEditable() {
        return iSOCOUNTRYCODEYTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.YT.isEditable")
    public void setISOCOUNTRYCODEYTIsEditable(String iSOCOUNTRYCODEYTIsEditable) {
        this.iSOCOUNTRYCODEYTIsEditable = iSOCOUNTRYCODEYTIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZM.value")
    public String getISOCOUNTRYCODEZMValue() {
        return iSOCOUNTRYCODEZMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZM.value")
    public void setISOCOUNTRYCODEZMValue(String iSOCOUNTRYCODEZMValue) {
        this.iSOCOUNTRYCODEZMValue = iSOCOUNTRYCODEZMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZM.description")
    public String getISOCOUNTRYCODEZMDescription() {
        return iSOCOUNTRYCODEZMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZM.description")
    public void setISOCOUNTRYCODEZMDescription(String iSOCOUNTRYCODEZMDescription) {
        this.iSOCOUNTRYCODEZMDescription = iSOCOUNTRYCODEZMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZM.isEditable")
    public String getISOCOUNTRYCODEZMIsEditable() {
        return iSOCOUNTRYCODEZMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZM.isEditable")
    public void setISOCOUNTRYCODEZMIsEditable(String iSOCOUNTRYCODEZMIsEditable) {
        this.iSOCOUNTRYCODEZMIsEditable = iSOCOUNTRYCODEZMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZW.value")
    public String getISOCOUNTRYCODEZWValue() {
        return iSOCOUNTRYCODEZWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZW.value")
    public void setISOCOUNTRYCODEZWValue(String iSOCOUNTRYCODEZWValue) {
        this.iSOCOUNTRYCODEZWValue = iSOCOUNTRYCODEZWValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZW.description")
    public String getISOCOUNTRYCODEZWDescription() {
        return iSOCOUNTRYCODEZWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZW.description")
    public void setISOCOUNTRYCODEZWDescription(String iSOCOUNTRYCODEZWDescription) {
        this.iSOCOUNTRYCODEZWDescription = iSOCOUNTRYCODEZWDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZW.isEditable")
    public String getISOCOUNTRYCODEZWIsEditable() {
        return iSOCOUNTRYCODEZWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ZW.isEditable")
    public void setISOCOUNTRYCODEZWIsEditable(String iSOCOUNTRYCODEZWIsEditable) {
        this.iSOCOUNTRYCODEZWIsEditable = iSOCOUNTRYCODEZWIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CX.value")
    public String getISOCOUNTRYCODECXValue() {
        return iSOCOUNTRYCODECXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CX.value")
    public void setISOCOUNTRYCODECXValue(String iSOCOUNTRYCODECXValue) {
        this.iSOCOUNTRYCODECXValue = iSOCOUNTRYCODECXValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.CX.description")
    public String getISOCOUNTRYCODECXDescription() {
        return iSOCOUNTRYCODECXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CX.description")
    public void setISOCOUNTRYCODECXDescription(String iSOCOUNTRYCODECXDescription) {
        this.iSOCOUNTRYCODECXDescription = iSOCOUNTRYCODECXDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.CX.isEditable")
    public String getISOCOUNTRYCODECXIsEditable() {
        return iSOCOUNTRYCODECXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.CX.isEditable")
    public void setISOCOUNTRYCODECXIsEditable(String iSOCOUNTRYCODECXIsEditable) {
        this.iSOCOUNTRYCODECXIsEditable = iSOCOUNTRYCODECXIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DJ.value")
    public String getISOCOUNTRYCODEDJValue() {
        return iSOCOUNTRYCODEDJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DJ.value")
    public void setISOCOUNTRYCODEDJValue(String iSOCOUNTRYCODEDJValue) {
        this.iSOCOUNTRYCODEDJValue = iSOCOUNTRYCODEDJValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DJ.description")
    public String getISOCOUNTRYCODEDJDescription() {
        return iSOCOUNTRYCODEDJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DJ.description")
    public void setISOCOUNTRYCODEDJDescription(String iSOCOUNTRYCODEDJDescription) {
        this.iSOCOUNTRYCODEDJDescription = iSOCOUNTRYCODEDJDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DJ.isEditable")
    public String getISOCOUNTRYCODEDJIsEditable() {
        return iSOCOUNTRYCODEDJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DJ.isEditable")
    public void setISOCOUNTRYCODEDJIsEditable(String iSOCOUNTRYCODEDJIsEditable) {
        this.iSOCOUNTRYCODEDJIsEditable = iSOCOUNTRYCODEDJIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DO.value")
    public String getISOCOUNTRYCODEDOValue() {
        return iSOCOUNTRYCODEDOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DO.value")
    public void setISOCOUNTRYCODEDOValue(String iSOCOUNTRYCODEDOValue) {
        this.iSOCOUNTRYCODEDOValue = iSOCOUNTRYCODEDOValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.DO.description")
    public String getISOCOUNTRYCODEDODescription() {
        return iSOCOUNTRYCODEDODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DO.description")
    public void setISOCOUNTRYCODEDODescription(String iSOCOUNTRYCODEDODescription) {
        this.iSOCOUNTRYCODEDODescription = iSOCOUNTRYCODEDODescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.DO.isEditable")
    public String getISOCOUNTRYCODEDOIsEditable() {
        return iSOCOUNTRYCODEDOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.DO.isEditable")
    public void setISOCOUNTRYCODEDOIsEditable(String iSOCOUNTRYCODEDOIsEditable) {
        this.iSOCOUNTRYCODEDOIsEditable = iSOCOUNTRYCODEDOIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EG.value")
    public String getISOCOUNTRYCODEEGValue() {
        return iSOCOUNTRYCODEEGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EG.value")
    public void setISOCOUNTRYCODEEGValue(String iSOCOUNTRYCODEEGValue) {
        this.iSOCOUNTRYCODEEGValue = iSOCOUNTRYCODEEGValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.EG.description")
    public String getISOCOUNTRYCODEEGDescription() {
        return iSOCOUNTRYCODEEGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EG.description")
    public void setISOCOUNTRYCODEEGDescription(String iSOCOUNTRYCODEEGDescription) {
        this.iSOCOUNTRYCODEEGDescription = iSOCOUNTRYCODEEGDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.EG.isEditable")
    public String getISOCOUNTRYCODEEGIsEditable() {
        return iSOCOUNTRYCODEEGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.EG.isEditable")
    public void setISOCOUNTRYCODEEGIsEditable(String iSOCOUNTRYCODEEGIsEditable) {
        this.iSOCOUNTRYCODEEGIsEditable = iSOCOUNTRYCODEEGIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ER.value")
    public String getISOCOUNTRYCODEERValue() {
        return iSOCOUNTRYCODEERValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ER.value")
    public void setISOCOUNTRYCODEERValue(String iSOCOUNTRYCODEERValue) {
        this.iSOCOUNTRYCODEERValue = iSOCOUNTRYCODEERValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ER.description")
    public String getISOCOUNTRYCODEERDescription() {
        return iSOCOUNTRYCODEERDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ER.description")
    public void setISOCOUNTRYCODEERDescription(String iSOCOUNTRYCODEERDescription) {
        this.iSOCOUNTRYCODEERDescription = iSOCOUNTRYCODEERDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ER.isEditable")
    public String getISOCOUNTRYCODEERIsEditable() {
        return iSOCOUNTRYCODEERIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ER.isEditable")
    public void setISOCOUNTRYCODEERIsEditable(String iSOCOUNTRYCODEERIsEditable) {
        this.iSOCOUNTRYCODEERIsEditable = iSOCOUNTRYCODEERIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FI.value")
    public String getISOCOUNTRYCODEFIValue() {
        return iSOCOUNTRYCODEFIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FI.value")
    public void setISOCOUNTRYCODEFIValue(String iSOCOUNTRYCODEFIValue) {
        this.iSOCOUNTRYCODEFIValue = iSOCOUNTRYCODEFIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FI.description")
    public String getISOCOUNTRYCODEFIDescription() {
        return iSOCOUNTRYCODEFIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FI.description")
    public void setISOCOUNTRYCODEFIDescription(String iSOCOUNTRYCODEFIDescription) {
        this.iSOCOUNTRYCODEFIDescription = iSOCOUNTRYCODEFIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FI.isEditable")
    public String getISOCOUNTRYCODEFIIsEditable() {
        return iSOCOUNTRYCODEFIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FI.isEditable")
    public void setISOCOUNTRYCODEFIIsEditable(String iSOCOUNTRYCODEFIIsEditable) {
        this.iSOCOUNTRYCODEFIIsEditable = iSOCOUNTRYCODEFIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FM.value")
    public String getISOCOUNTRYCODEFMValue() {
        return iSOCOUNTRYCODEFMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FM.value")
    public void setISOCOUNTRYCODEFMValue(String iSOCOUNTRYCODEFMValue) {
        this.iSOCOUNTRYCODEFMValue = iSOCOUNTRYCODEFMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.FM.description")
    public String getISOCOUNTRYCODEFMDescription() {
        return iSOCOUNTRYCODEFMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FM.description")
    public void setISOCOUNTRYCODEFMDescription(String iSOCOUNTRYCODEFMDescription) {
        this.iSOCOUNTRYCODEFMDescription = iSOCOUNTRYCODEFMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.FM.isEditable")
    public String getISOCOUNTRYCODEFMIsEditable() {
        return iSOCOUNTRYCODEFMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.FM.isEditable")
    public void setISOCOUNTRYCODEFMIsEditable(String iSOCOUNTRYCODEFMIsEditable) {
        this.iSOCOUNTRYCODEFMIsEditable = iSOCOUNTRYCODEFMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GB.value")
    public String getISOCOUNTRYCODEGBValue() {
        return iSOCOUNTRYCODEGBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GB.value")
    public void setISOCOUNTRYCODEGBValue(String iSOCOUNTRYCODEGBValue) {
        this.iSOCOUNTRYCODEGBValue = iSOCOUNTRYCODEGBValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GB.description")
    public String getISOCOUNTRYCODEGBDescription() {
        return iSOCOUNTRYCODEGBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GB.description")
    public void setISOCOUNTRYCODEGBDescription(String iSOCOUNTRYCODEGBDescription) {
        this.iSOCOUNTRYCODEGBDescription = iSOCOUNTRYCODEGBDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GB.isEditable")
    public String getISOCOUNTRYCODEGBIsEditable() {
        return iSOCOUNTRYCODEGBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GB.isEditable")
    public void setISOCOUNTRYCODEGBIsEditable(String iSOCOUNTRYCODEGBIsEditable) {
        this.iSOCOUNTRYCODEGBIsEditable = iSOCOUNTRYCODEGBIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GF.value")
    public String getISOCOUNTRYCODEGFValue() {
        return iSOCOUNTRYCODEGFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GF.value")
    public void setISOCOUNTRYCODEGFValue(String iSOCOUNTRYCODEGFValue) {
        this.iSOCOUNTRYCODEGFValue = iSOCOUNTRYCODEGFValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GF.description")
    public String getISOCOUNTRYCODEGFDescription() {
        return iSOCOUNTRYCODEGFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GF.description")
    public void setISOCOUNTRYCODEGFDescription(String iSOCOUNTRYCODEGFDescription) {
        this.iSOCOUNTRYCODEGFDescription = iSOCOUNTRYCODEGFDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GF.isEditable")
    public String getISOCOUNTRYCODEGFIsEditable() {
        return iSOCOUNTRYCODEGFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GF.isEditable")
    public void setISOCOUNTRYCODEGFIsEditable(String iSOCOUNTRYCODEGFIsEditable) {
        this.iSOCOUNTRYCODEGFIsEditable = iSOCOUNTRYCODEGFIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GI.value")
    public String getISOCOUNTRYCODEGIValue() {
        return iSOCOUNTRYCODEGIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GI.value")
    public void setISOCOUNTRYCODEGIValue(String iSOCOUNTRYCODEGIValue) {
        this.iSOCOUNTRYCODEGIValue = iSOCOUNTRYCODEGIValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GI.description")
    public String getISOCOUNTRYCODEGIDescription() {
        return iSOCOUNTRYCODEGIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GI.description")
    public void setISOCOUNTRYCODEGIDescription(String iSOCOUNTRYCODEGIDescription) {
        this.iSOCOUNTRYCODEGIDescription = iSOCOUNTRYCODEGIDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GI.isEditable")
    public String getISOCOUNTRYCODEGIIsEditable() {
        return iSOCOUNTRYCODEGIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GI.isEditable")
    public void setISOCOUNTRYCODEGIIsEditable(String iSOCOUNTRYCODEGIIsEditable) {
        this.iSOCOUNTRYCODEGIIsEditable = iSOCOUNTRYCODEGIIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GN.value")
    public String getISOCOUNTRYCODEGNValue() {
        return iSOCOUNTRYCODEGNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GN.value")
    public void setISOCOUNTRYCODEGNValue(String iSOCOUNTRYCODEGNValue) {
        this.iSOCOUNTRYCODEGNValue = iSOCOUNTRYCODEGNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GN.description")
    public String getISOCOUNTRYCODEGNDescription() {
        return iSOCOUNTRYCODEGNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GN.description")
    public void setISOCOUNTRYCODEGNDescription(String iSOCOUNTRYCODEGNDescription) {
        this.iSOCOUNTRYCODEGNDescription = iSOCOUNTRYCODEGNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GN.isEditable")
    public String getISOCOUNTRYCODEGNIsEditable() {
        return iSOCOUNTRYCODEGNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GN.isEditable")
    public void setISOCOUNTRYCODEGNIsEditable(String iSOCOUNTRYCODEGNIsEditable) {
        this.iSOCOUNTRYCODEGNIsEditable = iSOCOUNTRYCODEGNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GU.value")
    public String getISOCOUNTRYCODEGUValue() {
        return iSOCOUNTRYCODEGUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GU.value")
    public void setISOCOUNTRYCODEGUValue(String iSOCOUNTRYCODEGUValue) {
        this.iSOCOUNTRYCODEGUValue = iSOCOUNTRYCODEGUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GU.description")
    public String getISOCOUNTRYCODEGUDescription() {
        return iSOCOUNTRYCODEGUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GU.description")
    public void setISOCOUNTRYCODEGUDescription(String iSOCOUNTRYCODEGUDescription) {
        this.iSOCOUNTRYCODEGUDescription = iSOCOUNTRYCODEGUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GU.isEditable")
    public String getISOCOUNTRYCODEGUIsEditable() {
        return iSOCOUNTRYCODEGUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GU.isEditable")
    public void setISOCOUNTRYCODEGUIsEditable(String iSOCOUNTRYCODEGUIsEditable) {
        this.iSOCOUNTRYCODEGUIsEditable = iSOCOUNTRYCODEGUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GY.value")
    public String getISOCOUNTRYCODEGYValue() {
        return iSOCOUNTRYCODEGYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GY.value")
    public void setISOCOUNTRYCODEGYValue(String iSOCOUNTRYCODEGYValue) {
        this.iSOCOUNTRYCODEGYValue = iSOCOUNTRYCODEGYValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.GY.description")
    public String getISOCOUNTRYCODEGYDescription() {
        return iSOCOUNTRYCODEGYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GY.description")
    public void setISOCOUNTRYCODEGYDescription(String iSOCOUNTRYCODEGYDescription) {
        this.iSOCOUNTRYCODEGYDescription = iSOCOUNTRYCODEGYDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.GY.isEditable")
    public String getISOCOUNTRYCODEGYIsEditable() {
        return iSOCOUNTRYCODEGYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.GY.isEditable")
    public void setISOCOUNTRYCODEGYIsEditable(String iSOCOUNTRYCODEGYIsEditable) {
        this.iSOCOUNTRYCODEGYIsEditable = iSOCOUNTRYCODEGYIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HN.value")
    public String getISOCOUNTRYCODEHNValue() {
        return iSOCOUNTRYCODEHNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HN.value")
    public void setISOCOUNTRYCODEHNValue(String iSOCOUNTRYCODEHNValue) {
        this.iSOCOUNTRYCODEHNValue = iSOCOUNTRYCODEHNValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HN.description")
    public String getISOCOUNTRYCODEHNDescription() {
        return iSOCOUNTRYCODEHNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HN.description")
    public void setISOCOUNTRYCODEHNDescription(String iSOCOUNTRYCODEHNDescription) {
        this.iSOCOUNTRYCODEHNDescription = iSOCOUNTRYCODEHNDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HN.isEditable")
    public String getISOCOUNTRYCODEHNIsEditable() {
        return iSOCOUNTRYCODEHNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HN.isEditable")
    public void setISOCOUNTRYCODEHNIsEditable(String iSOCOUNTRYCODEHNIsEditable) {
        this.iSOCOUNTRYCODEHNIsEditable = iSOCOUNTRYCODEHNIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HU.value")
    public String getISOCOUNTRYCODEHUValue() {
        return iSOCOUNTRYCODEHUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HU.value")
    public void setISOCOUNTRYCODEHUValue(String iSOCOUNTRYCODEHUValue) {
        this.iSOCOUNTRYCODEHUValue = iSOCOUNTRYCODEHUValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.HU.description")
    public String getISOCOUNTRYCODEHUDescription() {
        return iSOCOUNTRYCODEHUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HU.description")
    public void setISOCOUNTRYCODEHUDescription(String iSOCOUNTRYCODEHUDescription) {
        this.iSOCOUNTRYCODEHUDescription = iSOCOUNTRYCODEHUDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.HU.isEditable")
    public String getISOCOUNTRYCODEHUIsEditable() {
        return iSOCOUNTRYCODEHUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.HU.isEditable")
    public void setISOCOUNTRYCODEHUIsEditable(String iSOCOUNTRYCODEHUIsEditable) {
        this.iSOCOUNTRYCODEHUIsEditable = iSOCOUNTRYCODEHUIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IE.value")
    public String getISOCOUNTRYCODEIEValue() {
        return iSOCOUNTRYCODEIEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IE.value")
    public void setISOCOUNTRYCODEIEValue(String iSOCOUNTRYCODEIEValue) {
        this.iSOCOUNTRYCODEIEValue = iSOCOUNTRYCODEIEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IE.description")
    public String getISOCOUNTRYCODEIEDescription() {
        return iSOCOUNTRYCODEIEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IE.description")
    public void setISOCOUNTRYCODEIEDescription(String iSOCOUNTRYCODEIEDescription) {
        this.iSOCOUNTRYCODEIEDescription = iSOCOUNTRYCODEIEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IE.isEditable")
    public String getISOCOUNTRYCODEIEIsEditable() {
        return iSOCOUNTRYCODEIEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IE.isEditable")
    public void setISOCOUNTRYCODEIEIsEditable(String iSOCOUNTRYCODEIEIsEditable) {
        this.iSOCOUNTRYCODEIEIsEditable = iSOCOUNTRYCODEIEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IN.value")
    public String getISOCOUNTRYCODEINValue() {
        return iSOCOUNTRYCODEINValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IN.value")
    public void setISOCOUNTRYCODEINValue(String iSOCOUNTRYCODEINValue) {
        this.iSOCOUNTRYCODEINValue = iSOCOUNTRYCODEINValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IN.description")
    public String getISOCOUNTRYCODEINDescription() {
        return iSOCOUNTRYCODEINDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IN.description")
    public void setISOCOUNTRYCODEINDescription(String iSOCOUNTRYCODEINDescription) {
        this.iSOCOUNTRYCODEINDescription = iSOCOUNTRYCODEINDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IN.isEditable")
    public String getISOCOUNTRYCODEINIsEditable() {
        return iSOCOUNTRYCODEINIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IN.isEditable")
    public void setISOCOUNTRYCODEINIsEditable(String iSOCOUNTRYCODEINIsEditable) {
        this.iSOCOUNTRYCODEINIsEditable = iSOCOUNTRYCODEINIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IR.value")
    public String getISOCOUNTRYCODEIRValue() {
        return iSOCOUNTRYCODEIRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IR.value")
    public void setISOCOUNTRYCODEIRValue(String iSOCOUNTRYCODEIRValue) {
        this.iSOCOUNTRYCODEIRValue = iSOCOUNTRYCODEIRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.IR.description")
    public String getISOCOUNTRYCODEIRDescription() {
        return iSOCOUNTRYCODEIRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IR.description")
    public void setISOCOUNTRYCODEIRDescription(String iSOCOUNTRYCODEIRDescription) {
        this.iSOCOUNTRYCODEIRDescription = iSOCOUNTRYCODEIRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.IR.isEditable")
    public String getISOCOUNTRYCODEIRIsEditable() {
        return iSOCOUNTRYCODEIRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.IR.isEditable")
    public void setISOCOUNTRYCODEIRIsEditable(String iSOCOUNTRYCODEIRIsEditable) {
        this.iSOCOUNTRYCODEIRIsEditable = iSOCOUNTRYCODEIRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JE.value")
    public String getISOCOUNTRYCODEJEValue() {
        return iSOCOUNTRYCODEJEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JE.value")
    public void setISOCOUNTRYCODEJEValue(String iSOCOUNTRYCODEJEValue) {
        this.iSOCOUNTRYCODEJEValue = iSOCOUNTRYCODEJEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JE.description")
    public String getISOCOUNTRYCODEJEDescription() {
        return iSOCOUNTRYCODEJEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JE.description")
    public void setISOCOUNTRYCODEJEDescription(String iSOCOUNTRYCODEJEDescription) {
        this.iSOCOUNTRYCODEJEDescription = iSOCOUNTRYCODEJEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JE.isEditable")
    public String getISOCOUNTRYCODEJEIsEditable() {
        return iSOCOUNTRYCODEJEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JE.isEditable")
    public void setISOCOUNTRYCODEJEIsEditable(String iSOCOUNTRYCODEJEIsEditable) {
        this.iSOCOUNTRYCODEJEIsEditable = iSOCOUNTRYCODEJEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JP.value")
    public String getISOCOUNTRYCODEJPValue() {
        return iSOCOUNTRYCODEJPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JP.value")
    public void setISOCOUNTRYCODEJPValue(String iSOCOUNTRYCODEJPValue) {
        this.iSOCOUNTRYCODEJPValue = iSOCOUNTRYCODEJPValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.JP.description")
    public String getISOCOUNTRYCODEJPDescription() {
        return iSOCOUNTRYCODEJPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JP.description")
    public void setISOCOUNTRYCODEJPDescription(String iSOCOUNTRYCODEJPDescription) {
        this.iSOCOUNTRYCODEJPDescription = iSOCOUNTRYCODEJPDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.JP.isEditable")
    public String getISOCOUNTRYCODEJPIsEditable() {
        return iSOCOUNTRYCODEJPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.JP.isEditable")
    public void setISOCOUNTRYCODEJPIsEditable(String iSOCOUNTRYCODEJPIsEditable) {
        this.iSOCOUNTRYCODEJPIsEditable = iSOCOUNTRYCODEJPIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KM.value")
    public String getISOCOUNTRYCODEKMValue() {
        return iSOCOUNTRYCODEKMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KM.value")
    public void setISOCOUNTRYCODEKMValue(String iSOCOUNTRYCODEKMValue) {
        this.iSOCOUNTRYCODEKMValue = iSOCOUNTRYCODEKMValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KM.description")
    public String getISOCOUNTRYCODEKMDescription() {
        return iSOCOUNTRYCODEKMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KM.description")
    public void setISOCOUNTRYCODEKMDescription(String iSOCOUNTRYCODEKMDescription) {
        this.iSOCOUNTRYCODEKMDescription = iSOCOUNTRYCODEKMDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KM.isEditable")
    public String getISOCOUNTRYCODEKMIsEditable() {
        return iSOCOUNTRYCODEKMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KM.isEditable")
    public void setISOCOUNTRYCODEKMIsEditable(String iSOCOUNTRYCODEKMIsEditable) {
        this.iSOCOUNTRYCODEKMIsEditable = iSOCOUNTRYCODEKMIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KR.value")
    public String getISOCOUNTRYCODEKRValue() {
        return iSOCOUNTRYCODEKRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KR.value")
    public void setISOCOUNTRYCODEKRValue(String iSOCOUNTRYCODEKRValue) {
        this.iSOCOUNTRYCODEKRValue = iSOCOUNTRYCODEKRValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.KR.description")
    public String getISOCOUNTRYCODEKRDescription() {
        return iSOCOUNTRYCODEKRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KR.description")
    public void setISOCOUNTRYCODEKRDescription(String iSOCOUNTRYCODEKRDescription) {
        this.iSOCOUNTRYCODEKRDescription = iSOCOUNTRYCODEKRDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.KR.isEditable")
    public String getISOCOUNTRYCODEKRIsEditable() {
        return iSOCOUNTRYCODEKRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.KR.isEditable")
    public void setISOCOUNTRYCODEKRIsEditable(String iSOCOUNTRYCODEKRIsEditable) {
        this.iSOCOUNTRYCODEKRIsEditable = iSOCOUNTRYCODEKRIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ME.value")
    public String getISOCOUNTRYCODEMEValue() {
        return iSOCOUNTRYCODEMEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ME.value")
    public void setISOCOUNTRYCODEMEValue(String iSOCOUNTRYCODEMEValue) {
        this.iSOCOUNTRYCODEMEValue = iSOCOUNTRYCODEMEValue;
    }

    @JsonProperty("ISOCOUNTRYCODE.ME.description")
    public String getISOCOUNTRYCODEMEDescription() {
        return iSOCOUNTRYCODEMEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ME.description")
    public void setISOCOUNTRYCODEMEDescription(String iSOCOUNTRYCODEMEDescription) {
        this.iSOCOUNTRYCODEMEDescription = iSOCOUNTRYCODEMEDescription;
    }

    @JsonProperty("ISOCOUNTRYCODE.ME.isEditable")
    public String getISOCOUNTRYCODEMEIsEditable() {
        return iSOCOUNTRYCODEMEIsEditable;
    }

    @JsonProperty("ISOCOUNTRYCODE.ME.isEditable")
    public void setISOCOUNTRYCODEMEIsEditable(String iSOCOUNTRYCODEMEIsEditable) {
        this.iSOCOUNTRYCODEMEIsEditable = iSOCOUNTRYCODEMEIsEditable;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
