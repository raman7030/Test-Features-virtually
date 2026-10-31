.class public final Ll/ۤܺۢ;
.super Ljava/lang/Object;
.source "V75S"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "neededLibraries"

    .line 79
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->ܿ:I

    const-string v0, "sections"

    .line 80
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->᩻:I

    const-string v0, "segments"

    .line 81
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->ۜ:I

    const-string v0, "imports"

    .line 82
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->ܽ:I

    const-string v0, "symbols"

    .line 83
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->᩷:I

    const-string v0, "entries"

    .line 84
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->֫:I

    const-string v0, "initArray"

    .line 85
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->ᩳ:I

    const-string v0, "finiArray"

    .line 86
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤܺۢ;->ۧ:I

    const-string v0, "relocations"

    .line 87
    invoke-static {p1, v0}, Ll/ۤܺۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۤܺۢ;->ܳ:I

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 98
    :cond_0
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۤܺۢ;
    .locals 1

    .line 94
    new-instance v0, Ll/ۤܺۢ;

    invoke-direct {v0, p0}, Ll/ۤܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
