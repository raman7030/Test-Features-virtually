.class public final Ll/ᩴۛܺ;
.super Ll/֨᩶ܺ;
.source "T5OR"


# instance fields
.field public final synthetic ۗ:Ljava/util/Set;

.field public final synthetic ۙ:Ljava/util/Set;

.field public final ᩶:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 918
    iput-object p1, p0, Ll/ᩴۛܺ;->ۙ:Ljava/util/Set;

    iput-object p2, p0, Ll/ᩴۛܺ;->ۗ:Ljava/util/Set;

    invoke-direct {p0}, Ll/֨᩶ܺ;-><init>()V

    .line 919
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴۛܺ;->᩶:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 923
    :cond_0
    iget-object v0, p0, Ll/ᩴۛܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 924
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 925
    iget-object v1, p0, Ll/ᩴۛܺ;->ۗ:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 929
    :cond_1
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    const/4 v0, 0x0

    return-object v0
.end method
