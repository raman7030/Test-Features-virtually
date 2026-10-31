.class public final synthetic Ll/ۚۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Ll/֨ۙᩴ;

.field public final synthetic b:Ll/ۗۙᩴ;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ll/֨ۙᩴ;Ll/ۗۙᩴ;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۙᩴ;->a:Ll/֨ۙᩴ;

    iput-object p2, p0, Ll/ۚۙᩴ;->b:Ll/ۗۙᩴ;

    iput-wide p3, p0, Ll/ۚۙᩴ;->c:J

    iput p5, p0, Ll/ۚۙᩴ;->d:I

    iput p6, p0, Ll/ۚۙᩴ;->e:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Ll/ۖ᩶ᩴ;

    .line 3007
    iget-object v0, p0, Ll/ۚۙᩴ;->a:Ll/֨ۙᩴ;

    iget-object v1, p0, Ll/ۚۙᩴ;->b:Ll/ۗۙᩴ;

    iget-wide v2, p0, Ll/ۚۙᩴ;->c:J

    iget v4, p0, Ll/ۚۙᩴ;->d:I

    iget v5, p0, Ll/ۚۙᩴ;->e:I

    invoke-virtual/range {v0 .. v5}, Ll/֨ۙᩴ;->c(Ll/ۗۙᩴ;JII)I

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
