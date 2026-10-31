.class public final synthetic Ll/ܶᩳܳ;
.super Ljava/lang/Object;
.source "J72H"

# interfaces
.implements Ll/ۨᩳܳ;


# instance fields
.field public final synthetic ֫:Ll/᩶ᩳܳ;

.field public final synthetic ۧ:I


# direct methods
.method public synthetic constructor <init>(Ll/᩶ᩳܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶᩳܳ;->֫:Ll/᩶ᩳܳ;

    iput p2, p0, Ll/ܶᩳܳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܶᩳܳ;->֫:Ll/᩶ᩳܳ;

    iget v1, p0, Ll/ܶᩳܳ;->ۧ:I

    invoke-static {v0, v1}, Ll/᩶ᩳܳ;->֫(Ll/᩶ᩳܳ;I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
