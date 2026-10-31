.class public final synthetic Ll/ۨ᩸֨;
.super Ljava/lang/Object;
.source "T57T"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۢ᩹֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ᩹֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩸֨;->᩸:Ll/ۢ᩹֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 729
    new-instance v0, Ll/ۚܶ۠;

    iget-object v1, p0, Ll/ۨ᩸֨;->᩸:Ll/ۢ᩹֨;

    iget-object v2, v1, Ll/ۢ᩹֨;->᩻:Ll/ۘ᩹֨;

    iget-object v2, v2, Ll/ۘ᩹֨;->ۢ:Ll/᩹ܶ۠;

    new-instance v3, Ll/ۚ᩺֨;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Ll/ۚ᩺֨;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v2, v3}, Ll/ۚܶ۠;-><init>(Ll/᩹ܶ۠;Ljava/util/function/Predicate;)V

    return-object v0
.end method
