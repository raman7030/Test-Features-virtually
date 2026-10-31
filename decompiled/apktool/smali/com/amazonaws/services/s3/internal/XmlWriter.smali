.class public Lcom/amazonaws/services/s3/internal/XmlWriter;
.super Ljava/lang/Object;
.source "XmlWriter.java"


# instance fields
.field public ֫:Ljava/lang/StringBuilder;

.field public ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->ۧ:Ljava/util/ArrayList;

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 92
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->ۧ:Ljava/util/ArrayList;

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/String;

    const-string v1, "</"

    const-string v2, ">"

    .line 0
    iget-object v3, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫:Ljava/lang/StringBuilder;

    invoke-static {v3, v1, v0, v2}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    const-string v0, "<"

    const-string v1, ">"

    .line 0
    iget-object v2, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫:Ljava/lang/StringBuilder;

    invoke-static {v2, v0, p1, v1}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 6

    if-nez p1, :cond_0

    const-string p1, ""

    .line 141
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 142
    :goto_0
    iget-object v3, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫:Ljava/lang/StringBuilder;

    if-ge v1, v0, :cond_a

    .line 143
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x9

    if-eq v4, v5, :cond_7

    const/16 v5, 0xa

    if-eq v4, v5, :cond_6

    const/16 v5, 0xd

    if-eq v4, v5, :cond_5

    const/16 v5, 0x22

    if-eq v4, v5, :cond_4

    const/16 v5, 0x26

    if-eq v4, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_2

    const/16 v5, 0x3e

    if-eq v4, v5, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    const-string v4, "&gt;"

    goto :goto_1

    :cond_2
    const-string v4, "&lt;"

    goto :goto_1

    :cond_3
    const-string v4, "&amp;"

    goto :goto_1

    :cond_4
    const-string v4, "&quot;"

    goto :goto_1

    :cond_5
    const-string v4, "&#13;"

    goto :goto_1

    :cond_6
    const-string v4, "&#10;"

    goto :goto_1

    :cond_7
    const-string v4, "&#9;"

    :goto_1
    if-eqz v4, :cond_9

    if-ge v2, v1, :cond_8

    .line 177
    invoke-virtual {v3, p1, v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 178
    :cond_8
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v1, 0x1

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_a
    if-ge v2, v1, :cond_b

    .line 185
    invoke-virtual {v3, p1, v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_b
    return-void
.end method

.method public final ۧ()[B
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 103
    sget-object v1, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method
