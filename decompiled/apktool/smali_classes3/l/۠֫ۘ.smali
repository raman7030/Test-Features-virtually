.class public abstract Ll/۠֫ۘ;
.super Ljava/lang/Object;
.source "99EG"

# interfaces
.implements Ll/ۚܰۖ;


# instance fields
.field public ֫:Ll/֡֫ۘ;

.field public ۧ:Ll/ۚ֫ۘ;


# direct methods
.method public constructor <init>(Ll/ۚ֫ۘ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/۠֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    return-void
.end method

.method public constructor <init>(Ll/ۚ֫ۘ;Ll/֡֫ۘ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/۠֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    .line 38
    iput-object p2, p0, Ll/۠֫ۘ;->֫:Ll/֡֫ۘ;

    .line 47
    invoke-interface {p1, p2}, Ll/ۚ֫ۘ;->֫(Ll/֡֫ۘ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۚ֫ۘ;[B)V
    .locals 1

    .line 33
    new-instance v0, Ll/֡֫ۘ;

    .line 42
    invoke-direct {v0, p2}, Ll/ۤܰۖ;-><init>([B)V

    .line 33
    invoke-direct {p0, p1, v0}, Ll/۠֫ۘ;-><init>(Ll/ۚ֫ۘ;Ll/֡֫ۘ;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֡֫ۘ;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/۠֫ۘ;->֫:Ll/֡֫ۘ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚ֫ۘ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/۠֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    return-object v0
.end method
