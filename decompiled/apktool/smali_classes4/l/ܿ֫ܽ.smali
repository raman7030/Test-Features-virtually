.class public Ll/ܿ֫ܽ;
.super Ljava/lang/Object;
.source "46YU"

# interfaces
.implements Ll/᩹ۡ᩵;


# instance fields
.field public final ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿ֫ܽ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public size()I
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܿ֫ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public ֫(I[B)I
    .locals 4

    const/4 v0, 0x3

    int-to-long v0, v0

    .line 60
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 62
    iget-object v1, p0, Ll/ܿ֫ܽ;->᩸:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const/4 v2, 0x0

    .line 63
    array-length v3, v1

    invoke-static {v1, v2, p2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    array-length v1, v1

    add-int/2addr v0, v1

    const-wide/16 v1, 0x0

    .line 65
    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, v0, 0x2

    sub-int/2addr v0, p1

    return v0
.end method

.method public ֫(I)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܿ֫ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setForceDark(I)V

    return-void
.end method

.method public ܽ()V
    .locals 2

    .line 115
    iget-object v0, p0, Ll/ܿ֫ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setAlgorithmicDarkeningAllowed(Z)V

    return-void
.end method

.method public ᩳ()V
    .locals 2

    .line 101
    iget-object v0, p0, Ll/ܿ֫ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setForceDarkBehavior(I)V

    return-void
.end method
