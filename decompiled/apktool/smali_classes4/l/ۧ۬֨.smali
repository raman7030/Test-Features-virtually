.class public final synthetic Ll/ۧ۬֨;
.super Ljava/lang/Object;
.source "542M"

# interfaces
.implements Ll/ܽᩴ֨;


# instance fields
.field public final synthetic ֫:Ll/ܶ۬֨;

.field public final synthetic ۧ:Ll/ۗ۠۠;

.field public final synthetic ܽ:Ll/ۛ֡֨;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ll/ۛ֡֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ۬֨;->֫:Ll/ܶ۬֨;

    iput-object p2, p0, Ll/ۧ۬֨;->ۧ:Ll/ۗ۠۠;

    iput-object p3, p0, Ll/ۧ۬֨;->ܽ:Ll/ۛ֡֨;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 3590
    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4426
    new-instance v0, Ll/ۧܶ۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۧ۬֨;->ܽ:Ll/ۛ֡֨;

    aput-object v3, v1, v2

    const-string v2, "compiler"

    const-string v3, "is.preview.reflective"

    invoke-direct {v0, v2, v3, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3590
    iget-object v1, p0, Ll/ۧ۬֨;->֫:Ll/ܶ۬֨;

    iget-object v2, p0, Ll/ۧ۬֨;->ۧ:Ll/ۗ۠۠;

    invoke-virtual {v1, v2, v0}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void
.end method
