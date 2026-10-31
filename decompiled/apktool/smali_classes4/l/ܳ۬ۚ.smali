.class public abstract Ll/ܳ۬ۚ;
.super Ljava/lang/Object;
.source "D7CN"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:J

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/DataInputStream;)V
    .locals 3

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Ll/ܳ۬ۚ;->֫:I

    const/4 v0, 0x1

    .line 37
    iput v0, p0, Ll/ܳ۬ۚ;->ۧ:I

    .line 44
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    new-array v0, v0, [B

    .line 45
    invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->read([B)I

    .line 46
    new-instance v1, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v1, p0, Ll/ܳ۬ۚ;->ᩳ:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void
.end method
