.class public final Ll/ܽᩳܺ;
.super Ljava/lang/Object;
.source "5BHG"

# interfaces
.implements Ll/ۧۡܺ;


# instance fields
.field public final synthetic ֫:Ll/ۡᩳܺ;

.field public final synthetic ۧ:Ll/᩷ᩴܺ;


# direct methods
.method public constructor <init>(Ll/ۡᩳܺ;Ll/᩷ᩴܺ;)V
    .locals 0

    .line 1396
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽᩳܺ;->֫:Ll/ۡᩳܺ;

    iput-object p2, p0, Ll/ܽᩳܺ;->ۧ:Ll/᩷ᩴܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۡܺ;)V
    .locals 1

    .line 1399
    iget-object v0, p0, Ll/ܽᩳܺ;->֫:Ll/ۡᩳܺ;

    invoke-static {v0, p1}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;Ll/ܽۡܺ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1400
    iget-object v0, p0, Ll/ܽᩳܺ;->ۧ:Ll/᩷ᩴܺ;

    invoke-virtual {p1}, Ll/ܽۡܺ;->֫()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩷ᩴܺ;->add(I)V

    :cond_0
    return-void
.end method
