.class public final synthetic Ll/ۢۢᩳ;
.super Ljava/lang/Object;
.source "U8VQ"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۘۢᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘۢᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۢᩳ;->᩸:Ll/ۘۢᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ll/ۢۢᩳ;->᩸:Ll/ۘۢᩳ;

    invoke-virtual {v0, p1}, Ll/ۘۢᩳ;->֫(I)V

    return-void
.end method
