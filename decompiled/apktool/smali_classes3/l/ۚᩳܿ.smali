.class public final synthetic Ll/ۚᩳܿ;
.super Ljava/lang/Object;
.source "N7PP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/᩷۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚᩳܿ;->᩸:Ll/᩷۠ᩴ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 143
    new-instance v0, Ll/ۗ᩹ᩳ;

    invoke-static {}, Ll/ۜ֡ᩳ;->֫()Ll/֨۬ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۚᩳܿ;->᩸:Ll/᩷۠ᩴ;

    invoke-direct {v0, v3, v1, v2}, Ll/ۗ᩹ᩳ;-><init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)V

    return-object v0
.end method
