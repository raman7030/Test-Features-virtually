.class public final synthetic Ll/֨᩺᩻;
.super Ljava/lang/Object;
.source "K78T"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/۠᩺᩻;

.field public final synthetic ᩹:Ll/ܳ᩻ۜ;


# direct methods
.method public synthetic constructor <init>(Ll/۠᩺᩻;Ll/ܳ᩻ۜ;JI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩺᩻;->᩸:Ll/۠᩺᩻;

    iput-object p2, p0, Ll/֨᩺᩻;->᩹:Ll/ܳ᩻ۜ;

    iput-wide p3, p0, Ll/֨᩺᩻;->᩶:J

    iput p5, p0, Ll/֨᩺᩻;->ۙ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-wide v0, p0, Ll/֨᩺᩻;->᩶:J

    iget v2, p0, Ll/֨᩺᩻;->ۙ:I

    iget-object v3, p0, Ll/֨᩺᩻;->᩸:Ll/۠᩺᩻;

    iget-object v4, p0, Ll/֨᩺᩻;->᩹:Ll/ܳ᩻ۜ;

    invoke-static {v3, v4, v0, v1, v2}, Ll/۠᩺᩻;->֫(Ll/۠᩺᩻;Ll/ܳ᩻ۜ;JI)V

    return-void
.end method
