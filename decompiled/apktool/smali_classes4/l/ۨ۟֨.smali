.class public final synthetic Ll/ۨ۟֨;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ll/᩷ܽ۠;


# instance fields
.field public final synthetic ֫:Ll/᩹ܽ۠;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܽ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ۟֨;->֫:Ll/᩹ܽ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/ۤܶ۠;)Ll/ۛ֡֨;
    .locals 3

    .line 2094
    iget-object v0, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v0, v0, Ll/֨᩵۠;->ۨ:Ll/᩹᩵֨;

    .line 2095
    invoke-static {p2}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v1

    new-instance v2, Ll/ۧ֫۠;

    invoke-direct {v2, p2}, Ll/ۧ֫۠;-><init>(Ll/ۤܶ۠;)V

    invoke-virtual {v0, v1, v2}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2099
    new-instance v0, Ll/᩵ۧ۠;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۨ۟֨;->֫:Ll/᩹ܽ۠;

    invoke-direct {v0, v2, p1, v1, p2}, Ll/᩵ۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֫ۤ֨;ZLl/ۛ֡֨;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
