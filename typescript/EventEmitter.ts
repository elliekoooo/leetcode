type Callback = (...args: any[]) => any;
type Subscription = {
    unsubscribe: () => void
}

class EventEmitter {
  events: any[] = [{}];

  subscribe(eventName: string, callback: Callback): Subscription {     
    if(this.events[eventName] == undefined)
      this.events[eventName] = [];

    this.events[eventName].push(callback);

    return {
      unsubscribe: () => {
        this.events[eventName]?.pop();
      }
    };
  }

  emit(eventName: string, args: any[] = []): any {
    return this.events[eventName]?.map(callback => callback(...args)) ?? [];
  }
}

