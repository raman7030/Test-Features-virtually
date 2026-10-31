.class public final Ll/۬ܰܿ;
.super Ljava/lang/Object;
.source "F70U"

# interfaces
.implements Ll/ܳۧܳ;


# instance fields
.field public final ֫:I

.field public ۧ:Z

.field public final ܳ:Ll/ۗܰܿ;

.field public ܽ:J

.field public ܿ:I

.field public final ᩳ:Ljava/util/function/LongSupplier;

.field public final ᩻:Ll/۫ܰܿ;


# direct methods
.method public constructor <init>(Ll/۫ܰܿ;Ll/ۗܰܿ;Ll/ܶ᩺ܿ;I)V
    .locals 2

    .line 1056
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 1049
    iput-wide v0, p0, Ll/۬ܰܿ;->ܽ:J

    .line 1057
    iput-object p1, p0, Ll/۬ܰܿ;->᩻:Ll/۫ܰܿ;

    .line 1058
    iput-object p2, p0, Ll/۬ܰܿ;->ܳ:Ll/ۗܰܿ;

    .line 1059
    iput-object p3, p0, Ll/۬ܰܿ;->ᩳ:Ljava/util/function/LongSupplier;

    .line 1060
    iput p4, p0, Ll/۬ܰܿ;->֫:I

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 4

    .line 1104
    iget-boolean v0, p0, Ll/۬ܰܿ;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    .line 1107
    :cond_0
    iget-object v0, p0, Ll/۬ܰܿ;->᩻:Ll/۫ܰܿ;

    invoke-static {v0}, Ll/۫ܰܿ;->ۧ(Ll/۫ܰܿ;)V

    .line 1108
    iget v1, p0, Ll/۬ܰܿ;->ܿ:I

    iget v2, p0, Ll/۬ܰܿ;->֫:I

    if-ne v1, v2, :cond_1

    .line 1111
    iget-object v1, p0, Ll/۬ܰܿ;->ܳ:Ll/ۗܰܿ;

    iget-wide v2, p0, Ll/۬ܰܿ;->ܽ:J

    invoke-virtual {v1, v2, v3}, Ll/ۗܰܿ;->ۧ(J)V

    const/4 v1, 0x1

    .line 1112
    iput-boolean v1, p0, Ll/۬ܰܿ;->ۧ:Z

    .line 1113
    invoke-static {v0, p0}, Ll/۫ܰܿ;->֫(Ll/۫ܰܿ;Ll/۬ܰܿ;)V

    return-void

    .line 1109
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete hex restore delta entry"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final position()I
    .locals 1

    .line 1070
    iget v0, p0, Ll/۬ܰܿ;->ܿ:I

    return v0
.end method

.method public final ֫()Ll/ᩴܽܳ;
    .locals 1

    .line 1065
    iget-object v0, p0, Ll/۬ܰܿ;->ܳ:Ll/ۗܰܿ;

    return-object v0
.end method

.method public final ֫(I[B)V
    .locals 6

    .line 1076
    iget-boolean v0, p0, Ll/۬ܰܿ;->ۧ:Z

    if-nez v0, :cond_5

    .line 1079
    iget-object v0, p0, Ll/۬ܰܿ;->᩻:Ll/۫ܰܿ;

    invoke-static {v0}, Ll/۫ܰܿ;->ۧ(Ll/۫ܰܿ;)V

    .line 1080
    array-length p2, p2

    const/4 v0, 0x0

    invoke-static {p2, v0, p1}, Ll/ۡܽܳ;->ۧ(III)V

    if-nez p1, :cond_0

    return-void

    .line 1084
    :cond_0
    iget p2, p0, Ll/۬ܰܿ;->ܿ:I

    int-to-long v0, p2

    int-to-long v2, p1

    add-long/2addr v0, v2

    iget p2, p0, Ll/۬ܰܿ;->֫:I

    int-to-long v4, p2

    cmp-long p2, v0, v4

    if-gtz p2, :cond_4

    .line 1087
    iget-object p2, p0, Ll/۬ܰܿ;->ᩳ:Ljava/util/function/LongSupplier;

    invoke-interface {p2}, Ljava/util/function/LongSupplier;->getAsLong()J

    move-result-wide v0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_3

    sub-long/2addr v0, v2

    .line 1092
    iget-wide v2, p0, Ll/۬ܰܿ;->ܽ:J

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-gez p2, :cond_1

    .line 1093
    iput-wide v0, p0, Ll/۬ܰܿ;->ܽ:J

    goto :goto_0

    .line 1094
    :cond_1
    iget p2, p0, Ll/۬ܰܿ;->ܿ:I

    int-to-long v4, p2

    cmp-long p2, v0, v4

    if-ltz p2, :cond_2

    sub-long/2addr v0, v4

    cmp-long p2, v2, v0

    if-nez p2, :cond_2

    .line 1098
    :goto_0
    iget p2, p0, Ll/۬ܰܿ;->ܿ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/۬ܰܿ;->ܿ:I

    return-void

    .line 1096
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Non-contiguous hex checkpoint delta entry"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1089
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid hex checkpoint delta offset"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1085
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Hex restore delta exceeds entry length"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1077
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Hex restore delta entry is finished"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
