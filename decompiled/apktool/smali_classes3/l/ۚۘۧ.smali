.class public final Ll/ۚۘۧ;
.super Ll/ܶۘۧ;
.source "N8KV"


# static fields
.field public static final ᩴ:[B

.field public static final ᩵:[B


# instance fields
.field public ۘ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 36
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۚۘۧ;->᩵:[B

    new-array v0, v0, [B

    .line 37
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۚۘۧ;->ᩴ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
    .end array-data

    :array_1
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
    .end array-data
.end method

.method public static ֫(Ll/ᩳ֨֫;[B)Z
    .locals 4

    .line 133
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    array-length v1, p1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 136
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 137
    array-length v1, p1

    new-array v1, v1, [B

    .line 138
    array-length v3, p1

    invoke-virtual {p0, v2, v3, v1}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 139
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 140
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/ᩳ֨֫;)Z
    .locals 1

    .line 44
    sget-object v0, Ll/ۚۘۧ;->᩵:[B

    invoke-static {p0, v0}, Ll/ۚۘۧ;->֫(Ll/ᩳ֨֫;[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ᩳ֨֫;)J
    .locals 2

    .line 57
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    invoke-static {p1}, Ll/ۘ۫ۡ;->ۧ([B)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ܶۘۧ;->ۧ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 49
    invoke-super {p0, p1}, Ll/ܶۘۧ;->֫(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 51
    iput-boolean p1, p0, Ll/ۚۘۧ;->ۘ:Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;JLl/֨ۘۧ;)Z
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#3.format"
        }
        result = false
    .end annotation

    .line 64
    sget-object p2, Ll/ۚۘۧ;->᩵:[B

    invoke-static {p1, p2}, Ll/ۚۘۧ;->֫(Ll/ᩳ֨֫;[B)Z

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_1

    .line 65
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p2

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result p1

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    const/16 p2, 0x9

    .line 47
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    .line 67
    invoke-static {p1}, Ll/ۘ۫ۡ;->֫([B)Ljava/util/ArrayList;

    move-result-object p1

    .line 69
    iget-object v0, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "audio/ogg"

    .line 80
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v1, "audio/opus"

    .line 81
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ᩳ(I)V

    const p2, 0xbb80

    .line 83
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->۠(I)V

    .line 84
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 85
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    return p3

    .line 87
    :cond_1
    sget-object p2, Ll/ۚۘۧ;->ᩴ:[B

    invoke-static {p1, p2}, Ll/ۚۘۧ;->֫(Ll/ᩳ֨֫;[B)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 90
    iget-object p2, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    invoke-static {p2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 91
    iget-boolean p2, p0, Ll/ۚۘۧ;->ۘ:Z

    if-eqz p2, :cond_2

    goto :goto_0

    .line 99
    :cond_2
    iput-boolean p3, p0, Ll/ۚۘۧ;->ۘ:Z

    const/16 p2, 0x8

    .line 100
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 102
    invoke-static {p1, v0, v0}, Ll/᩸ۢۧ;->֫(Ll/ᩳ֨֫;ZZ)Ll/֨ۢۧ;

    move-result-object p1

    .line 105
    iget-object p1, p1, Ll/֨ۢۧ;->֫:[Ljava/lang/String;

    .line 106
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۢۧ;->֫(Ljava/util/List;)Ll/᩻᩵֫;

    move-result-object p1

    if-nez p1, :cond_3

    :goto_0
    return p3

    .line 110
    :cond_3
    iget-object p2, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    .line 113
    invoke-virtual {p2}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object p2

    iget-object v0, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    .line 114
    invoke-virtual {p1, v0}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 115
    invoke-virtual {p2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    return p3

    .line 120
    :cond_4
    iget-object p1, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    return v0
.end method
