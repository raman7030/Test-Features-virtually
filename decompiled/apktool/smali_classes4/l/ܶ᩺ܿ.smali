.class public final synthetic Ll/ܶ᩺ܿ;
.super Ljava/lang/Object;
.source "P70J"

# interfaces
.implements Ljava/util/function/LongSupplier;


# instance fields
.field public final synthetic ֫:Ll/᩶᩺ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶᩺ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩺ܿ;->֫:Ll/᩶᩺ܿ;

    return-void
.end method


# virtual methods
.method public final getAsLong()J
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܶ᩺ܿ;->֫:Ll/᩶᩺ܿ;

    invoke-virtual {v0}, Ll/᩶᩺ܿ;->getPosition()J

    move-result-wide v0

    return-wide v0
.end method
