.class public final synthetic Ll/ܰ᩹ܿ;
.super Ljava/lang/Object;
.source "N17O"

# interfaces
.implements Ll/ܳ᩹ܿ;


# instance fields
.field public final synthetic ֫:Ll/᩵᩶ܿ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:J


# direct methods
.method public synthetic constructor <init>(Ll/᩵᩶ܿ;IJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩹ܿ;->֫:Ll/᩵᩶ܿ;

    iput p2, p0, Ll/ܰ᩹ܿ;->ۧ:I

    iput-wide p3, p0, Ll/ܰ᩹ܿ;->ܽ:J

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 4

    .line 0
    iget v0, p0, Ll/ܰ᩹ܿ;->ۧ:I

    iget-wide v1, p0, Ll/ܰ᩹ܿ;->ܽ:J

    iget-object v3, p0, Ll/ܰ᩹ܿ;->֫:Ll/᩵᩶ܿ;

    invoke-static {v3, v0, v1, v2}, Ll/᩵᩶ܿ;->ۧ(Ll/᩵᩶ܿ;IJ)V

    return-void
.end method
