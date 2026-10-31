.class public final Ll/۬֡᩵;
.super Ll/᩶֡᩵;
.source "79X7"


# static fields
.field public static final ܽ:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 33
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    sput-object v0, Ll/۬֡᩵;->ܽ:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 65
    sget-object v0, Ll/۬֡᩵;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 48
    invoke-direct {p0, p1}, Ll/۬֡᩵;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/16 v0, 0x9

    .line 40
    invoke-direct {p0, v0, p1}, Ll/᩶֡᩵;-><init>(I[B)V

    return-void
.end method
