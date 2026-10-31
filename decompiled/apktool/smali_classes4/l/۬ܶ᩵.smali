.class public final synthetic Ll/۬ܶ᩵;
.super Ljava/lang/Object;
.source "W7RE"

# interfaces
.implements Ll/᩵᩹᩵;


# instance fields
.field public final synthetic ᩸:[Ll/ܳ᩸᩵;

.field public final synthetic ᩹:Ll/ܳ᩶᩵;


# direct methods
.method public synthetic constructor <init>([Ll/ܳ᩸᩵;Ll/ܳ᩶᩵;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܶ᩵;->᩸:[Ll/ܳ᩸᩵;

    iput-object p2, p0, Ll/۬ܶ᩵;->᩹:Ll/ܳ᩶᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    check-cast p1, Ll/۠۠᩵;

    .line 4
    check-cast p2, Ll/ᩳ᩸᩵;

    const-string v0, "<unused var>"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "element"

    invoke-static {p2, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    iget-object p1, p0, Ll/۬ܶ᩵;->᩹:Ll/ܳ᩶᩵;

    iget v0, p1, Ll/ܳ᩶᩵;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p1, Ll/ܳ᩶᩵;->᩸:I

    iget-object p1, p0, Ll/۬ܶ᩵;->᩸:[Ll/ܳ᩸᩵;

    aput-object p2, p1, v0

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method
