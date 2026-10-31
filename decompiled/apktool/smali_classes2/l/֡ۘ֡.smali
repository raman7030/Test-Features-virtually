.class public Ll/֡ۘ֡;
.super Ll/۬ۖ֡;
.source "FAH1"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ֫֫:Ll/ۖ᩹ᩴ;

.field public static final ۟:Ll/ۖ᩹ᩴ;

.field public static final ۧ֫:Ll/ۖ᩹ᩴ;

.field public static final ܰ:Ljava/lang/String;

.field public static final ܳ֫:Ll/ۖ᩹ᩴ;

.field public static final ܽ֫:Ll/ۖ᩹ᩴ;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ܿ֫:Ll/ۖ᩹ᩴ;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ᩳ֫:Ll/ۖ᩹ᩴ;


# instance fields
.field public ۗ:I

.field public ۙ:Z

.field public ۛ:Ll/ۖ᩹ᩴ;

.field public ۤ:Ll/ۖ᩹ᩴ;

.field public ۨ:Z

.field public ۫:Ll/ۖ᩹ᩴ;

.field public ۬:I

.field public ᩶:Ll/ۖ᩹ᩴ;

.field public ᩸:Ll/ۖ᩹ᩴ;

.field public ᩹:Ljava/lang/String;

.field public ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-wide/16 v0, -0x1

    .line 65
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v2

    sput-object v2, Ll/֡ۘ֡;->֫֫:Ll/ۖ᩹ᩴ;

    const-wide/32 v2, 0x1b7740

    .line 85
    invoke-static {v2, v3}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v4

    sput-object v4, Ll/֡ۘ֡;->ۧ֫:Ll/ۖ᩹ᩴ;

    .line 97
    invoke-static {v2, v3}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v2

    sput-object v2, Ll/֡ۘ֡;->ܽ֫:Ll/ۖ᩹ᩴ;

    .line 119
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v2

    sput-object v2, Ll/֡ۘ֡;->ܿ֫:Ll/ۖ᩹ᩴ;

    .line 129
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v2

    sput-object v2, Ll/֡ۘ֡;->ᩳ֫:Ll/ۖ᩹ᩴ;

    const-wide/16 v2, 0x2710

    .line 149
    invoke-static {v2, v3}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v2

    sput-object v2, Ll/֡ۘ֡;->۟:Ll/ۖ᩹ᩴ;

    .line 206
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/֡ۘ֡;->ܳ֫:Ll/ۖ᩹ᩴ;

    .line 245
    const-class v0, Ll/ۧۘ֡;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֡ۘ֡;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    sget-object v0, Ll/֡ۘ֡;->֫֫:Ll/ۖ᩹ᩴ;

    iput-object v0, p0, Ll/֡ۘ֡;->۫:Ll/ۖ᩹ᩴ;

    .line 253
    sget-object v0, Ll/֡ۘ֡;->ܽ֫:Ll/ۖ᩹ᩴ;

    iput-object v0, p0, Ll/֡ۘ֡;->ۤ:Ll/ۖ᩹ᩴ;

    .line 255
    sget-object v0, Ll/֡ۘ֡;->۟:Ll/ۖ᩹ᩴ;

    iput-object v0, p0, Ll/֡ۘ֡;->᩶:Ll/ۖ᩹ᩴ;

    .line 257
    sget-object v0, Ll/֡ۘ֡;->ܿ֫:Ll/ۖ᩹ᩴ;

    iput-object v0, p0, Ll/֡ۘ֡;->ۛ:Ll/ۖ᩹ᩴ;

    .line 263
    sget-object v0, Ll/֡ۘ֡;->ܰ:Ljava/lang/String;

    iput-object v0, p0, Ll/֡ۘ֡;->᩹:Ljava/lang/String;

    const/4 v0, 0x0

    .line 267
    iput-boolean v0, p0, Ll/֡ۘ֡;->ۨ:Z

    .line 271
    iput-boolean v0, p0, Ll/֡ۘ֡;->᩺:Z

    .line 273
    sget-object v0, Ll/֡ۘ֡;->ܳ֫:Ll/ۖ᩹ᩴ;

    iput-object v0, p0, Ll/֡ۘ֡;->᩸:Ll/ۖ᩹ᩴ;

    const/4 v0, 0x1

    .line 277
    iput-boolean v0, p0, Ll/֡ۘ֡;->ۙ:Z

    const/16 v0, 0x8

    .line 60
    iput v0, p0, Ll/֡ۘ֡;->ۗ:I

    .line 62
    iput v0, p0, Ll/֡ۘ֡;->۬:I

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 76
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۘ֡;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 78
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final ֡()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 546
    iget-object v0, p0, Ll/֡ۘ֡;->ۛ:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ֫()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 654
    iget-object v0, p0, Ll/֡ۘ֡;->᩸:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 144
    iput p1, p0, Ll/֡ۘ֡;->ۗ:I

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "lifo="

    .line 1053
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 1054
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", fairness="

    .line 1055
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 1056
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", maxWaitDuration="

    .line 1057
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1058
    iget-object v2, p0, Ll/֡ۘ֡;->۫:Ll/ۖ᩹ᩴ;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", minEvictableIdleTime="

    .line 1059
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1060
    iget-object v2, p0, Ll/֡ۘ֡;->ۤ:Ll/ۖ᩹ᩴ;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", softMinEvictableIdleTime="

    .line 1061
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1062
    iget-object v2, p0, Ll/֡ۘ֡;->ۛ:Ll/ۖ᩹ᩴ;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", numTestsPerEvictionRun="

    .line 1063
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    .line 1064
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", evictionPolicyClassName="

    .line 1065
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1066
    iget-object v2, p0, Ll/֡ۘ֡;->᩹:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", testOnCreate="

    .line 1067
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1068
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", testOnBorrow="

    .line 1069
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1070
    iget-boolean v2, p0, Ll/֡ۘ֡;->ۨ:Z

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", testOnReturn="

    .line 1071
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1072
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", testWhileIdle="

    .line 1073
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    iget-boolean v2, p0, Ll/֡ۘ֡;->᩺:Z

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", timeBetweenEvictionRuns="

    .line 1075
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    iget-object v2, p0, Ll/֡ۘ֡;->᩸:Ll/ۖ᩹ᩴ;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", blockWhenExhausted="

    .line 1077
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", jmxEnabled="

    .line 1079
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1080
    iget-boolean v0, p0, Ll/֡ۘ֡;->ۙ:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", jmxNamePrefix="

    .line 1081
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "pool"

    .line 1082
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", jmxNameBase="

    .line 1083
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 1084
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", minIdlePerKey="

    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maxIdlePerKey="

    .line 191
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    iget v0, p0, Ll/֡ۘ֡;->ۗ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maxTotalPerKey="

    .line 193
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    iget v0, p0, Ll/֡ۘ֡;->۬:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maxTotal="

    .line 195
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, -0x1

    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ۖ᩹ᩴ;)V
    .locals 1

    .line 891
    sget-object v0, Ll/֡ۘ֡;->ܽ֫:Ll/ۖ᩹ᩴ;

    invoke-static {p1, v0}, Ll/۬ۘ֡;->֫(Ll/ۖ᩹ᩴ;Ll/ۖ᩹ᩴ;)Ll/ۖ᩹ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۘ֡;->ۤ:Ll/ۖ᩹ᩴ;

    return-void
