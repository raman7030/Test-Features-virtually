.class public final Ll/۠ܽۘ;
.super Ljava/lang/Object;
.source "HAFC"

# interfaces
.implements Ll/ۖܽۘ;


# instance fields
.field public final synthetic ֫:Ll/ܶܽۘ;

.field public final synthetic ۧ:Ll/ܽۧۘ;


# direct methods
.method public constructor <init>(Ll/ܶܽۘ;Ll/ܽۧۘ;)V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ܽۘ;->֫:Ll/ܶܽۘ;

    iput-object p2, p0, Ll/۠ܽۘ;->ۧ:Ll/ܽۧۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۧۘ;)Ljava/lang/Object;
    .locals 5

    .line 142
    iget-object v0, p0, Ll/۠ܽۘ;->ۧ:Ll/ܽۧۘ;

    invoke-virtual {p1, v0}, Ll/ܽۧۘ;->֫(Ll/ܽۧۘ;)Z

    move-result v1

    iget-object v2, p0, Ll/۠ܽۘ;->֫:Ll/ܶܽۘ;

    if-nez v1, :cond_0

    .line 143
    invoke-static {}, Ll/ܶܽۘ;->ۜ()Ll/֫᩻֨;

    move-result-object v1

    const-string v3, "Re-routing the connection to host {}"

    invoke-virtual {p1}, Ll/ܽۧۘ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-virtual {v2, p1}, Ll/ܶܽۘ;->֫(Ll/ܽۧۘ;)Ll/ܶܽۘ;

    move-result-object v2

    .line 146
    :cond_0
    invoke-virtual {p1, v0}, Ll/ܽۧۘ;->ۧ(Ll/ܽۧۘ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    invoke-virtual {p1}, Ll/ܽۧۘ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ܶܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
