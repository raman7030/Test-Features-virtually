.class public final Ll/۬ۘ֨;
.super Ll/᩺ۘ֨;
.source "07MC"


# instance fields
.field public final synthetic ᩹:Ll/۫ۘ֨;


# direct methods
.method public constructor <init>(Ll/۫ۘ֨;Ll/ۜ֡֨;)V
    .locals 0

    .line 74
    iput-object p1, p0, Ll/۬ۘ֨;->᩹:Ll/۫ۘ֨;

    invoke-direct {p0, p2}, Ll/᩺ۘ֨;-><init>(Ll/ۜ֡֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/۬ۘ֨;->᩹:Ll/۫ۘ֨;

    invoke-static {v0}, Ll/۫ۘ֨;->֫(Ll/۫ۘ֨;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-super {p0, p1}, Ll/᩺ۘ֨;->֫(Ll/ۛ֡֨;)V

    return-void
.end method
