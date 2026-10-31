.class public final Ll/ۖۘۧ;
.super Ll/ܶۘۧ;
.source "C8R0"


# instance fields
.field public ۘ:Ll/ܺۘۧ;

.field public ᩴ:Ll/ۛ᩷ۧ;


# virtual methods
.method public final ֫(Ll/ᩳ֨֫;)J
    .locals 4

    .line 69
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 64
    aget-byte v0, v0, v1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 110
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/4 v2, 0x2

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x4

    shr-int/2addr v0, v2

    const/4 v3, 0x6

    if-eq v0, v3, :cond_0

    const/4 v3, 0x7

    if-ne v0, v3, :cond_1

    .line 113
    :cond_0
    invoke-virtual {p1, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 114
    invoke-virtual {p1}, Ll/ᩳ֨֫;->۬()J

    .line 116
    :cond_1
    invoke-static {v0, p1}, Ll/ۗ᩷ۧ;->֫(ILl/ᩳ֨֫;)I

    move-result v0

    .line 117
    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    int-to-long v0, v0

    return-wide v0

    :cond_2
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 56
    invoke-super {p0, p1}, Ll/ܶۘۧ;->֫(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Ll/ۖۘۧ;->ᩴ:Ll/ۛ᩷ۧ;

    .line 59
    iput-object p1, p0, Ll/ۖۘۧ;->ۘ:Ll/ܺۘۧ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;JLl/֨ۘۧ;)Z
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#3.format"
        }
        result = false
    .end annotation

    .line 78
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    .line 79
    iget-object v1, p0, Ll/ۖۘۧ;->ᩴ:Ll/ۛ᩷ۧ;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 81
    new-instance p2, Ll/ۛ᩷ۧ;

    const/16 p3, 0x11

    invoke-direct {p2, v0, p3}, Ll/ۛ᩷ۧ;-><init>([BI)V

    .line 82
    iput-object p2, p0, Ll/ۖۘۧ;->ᩴ:Ll/ۛ᩷ۧ;

    const/16 p3, 0x9

    .line 83
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result p1

    invoke-static {v0, p3, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const/4 p3, 0x0

    .line 84
    invoke-virtual {p2, p1, p3}, Ll/ۛ᩷ۧ;->֫([BLl/᩻᩵֫;)Ll/۠ᩴ֫;

    move-result-object p1

    .line 85
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object p1

    const-string p2, "audio/ogg"

    invoke-virtual {p1, p2}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    return v2

    :cond_0
    const/4 v3, 0x0

    .line 89
    aget-byte v0, v0, v3

    and-int/lit8 v4, v0, 0x7f

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    .line 90
    invoke-static {p1}, Ll/۬᩷ۧ;->֫(Ll/ᩳ֨֫;)Ll/ۤ᩷ۧ;

    move-result-object p1

    .line 91
    invoke-virtual {v1, p1}, Ll/ۛ᩷ۧ;->֫(Ll/ۤ᩷ۧ;)Ll/ۛ᩷ۧ;

    move-result-object p2

    .line 92
    iput-object p2, p0, Ll/ۖۘۧ;->ᩴ:Ll/ۛ᩷ۧ;

    .line 93
    new-instance p3, Ll/ܺۘۧ;

    invoke-direct {p3, p2, p1}, Ll/ܺۘۧ;-><init>(Ll/ۛ᩷ۧ;Ll/ۤ᩷ۧ;)V

    iput-object p3, p0, Ll/ۖۘۧ;->ۘ:Ll/ܺۘۧ;

    return v2

    :cond_1
    const/4 p1, -0x1

    if-ne v0, p1, :cond_3

    .line 98
    iget-object p1, p0, Ll/ۖۘۧ;->ۘ:Ll/ܺۘۧ;

    if-eqz p1, :cond_2

    .line 99
    invoke-virtual {p1, p2, p3}, Ll/ܺۘۧ;->ۧ(J)V

    .line 100
    iget-object p1, p0, Ll/ۖۘۧ;->ۘ:Ll/ܺۘۧ;

    iput-object p1, p4, Ll/֨ۘۧ;->ۧ:Ll/ܺۘۧ;

    .line 102
    :cond_2
    iget-object p1, p4, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v3

    :cond_3
    return v2
.end method
