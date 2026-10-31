.class public final Ll/ۖܽܽ;
.super Ljava/lang/Object;
.source "FAO8"

# interfaces
.implements Lorg/xmlpull/v1/XmlSerializer;


# static fields
.field public static final ᩳ:[B


# instance fields
.field public ֫:Ll/ᩴܽܽ;

.field public ۧ:I

.field public ܽ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 71
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖܽܽ;->ᩳ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x58t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 105
    iput v0, p0, Ll/ۖܽܽ;->ۧ:I

    return-void
.end method

.method public static ֫()V
    .locals 2

    .line 401
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Namespaces are not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ(ILjava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 113
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    or-int/lit8 p1, p1, 0x20

    invoke-virtual {v0, p1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 114
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->writeUTF(Ljava/lang/String;)V

    return-void

    .line 116
    :cond_0
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    or-int/lit8 p1, p1, 0x10

    invoke-virtual {p2, p1}, Ll/ᩴܽܽ;->writeByte(I)V

    return-void
.end method


# virtual methods
.method public final attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 1

    if-eqz p1, :cond_1

    .line 200
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ۖܽܽ;->֫()V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    if-nez p3, :cond_2

    .line 202
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 p3, 0x1f

    invoke-virtual {p1, p3}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 203
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    return-object p0

    .line 205
    :cond_2
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 206
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 207
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p3}, Ll/ᩴܽܽ;->writeUTF(Ljava/lang/String;)V

    return-object p0
.end method

.method public final cdsect(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    .line 332
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-void
.end method

.method public final comment(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x9

    .line 347
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-void
.end method

.method public final docdecl(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xa

    .line 352
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-void
.end method

.method public final endDocument()V
    .locals 2

    .line 157
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 158
    invoke-virtual {p0}, Ll/ۖܽܽ;->flush()V

    return-void
.end method

.method public final endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 1

    if-eqz p1, :cond_1

    .line 191
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ۖܽܽ;->֫()V

    const/4 p1, 0x0

    throw p1

    .line 192
    :cond_1
    :goto_0
    iget p1, p0, Ll/ۖܽܽ;->ۧ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۖܽܽ;->ۧ:I

    .line 193
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v0, 0x33

    invoke-virtual {p1, v0}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 194
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    return-object p0
.end method

.method public final entityRef(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    .line 337
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0}, Ll/ᩴܽܽ;->flush()V

    return-void
.end method

.method public final getDepth()I
    .locals 1

    .line 163
    iget v0, p0, Ll/ۖܽܽ;->ۧ:I

    return v0
.end method

.method public final getFeature(Ljava/lang/String;)Z
    .locals 0

    .line 373
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 174
    iget-object v0, p0, Ll/ۖܽܽ;->ܽ:[Ljava/lang/String;

    iget v1, p0, Ll/ۖܽܽ;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getNamespace()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final getPrefix(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    .line 397
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 385
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ignorableWhitespace(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x7

    .line 357
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-void
.end method

.method public final processingInstruction(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x8

    .line 342
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-void
.end method

.method public final setFeature(Ljava/lang/String;Z)V
    .locals 0

    const-string p2, "http://xmlpull.org/v1/doc/features.html#indent-output"

    .line 363
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 367
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 122
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 126
    :cond_1
    :goto_0
    new-instance p2, Ll/ᩴܽܽ;

    invoke-direct {p2, p1}, Ll/ᩴܽܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    .line 127
    sget-object p1, Ll/ۖܽܽ;->ᩳ:[B

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 89
    invoke-virtual {p2, p1, v1, v0}, Ll/ᩴܽܽ;->write([BII)V

    .line 129
    iput v1, p0, Ll/ۖܽܽ;->ۧ:I

    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/String;

    .line 130
    iput-object p1, p0, Ll/ۖܽܽ;->ܽ:[Ljava/lang/String;

    return-void
.end method

.method public final setOutput(Ljava/io/Writer;)V
    .locals 0

    .line 135
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setPrefix(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 391
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 379
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 146
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 149
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 150
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 152
    :cond_3
    :goto_1
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 p2, 0x10

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->writeByte(I)V

    return-void
.end method

.method public final startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 2

    if-eqz p1, :cond_1

    .line 179
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ۖܽܽ;->֫()V

    const/4 p1, 0x0

    throw p1

    .line 180
    :cond_1
    :goto_0
    iget p1, p0, Ll/ۖܽܽ;->ۧ:I

    iget-object v0, p0, Ll/ۖܽܽ;->ܽ:[Ljava/lang/String;

    array-length v1, v0

    if-ne p1, v1, :cond_2

    shr-int/lit8 v1, p1, 0x1

    add-int/2addr p1, v1

    .line 181
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ۖܽܽ;->ܽ:[Ljava/lang/String;

    .line 183
    :cond_2
    iget-object p1, p0, Ll/ۖܽܽ;->ܽ:[Ljava/lang/String;

    iget v0, p0, Ll/ۖܽܽ;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۖܽܽ;->ۧ:I

    aput-object p2, p1, v0

    .line 184
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v0, 0x32

    invoke-virtual {p1, v0}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 185
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    return-object p0
.end method

.method public final text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 1

    const/4 v0, 0x4

    .line 326
    invoke-direct {p0, v0, p1}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-object p0
.end method

.method public final text([CII)Lorg/xmlpull/v1/XmlSerializer;
    .locals 1

    .line 320
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    const/4 p1, 0x4

    invoke-direct {p0, p1, v0}, Ll/ۖܽܽ;->ܽ(ILjava/lang/String;)V

    return-object p0
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 2

    .line 248
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x6f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 249
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 250
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p2, p1}, Ll/ᩴܽܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(JLjava/lang/String;)V
    .locals 2

    .line 268
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x8f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 269
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p3}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 270
    iget-object p3, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p3, p1, p2}, Ll/ᩴܽܽ;->writeLong(J)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;D)V
    .locals 2

    .line 298
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0xbf

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 299
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 300
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2, p3}, Ll/ᩴܽܽ;->writeDouble(D)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;F)V
    .locals 2

    .line 288
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0xaf

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 289
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 290
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->writeFloat(F)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 216
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 217
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 218
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 309
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v0, 0xcf

    invoke-virtual {p2, v0}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 310
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p2, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 312
    :cond_0
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v0, 0xdf

    invoke-virtual {p2, v0}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 313
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p2, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)V
    .locals 2

    .line 237
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 238
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 239
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    array-length v0, p2

    invoke-virtual {p1, v0}, Ll/ᩴܽܽ;->writeShort(I)V

    .line 240
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 89
    array-length v1, p2

    invoke-virtual {p1, p2, v0, v1}, Ll/ᩴܽܽ;->write([BII)V

    return-void
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 2

    .line 258
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 259
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p2}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 260
    iget-object p2, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p2, p1}, Ll/ᩴܽܽ;->writeInt(I)V

    return-void
.end method

.method public final ۧ(JLjava/lang/String;)V
    .locals 2

    .line 278
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x9f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 279
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p3}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 280
    iget-object p3, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p3, p1, p2}, Ll/ᩴܽܽ;->writeLong(J)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;[B)V
    .locals 2

    .line 226
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    const/16 v1, 0x4f

    invoke-virtual {v0, v1}, Ll/ᩴܽܽ;->writeByte(I)V

    .line 227
    iget-object v0, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {v0, p1}, Ll/ᩴܽܽ;->֫(Ljava/lang/String;)V

    .line 228
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    array-length v0, p2

    invoke-virtual {p1, v0}, Ll/ᩴܽܽ;->writeShort(I)V

    .line 229
    iget-object p1, p0, Ll/ۖܽܽ;->֫:Ll/ᩴܽܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 89
    array-length v1, p2

    invoke-virtual {p1, p2, v0, v1}, Ll/ᩴܽܽ;->write([BII)V

    return-void
.end method
