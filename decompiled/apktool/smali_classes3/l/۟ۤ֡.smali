.class public final Ll/۟ۤ֡;
.super Ljava/io/Writer;
.source "J76H"


# static fields
.field public static final ᩶:Ll/ܰۤ֡;


# instance fields
.field public final ᩸:Ll/ۨۖܽ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Ll/ܰۤ֡;

    .line 78
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 12
    sput-object v0, Ll/۟ۤ֡;->᩶:Ll/ܰۤ֡;

    return-void
.end method

.method public constructor <init>(Ll/ۨۖܽ;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 21
    iput-object p1, p0, Ll/۟ۤ֡;->᩸:Ll/ۨۖܽ;

    return-void
.end method

.method private ۧ(C)V
    .locals 3

    .line 70
    iget v0, p0, Ll/۟ۤ֡;->᩹:I

    iget-object v1, p0, Ll/۟ۤ֡;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v1}, Ll/ۨۖܽ;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget v0, p0, Ll/۟ۤ֡;->᩹:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/۟ۤ֡;->᩹:I

    invoke-virtual {v1, v0}, Ll/ۨۖܽ;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    .line 71
    :cond_0
    sget-object p1, Ll/۟ۤ֡;->᩶:Ll/ܰۤ֡;

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final write(I)V
    .locals 0

    int-to-char p1, p1

    .line 26
    invoke-direct {p0, p1}, Ll/۟ۤ֡;->ۧ(C)V

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ll/۟ۤ֡;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 1

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Ll/۟ۤ֡;->ۧ(C)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final write([CII)V
    .locals 1

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    .line 33
    aget-char v0, p1, p2

    invoke-direct {p0, v0}, Ll/۟ۤ֡;->ۧ(C)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 64
    iget v0, p0, Ll/۟ۤ֡;->᩹:I

    iget-object v1, p0, Ll/۟ۤ֡;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v1}, Ll/ۨۖܽ;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 65
    :cond_0
    sget-object v0, Ll/۟ۤ֡;->᩶:Ll/ܰۤ֡;

    throw v0
.end method