.end method

.method public final ۖ()I
    .locals 1

    .line 118
    iget v0, p0, Ll/֡ۘ֡;->۬:I

    return v0
.end method

.method public final ۗ()V
    .locals 1

    const/4 v0, 0x1

    .line 971
    iput-boolean v0, p0, Ll/֡ۘ֡;->ۨ:Z

    return-void
.end method

.method public final ۘ()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 452
    iget-object v0, p0, Ll/֡ۘ֡;->۫:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ۜ()I
    .locals 1

    .line 92
    iget v0, p0, Ll/֡ۘ֡;->ۗ:I

    return v0
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x1

    .line 1015
    iput-boolean v0, p0, Ll/֡ۘ֡;->᩺:Z

    return-void
.end method

.method public final ۧ(Ll/ۖ᩹ᩴ;)V
    .locals 1

    .line 938
    sget-object v0, Ll/֡ۘ֡;->ܿ֫:Ll/ۖ᩹ᩴ;

    invoke-static {p1, v0}, Ll/۬ۘ֡;->֫(Ll/ۖ᩹ᩴ;Ll/ۖ᩹ᩴ;)Ll/ۖ᩹ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۘ֡;->ۛ:Ll/ۖ᩹ᩴ;

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 398
    iget-boolean v0, p0, Ll/֡ۘ֡;->ۙ:Z

    return v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 595
    iget-boolean v0, p0, Ll/֡ۘ֡;->ۨ:Z

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 325
    iget-object v0, p0, Ll/֡ۘ֡;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 170
    iput p1, p0, Ll/֡ۘ֡;->۬:I

    return-void
.end method

.method public final ܽ(Ll/ۖ᩹ᩴ;)V
    .locals 1

    .line 1031
    sget-object v0, Ll/֡ۘ֡;->ܳ֫:Ll/ۖ᩹ᩴ;

    invoke-static {p1, v0}, Ll/۬ۘ֡;->֫(Ll/ۖ᩹ᩴ;Ll/ۖ᩹ᩴ;)Ll/ۖ᩹ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۘ֡;->᩸:Ll/ۖ᩹ᩴ;

    return-void
.end method

.method public final ᩳ()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/֡ۘ֡;->᩶:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ᩵()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 483
    iget-object v0, p0, Ll/֡ۘ֡;->ۤ:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ᩶()V
    .locals 1

    const/4 v0, 0x0

    .line 806
    iput-boolean v0, p0, Ll/֡ۘ֡;->ۙ:Z

    return-void
.end method

.method public final ᩹()Z
    .locals 1

    .line 639
    iget-boolean v0, p0, Ll/֡ۘ֡;->᩺:Z

    return v0
.end method
