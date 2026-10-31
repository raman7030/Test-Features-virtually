.class public final synthetic Ll/۟ۤ᩻;
.super Ljava/lang/Object;
.source "76WC"

# interfaces
.implements Ll/ܽܶܺ;
.implements Ll/ܶۚ֫;
.implements Ll/۠ۚ֫;
.implements Ll/۟ܶۧ;
.implements Ll/ۜۖۢ;
.implements Ll/ܿܶܽ;
.implements Ll/᩷ܿۖ;


# direct methods
.method public static ֫(ILjava/lang/String;)C
    .locals 1

    .line 0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0
.end method

.method public static ֫(IIII)I
    .locals 0

    sub-int/2addr p0, p1

    .line 1
    div-int/2addr p0, p2

    add-int/2addr p0, p3

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 2
    invoke-virtual {p0, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/Object;)Ljava/security/cert/Extension;
    .locals 0

    .line 0
    check-cast p0, Ljava/security/cert/Extension;

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/᩶֡֫;

    .line 35
    iget p1, p1, Ll/᩶֡֫;->ۚ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ll/֨۬֫;

    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(II)I
    .locals 1

    const p1, -0xb8b8b9

    if-ne p2, p1, :cond_0

    .line 628
    sget p1, Ll/᩹֡᩷;->ۢ:I

    const v0, 0x3f59999a    # 0.85f

    invoke-static {p1, p2, v0}, Ll/۟ۗ;->֫(IIF)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 0

    .line 0
    invoke-static {}, Ll/ۖۙ᩷;->ۢ֫()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫()V
    .locals 1

    const-string v0, "mt-radare2"

    .line 55
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;Ll/ۚᩴ֫;)V
    .locals 0

    .line 0
    check-cast p1, Ll/֨۬֫;

    return-void
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 381
    new-instance v0, Ll/᩻ܿۖ;

    invoke-direct {v0}, Ll/᩻ܿۖ;-><init>()V

    return-object v0
.end method
