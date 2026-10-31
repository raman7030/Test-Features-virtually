.class public final synthetic Ll/ᩳ᩷ۡ;
.super Ljava/lang/Object;
.source "HAWX"

# interfaces
.implements Ll/ۛ֡ۘ;


# instance fields
.field public final synthetic ֫:Ll/ܳ᩷ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ܳ᩷ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩷ۡ;->֫:Ll/ܳ᩷ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ֡ۘ;)V
    .locals 1

    .line 2
    sget v0, Ll/ܳ᩷ۡ;->ۧ֫:I

    .line 235
    invoke-virtual {p1}, Ll/ۨ֡ۘ;->ܽ()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Ll/ᩳ᩷ۡ;->֫:Ll/ܳ᩷ۡ;

    invoke-virtual {v0, p1}, Ll/ܳ᩷ۡ;->ۧ(F)V

    return-void
.end method
