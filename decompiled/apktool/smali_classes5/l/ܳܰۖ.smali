.class public final Ll/ܳܰۖ;
.super Ll/ۢܰۖ;
.source "W9ED"


# static fields
.field public static final ۢ:Ll/֫᩻֨;


# instance fields
.field public ֫:Ljava/util/EnumSet;

.field public ۜ:I

.field public ۧ:[B

.field public ܳ:Ljava/lang/String;

.field public ܽ:Ll/ۡܰۖ;

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:Ll/᩵ܰۖ;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Ll/ܳܰۖ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܳܰۖ;->ۢ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NtlmChallenge{\n  targetName=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳܰۖ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',\n  negotiateFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۖ;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  serverChallenge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۖ;->ۧ:[B

    .line 125
    invoke-static {v1}, Ll/֨ܰۖ;->֫([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۖ;->᩷:Ll/᩵ܰۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  targetInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۖ;->ܽ:Ll/ۡܰۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/EnumSet;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ܳܰۖ;->֫:Ljava/util/EnumSet;

    return-object v0
.end method

.method public final ֫(Ll/۫ܰۖ;)V
    .locals 5

    .line 46
    sget-object v0, Ll/۠ܰۖ;->ܿ:Ljava/nio/charset/Charset;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    .line 85
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    iput v0, p0, Ll/ܳܰۖ;->ۜ:I

    const/4 v0, 0x2

    .line 86
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 87
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v2

    iput v2, p0, Ll/ܳܰۖ;->᩻:I

    .line 49
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v2

    const-class v4, Ll/᩷ܰۖ;

    invoke-static {v2, v3, v4}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v2

    iput-object v2, p0, Ll/ܳܰۖ;->֫:Ljava/util/EnumSet;

    new-array v2, v1, [B

    .line 293
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 50
    iput-object v2, p0, Ll/ܳܰۖ;->ۧ:[B

    .line 51
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ܿ(I)V

    .line 91
    iget-object v2, p0, Ll/ܳܰۖ;->֫:Ljava/util/EnumSet;

    sget-object v3, Ll/᩷ܰۖ;->ᩳ֫:Ll/᩷ܰۖ;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 92
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v2

    iput v2, p0, Ll/ܳܰۖ;->ܿ:I

    .line 93
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 94
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v2

    iput v2, p0, Ll/ܳܰۖ;->ᩳ:I

    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ܿ(I)V

    .line 75
    :goto_0
    iget-object v2, p0, Ll/ܳܰۖ;->֫:Ljava/util/EnumSet;

    sget-object v3, Ll/᩷ܰۖ;->ܳ֫:Ll/᩷ܰۖ;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 76
    new-instance v1, Ll/᩵ܰۖ;

    invoke-direct {v1}, Ll/᩵ܰۖ;-><init>()V

    invoke-virtual {v1, p1}, Ll/᩵ܰۖ;->֫(Ll/۫ܰۖ;)V

    iput-object v1, p0, Ll/ܳܰۖ;->᩷:Ll/᩵ܰۖ;

    .line 77
    sget-object v2, Ll/ܳܰۖ;->ۢ:Ll/֫᩻֨;

    const-string v3, "Windows version = {}"

    invoke-interface {v2, v1, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ܿ(I)V

    .line 67
    :goto_1
    iget v1, p0, Ll/ܳܰۖ;->ۜ:I

    if-lez v1, :cond_2

    .line 69
    iget v1, p0, Ll/ܳܰۖ;->᩻:I

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 70
    sget-object v1, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    iget v2, p0, Ll/ܳܰۖ;->ۜ:I

    div-int/2addr v2, v0

    invoke-virtual {p1, v2, v1}, Ll/ۤܰۖ;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܰۖ;->ܳ:Ljava/lang/String;

    .line 59
    :cond_2
    iget v0, p0, Ll/ܳܰۖ;->ܿ:I

    if-lez v0, :cond_3

    .line 61
    iget v0, p0, Ll/ܳܰۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 62
    new-instance v0, Ll/ۡܰۖ;

    invoke-direct {v0}, Ll/ۡܰۖ;-><init>()V

    invoke-virtual {v0, p1}, Ll/ۡܰۖ;->֫(Ll/۫ܰۖ;)V

    iput-object v0, p0, Ll/ܳܰۖ;->ܽ:Ll/ۡܰۖ;

    :cond_3
    return-void
.end method

.method public final ۧ()[B
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܳܰۖ;->ۧ:[B

    return-object v0
.end method

.method public final ܽ()Ll/ۡܰۖ;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ܳܰۖ;->ܽ:Ll/ۡܰۖ;

    return-object v0
.end method

.method public final ܿ()Ll/᩵ܰۖ;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ܳܰۖ;->᩷:Ll/᩵ܰۖ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ܳܰۖ;->ܳ:Ljava/lang/String;

    return-object v0
.end method
