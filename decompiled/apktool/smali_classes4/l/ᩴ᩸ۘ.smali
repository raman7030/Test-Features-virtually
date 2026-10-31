.class public final Ll/ᩴ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ֫:Ljava/lang/String;

.field public static ۧ:I

.field public static ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tencent"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    const-string v2, "msflogs"

    const-string v3, "com"

    .line 0
    invoke-static {v0, v1, v2, v1, v3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "tencent"

    const-string v3, "mobileqq"

    invoke-static {v0, v1, v2, v1, v3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩸ۘ;->֫:Ljava/lang/String;

    const/16 v0, 0x400

    .line 39
    sput v0, Ll/ᩴ᩸ۘ;->ۧ:I

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Ll/ۜܶۘ;->֫:Ljava/lang/String;

    const-string v3, "logs"

    .line 0
    invoke-static {v0, v2, v1, v3}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    sput-object v0, Ll/ᩴ᩸ۘ;->ܽ:Ljava/lang/String;

    return-void
.end method
