.class public final Ll/۠ᩴ۠;
.super Ljava/lang/Object;
.source "T3ZT"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܽ:Ljava/util/Set;


# direct methods
.method public constructor <init>(ZZLjava/util/Set;Ll/֨ᩴ۠;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-boolean p1, p0, Ll/۠ᩴ۠;->ۧ:Z

    .line 67
    iput-boolean p2, p0, Ll/۠ᩴ۠;->֫:Z

    .line 68
    iput-object p3, p0, Ll/۠ᩴ۠;->ܽ:Ljava/util/Set;

    .line 70
    sget-object p1, Ll/ۧ֡֨;->᩷֫:Ll/ۧ֡֨;

    iget-object p2, p4, Ll/֨ᩴ۠;->ۖ֫:Ll/ܽ֡֨;

    invoke-virtual {p1, p2}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 75
    iget-boolean v0, p0, Ll/۠ᩴ۠;->֫:Z

    .line 76
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/۠ᩴ۠;->ۧ:Z

    .line 78
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    iget-object v3, p0, Ll/۠ᩴ۠;->ܽ:Ljava/util/Set;

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "[errorRaised=%b, rootElements=%s, processingOver=%b]"

    .line 75
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/۠ᩴ۠;->ܽ:Ljava/util/Set;

    return-object v0
.end method
