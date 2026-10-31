.class public final Ll/ܰۢۧ;
.super Ljava/lang/Object;
.source "28K7"

# interfaces
.implements Ll/᩶ۢۧ;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ܰۢۧ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/ܰۢۧ;
    .locals 3

    .line 24
    new-instance v0, Ll/ܰۢۧ;

    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    .line 510
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1, v2}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ll/ܰۢۧ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    const v0, 0x6e727473

    return v0
.end method
