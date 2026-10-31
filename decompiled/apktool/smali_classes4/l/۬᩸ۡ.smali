.class public final synthetic Ll/۬᩸ۡ;
.super Ljava/lang/Object;
.source "Z6W9"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۗ᩸ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗ᩸ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩸ۡ;->᩸:Ll/ۗ᩸ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 112
    sget-object p1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    .line 113
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object p2, p0, Ll/۬᩸ۡ;->᩸:Ll/ۗ᩸ۡ;

    invoke-virtual {p2, p1}, Ll/ۗ᩸ۡ;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
