.class public final Ll/ܿۖۡ;
.super Ljava/lang/Object;
.source "T8W7"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤᩳ;


# direct methods
.method public constructor <init>(Ll/ۤۤᩳ;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۖۡ;->᩸:Ll/ۤۤᩳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ܿۖۡ;->᩸:Ll/ۤۤᩳ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
