.class public final Ll/ᩴۧۘ;
.super Ljava/lang/Object;
.source "54F8"


# instance fields
.field public ֫:J

.field public final ۧ:Ljava/util/UUID;

.field public final ܳ:Ll/ܿ۟ۖ;

.field public final ܽ:Z

.field public ܿ:Ll/֨֫ۘ;

.field public final ᩳ:J

.field public final ᩻:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/֨֫ۘ;JLjava/util/UUID;Z)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ᩴۧۘ;->ܿ:Ll/֨֫ۘ;

    .line 56
    iput-wide p2, p0, Ll/ᩴۧۘ;->ᩳ:J

    .line 57
    iput-object p4, p0, Ll/ᩴۧۘ;->ۧ:Ljava/util/UUID;

    .line 58
    iput-boolean p5, p0, Ll/ᩴۧۘ;->ܽ:Z

    .line 60
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Ll/ᩴۧۘ;->᩻:Ljava/util/Date;

    .line 61
    new-instance p1, Ll/ܿ۟ۖ;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Ll/ۧۧۘ;->᩸:Ll/ܽ۟ۖ;

    invoke-direct {p1, p2}, Ll/ܿ۟ۖ;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ᩴۧۘ;->ܳ:Ll/ܿ۟ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 65
    iget-wide v0, p0, Ll/ᩴۧۘ;->֫:J

    return-wide v0
.end method

.method public final ֫(Ll/֫۟ۖ;)Ll/ۧ۟ۖ;
    .locals 3

    .line 82
    new-instance v0, Ll/ۧ۟ۖ;

    iget-object v1, p0, Ll/ᩴۧۘ;->ܳ:Ll/ܿ۟ۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    new-instance v2, Ll/ܳ۟ۖ;

    invoke-direct {v2, v1}, Ll/ܳ۟ۖ;-><init>(Ll/ܿ۟ۖ;)V

    .line 82
    invoke-direct {v0, v2, p1}, Ll/ۧ۟ۖ;-><init>(Ll/ܳ۟ۖ;Ll/֫۟ۖ;)V

    return-object v0
.end method

.method public final ֫(J)V
    .locals 0

    .line 69
    iput-wide p1, p0, Ll/ᩴۧۘ;->֫:J

    return-void
.end method

.method public final ۧ()Ljava/util/UUID;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ᩴۧۘ;->ۧ:Ljava/util/UUID;

    return-object v0
.end method

.method public final ܳ()Ljava/util/Date;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ᩴۧۘ;->᩻:Ljava/util/Date;

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 77
    iget-wide v0, p0, Ll/ᩴۧۘ;->ᩳ:J

    return-wide v0
.end method

.method public final ܿ()Ll/ܿ۟ۖ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ᩴۧۘ;->ܳ:Ll/ܿ۟ۖ;

    return-object v0
.end method

.method public final ᩳ()Ll/֨֫ۘ;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ᩴۧۘ;->ܿ:Ll/֨֫ۘ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 133
    iget-boolean v0, p0, Ll/ᩴۧۘ;->ܽ:Z

    return v0
.end method
