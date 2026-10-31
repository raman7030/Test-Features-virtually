.class public final Ll/֨ܺۢ;
.super Ljava/lang/Object;
.source "W74O"

# interfaces
.implements Ll/۠ܺۢ;


# instance fields
.field public final ֫:I

.field public final ۜ:J

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:I

.field public final ܿ:J

.field public final ᩳ:J

.field public final ᩻:J


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 7

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "arrayName"

    const-string v1, ""

    .line 19
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨ܺۢ;->ۧ:Ljava/lang/String;

    const-string v0, "arrayIndex"

    const/4 v2, 0x0

    .line 20
    invoke-virtual {p1, v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/֨ܺۢ;->֫:I

    const-string v0, "slotVirtualAddress"

    const-wide/16 v3, 0x0

    .line 21
    invoke-static {p1, v0, v3, v4}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v5

    iput-wide v5, p0, Ll/֨ܺۢ;->ܿ:J

    const-string v0, "slotPhysicalAddress"

    .line 22
    invoke-static {p1, v0, v3, v4}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v5

    iput-wide v5, p0, Ll/֨ܺۢ;->ᩳ:J

    const-string v0, "targetVirtualAddress"

    .line 23
    invoke-static {p1, v0, v3, v4}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v5

    iput-wide v5, p0, Ll/֨ܺۢ;->ۜ:J

    const-string v0, "targetPhysicalAddress"

    .line 24
    invoke-static {p1, v0, v3, v4}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/֨ܺۢ;->᩻:J

    const-string v0, "targetInstructionMode"

    .line 25
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨ܺۢ;->ܳ:Ljava/lang/String;

    const-string v0, "pointerSize"

    .line 26
    invoke-virtual {p1, v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Ll/֨ܺۢ;->ܽ:I

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/֨ܺۢ;
    .locals 1

    .line 33
    new-instance v0, Ll/֨ܺۢ;

    invoke-direct {v0, p0}, Ll/֨ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
