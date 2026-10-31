.class public final Ll/۬ۧ۠;
.super Ljava/lang/Object;
.source "A451"


# instance fields
.field public final ֫:Ll/ܽܶ۠;

.field public final ۧ:Ll/ۙ֨֨;

.field public final ܽ:Ll/ܽܽ۠;

.field public final ᩳ:Ll/ۛ֡֨;


# direct methods
.method public constructor <init>(Ll/ܽܽ۠;Ll/ۛ֡֨;Ll/ܽܶ۠;Ll/ۙ֨֨;)V
    .locals 0

    .line 4984
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4985
    iput-object p1, p0, Ll/۬ۧ۠;->ܽ:Ll/ܽܽ۠;

    .line 4986
    iput-object p2, p0, Ll/۬ۧ۠;->ᩳ:Ll/ۛ֡֨;

    .line 4987
    iput-object p3, p0, Ll/۬ۧ۠;->֫:Ll/ܽܶ۠;

    .line 4988
    iput-object p4, p0, Ll/۬ۧ۠;->ۧ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 4992
    iget-object v0, p0, Ll/۬ۧ۠;->ۧ:Ll/ۙ֨֨;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
